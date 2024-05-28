package icx.service.impl;

import icx.application.main.sub.passenger.AddPassenger;
import icx.application.main.sub.passenger.ManagePassenger;
import icx.loggers.PassengerLogger;
import icx.model.MySQL;
import icx.model.Passenger;
import icx.service.PassengerSevice;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PassengerSeviceIMPL implements PassengerSevice {

    @Override
    public void loadPassengerStatus(JComboBox statusComboBox) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        Vector data = new Vector();
        data.add("SELECT");
        data.add("ACTIVE");
        data.add("INACTIVE");

        model.addAll(data);
        model.setSelectedItem("SELECT");

        statusComboBox.setModel(model);
    }

    @Override
    public void openAddPassenger(JPanel parent) {
        AddPassenger addPassenger = new AddPassenger(parent);
        addPassenger.setVisible(true);
    }

    @Override
    public ManagePassenger openManagePassenger(JPanel parent) {
        ManagePassenger managePassenger = new ManagePassenger(parent);
        managePassenger.setVisible(true);
        return managePassenger;
    }

    @Override
    public boolean loadPassengers(String text, JTable passengerTable) {
        boolean isFound = false;

        String query = "SELECT * FROM `passenger`";
        if (!text.isEmpty()) {
            query += "WHERE `fname` LIKE '%" + text + "%' OR `lname` LIKE '%" + text + "%' OR `passport_id` LIKE '%" + text + "%'";
        }

        try {
            ResultSet resultSet = MySQL.execute(query);

            DefaultTableModel model = (DefaultTableModel) passengerTable.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                isFound = true;
                Vector rowData = new Vector();
                rowData.add(resultSet.getInt("p_id"));
                rowData.add(resultSet.getString("passport_id"));
                rowData.add(resultSet.getString("fname"));
                rowData.add(resultSet.getString("lname"));
                rowData.add(resultSet.getString("status"));

                model.addRow(rowData);
            }

        } catch (SQLException ex) {
            PassengerLogger.logger.log(Level.SEVERE, "SQLException in Passenger INSERT: \n" + ex.getMessage(), ex.getMessage());
            //Logger.getLogger(UpdatePassenger.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isFound;

    }

    @Override
    public void updatePassenger(Passenger passengerDTO, JDialog parent) {

        Thread t = new Thread(() -> {
            try {
                MySQL.execute("UPDATE `passenger` SET "
                        + "`fname` = '" + passengerDTO.getFname() + "', "
                        + "`lname` = '" + passengerDTO.getLname() + "', "
                        + "`passport_id` = '" + passengerDTO.getPassport() + "', "
                        + "`status` = '" + passengerDTO.getStatus() + "'"
                        + "WHERE `p_id` = '" + passengerDTO.getId() + "'");

                PassengerLogger.logger.log(Level.INFO, "Passenger Updated: " + passengerDTO, passengerDTO);

                JOptionPane.showMessageDialog(parent, "Passenger updated successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                PassengerLogger.logger.log(Level.SEVERE, "SQLException in Passenger UPDATE: \n" + ex.getMessage() + " \nPassenger: " + passengerDTO, ex.getMessage());

                JOptionPane.showMessageDialog(parent, "Passenger updating failed. Check your database connectivity", "Failed", JOptionPane.ERROR_MESSAGE);
            }
        });
        t.start();
    }

    @Override
    public void addPassenger(Passenger passengerDTO, JDialog parent) {
        Thread t = new Thread(() -> {
            try {
                MySQL.execute("INSERT INTO `passenger`(`fname`, `lname`, `passport_id`, `status`) VALUES ('" + passengerDTO.getFname() + "','" + passengerDTO.getLname() + "','" + passengerDTO.getPassport() + "', '" + passengerDTO.getStatus() + "')");

                PassengerLogger.logger.log(Level.INFO, "Passenger Added: " + passengerDTO, passengerDTO);

                JOptionPane.showMessageDialog(parent, "Passenger added successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                PassengerLogger.logger.log(Level.SEVERE, "SQLException in Passenger INSERT: \n" + ex.getMessage() + " \nPassenger: " + passengerDTO, ex.getMessage());

                JOptionPane.showMessageDialog(parent, "Passenger adding failed. Check your database connectivity", "Failed", JOptionPane.ERROR_MESSAGE);
            }
        });
        t.start();

    }

}
