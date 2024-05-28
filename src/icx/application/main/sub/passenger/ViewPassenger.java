package icx.application.main.sub.passenger;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import icx.loggers.DatabaseLogger;
import icx.model.MySQL;
import icx.model.Passenger;
import icx.service.impl.PassengerSeviceIMPL;
import icx.table.TableContentCenterCellRenderer;
import icx.util.ImageScaler;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author ksoff
 */
public class ViewPassenger extends javax.swing.JDialog {

    private JPanel parent;
    private PassengerSeviceIMPL passengerSeviceIMPL = new PassengerSeviceIMPL();
    private Passenger passenger;

    /**
     * Creates new form AddPassenger
     */
    public ViewPassenger(javax.swing.JPanel parent) {
        this.parent = parent;
        initComponents();
        init();
    }

    public void loadPassengerData(String ticket) {
        try {
            String query = "SELECT * FROM `ticket` "
                    + "INNER JOIN `passenger` ON `ticket`.`p_id` = `passenger`.`p_id` "
                    + "INNER JOIN `seat` ON `ticket`.`seat_s_id` = `seat`.`s_id` "
                    + "INNER JOIN `class` ON `seat`.`c_id` = `class`.`c_id` "
                    + "INNER JOIN `flight_schedule` ON `ticket`.`flight_schedule_id` = `flight_schedule`.`id` "
                    + "INNER JOIN `flights` ON `flight_schedule`.`flight_id` = `flights`.`flight_id` "
                    //+ "INNER JOIN `airports` ON `flights`.`arrival_airport_id` = `airports`.`airport_id`"
                    + "WHERE `ticket`.`t_id`='" + ticket + "'";
            ResultSet resultSet = MySQL.execute(query);

            if (resultSet.next()) {
                fnameField.setText(resultSet.getString("passenger.fname"));
                lnameField.setText(resultSet.getString("passenger.lname"));
                passportField.setText(resultSet.getString("passenger.passport_id"));
                statusComboBox.setSelectedItem(String.valueOf(resultSet.getString("passenger.status")).toUpperCase());
                
                ticketNoField.setText(resultSet.getString("ticket.t_id"));
                flightNoField.setText(resultSet.getString("flights.flight_number"));
                seatNoField.setText(resultSet.getString("seat.s_id"));
                classField.setText(resultSet.getString("class_type"));
                ticketStatusField.setText(resultSet.getString("ticket.status"));
                dateField.setText(resultSet.getString("flight_schedule.flight_date"));

                ResultSet arrivalRS = MySQL.execute("SELECT * FROM `airports` WHERE `airport_id`='" + resultSet.getString("flight_schedule.arrival_airport_id") + "'");
                if (arrivalRS.next()) {
                    arrivalField.setText(arrivalRS.getString("airports.name"));
                }
                ResultSet departureRS = MySQL.execute("SELECT * FROM `airports` WHERE `airport_id`='" + resultSet.getString("flight_schedule.departure_airport_id") + "'");
                if (departureRS.next()) {
                departureField.setText(departureRS.getString("airports.name"));
                }

                arrivalTimeField.setText(resultSet.getString("flight_schedule.arrival_time"));
                departureTImeField.setText(resultSet.getString("flight_schedule.departure_time"));
            } else {
                JOptionPane.showMessageDialog(parent, "Passenger view failed. Please try again.", "Failed", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parent, "Database Search Failed.", "Failed", JOptionPane.WARNING_MESSAGE);
            DatabaseLogger.logger.log(Level.SEVERE, "SQLException in Search LoadPassengerData: " + e.getMessage(), e.getMessage());
        }

    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    private void init() {
        styleComponents();

        loadPassengerData();
        loadPassengerStatus();

        //passengerContainer.setVisible(false);
        //hidePassengerTable();
    }

    private void styleComponents() {
    }

    // Resets Passenger Fields
    private void reset() {
        JTextField[] fields = {fnameField, lnameField, passportField};
        for (JTextField field : fields) {
            field.setText("");
        }
        statusComboBox.setSelectedIndex(0);
    }

    private void loadPassengerData() {
        //passengerSeviceIMPL.loadPassengerData();
    }

    private void loadPassengerStatus() {
        passengerSeviceIMPL.loadPassengerStatus(statusComboBox);
    }

    /* 
     * UI Updates 
     */
    private void generateCenter() {
        //pack(); // set window to preffered size;
        setLocationRelativeTo(null);
    }

    /*
     * Passenger Searching
     */
    private boolean isFound;

    private void fillPassengerFields() {
        Passenger passengerDTO = getPassenger();

        if (passengerDTO != null) {
            fnameField.setText(passengerDTO.getFname());
            lnameField.setText(passengerDTO.getLname());
            passportField.setText(passengerDTO.getPassport());
            statusComboBox.setSelectedItem(passengerDTO.getStatus().toUpperCase());
        }
    }

    /*
     * Ask to Open AddPassenger Modal
     */
    private void askToAddPassenger() {
        int option = JOptionPane.showConfirmDialog(this, "Pasenger did not found. \nDo you want to add this Passenger?", "Not Found", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            openAddPassenger();
        }
    }

    private void openAddPassenger() {
        passengerSeviceIMPL.openAddPassenger(this.parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fieldPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passportField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        ticketNoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        flightNoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        departureField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        departureTImeField = new javax.swing.JTextField();
        ticketStatusField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        classField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        seatNoField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        arrivalField = new javax.swing.JTextField();
        arrivalTimeField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(380, 380));
        setModal(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(755, 300));

        Title.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Passenger Details");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("First Name");

        fnameField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        fnameField.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");

        lnameField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lnameField.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Passport");

        passportField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        passportField.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Status");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Active", "Inactive" }));
        statusComboBox.setEnabled(false);

        javax.swing.GroupLayout fieldPanelLayout = new javax.swing.GroupLayout(fieldPanel);
        fieldPanel.setLayout(fieldPanelLayout);
        fieldPanelLayout.setHorizontalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passportField)
                    .addComponent(fnameField)
                    .addComponent(lnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        fieldPanelLayout.setVerticalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passportField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ticketNoField.setEnabled(false);

        jLabel1.setText("Flight No");

        flightNoField.setEnabled(false);

        jLabel6.setText("Ticket No");

        jLabel11.setText("Departure");

        departureField.setEnabled(false);

        jLabel13.setText("Departure Time");

        departureTImeField.setEnabled(false);

        ticketStatusField.setEnabled(false);

        jLabel15.setText("Ticket Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flightNoField)
                    .addComponent(ticketNoField)
                    .addComponent(ticketStatusField)
                    .addComponent(departureTImeField)
                    .addComponent(departureField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(0, 0, 0)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flightNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departureField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departureTImeField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        classField.setEnabled(false);

        jLabel9.setText("Seat No");

        seatNoField.setEnabled(false);

        jLabel10.setText("Class");

        jLabel12.setText("Arrival");

        arrivalField.setEnabled(false);

        arrivalTimeField.setEnabled(false);

        jLabel14.setText("Arrival Time");

        dateField.setEnabled(false);

        jLabel16.setText("Date");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatNoField, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(classField)
                    .addComponent(dateField)
                    .addComponent(arrivalTimeField)
                    .addComponent(arrivalField)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seatNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrivalField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrivalTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator1)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewPassenger dialog = new ViewPassenger(new javax.swing.JPanel());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField arrivalField;
    private javax.swing.JTextField arrivalTimeField;
    private javax.swing.JTextField classField;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField departureField;
    private javax.swing.JTextField departureTImeField;
    private javax.swing.JPanel fieldPanel;
    private javax.swing.JTextField flightNoField;
    private javax.swing.JTextField fnameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lnameField;
    private javax.swing.JTextField passportField;
    private javax.swing.JTextField seatNoField;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField ticketNoField;
    private javax.swing.JTextField ticketStatusField;
    // End of variables declaration//GEN-END:variables
}
