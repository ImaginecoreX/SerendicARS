package icx.application.main.sub;

import icx.model.MySQL;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateSchedule extends javax.swing.JDialog {

    public static HashMap<String, Integer> departureMap = new HashMap();
    public static HashMap<String, Integer> arrivalMap = new HashMap();

    public UpdateSchedule(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadAirports();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchScheduletxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        flightNotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        departureAirportComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        arrivalAirportComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        arrivalTimetxt = new javax.swing.JTextField();
        departureTimetxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        datetxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setText("Update Flight Schedule");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Search Flight Id");

        searchScheduletxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchScheduletxtKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Flight No", "Departure", "Arrival", "Date", "Departure Time", "Arrival Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Flight No");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Departure Airport");

        departureAirportComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Arrival Airport");

        arrivalAirportComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Departure Time");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Arrival Time");

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton4.setText("Cancel Shedule");

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton3.setText("Update Schedule");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchScheduletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(flightNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(departureTimetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(datetxt))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(departureAirportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arrivalAirportComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(arrivalTimetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchScheduletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departureAirportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrivalAirportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(departureTimetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(arrivalTimetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadUpdate() {

        try {

            ResultSet resultset = MySQL.execute(""
                    + "SELECT * FROM `flight_schedule`\n"
                    + "INNER JOIN `airports` ON `airports`.`airport_id` = `flight_schedule`.`arrival_airport_id`\n"
                    + "INNER JOIN `flights` ON `flight_schedule`.`flight_id` = `flights`.`flight_id`\n"
                    + "INNER JOIN `airlines` ON `airlines`.`airline_id` = `flights`.`airline_id`");

            DefaultTableModel modelTable = (DefaultTableModel) jTable1.getModel();
            modelTable.setRowCount(0);

            while (resultset.next()) {
                Vector<String> v = new Vector();
                v.add(resultset.getString("id"));
                v.add(resultset.getString("flight_number"));
                v.add(resultset.getString("name"));
                v.add(resultset.getString("name"));
                v.add(resultset.getString("date"));
                v.add(resultset.getString("departure_time"));
                v.add(resultset.getString("arrival_time"));

                modelTable.addRow(v);
                jTable1.setModel(modelTable);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchScheduletxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchScheduletxtKeyReleased
        // Update

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String flightNo = searchScheduletxt.getText();

            try {

                ResultSet resultset = MySQL.execute(""
                        + "SELECT * FROM `flight_schedule`\n"
                        + "INNER JOIN `airports` ON `airports`.`airport_id` = `flight_schedule`.`arrival_airport_id`\n"
                        + "INNER JOIN `flights` ON `flight_schedule`.`flight_id` = `flights`.`flight_id`\n"
                        + "INNER JOIN `airlines` ON `airlines`.`airline_id` = `flights`.`airline_id` "
                        + "WHERE `flight_schedule`.`flight_id` = '" + flightNo + "' ORDER BY `id` ASC");

                DefaultTableModel modelTable = (DefaultTableModel) jTable1.getModel();
                modelTable.setRowCount(0);

                while (resultset.next()) {
                    Vector<String> v = new Vector();
                    v.add(resultset.getString("id"));
                    v.add(resultset.getString("flight_number"));
                    v.add(resultset.getString("name"));
                    v.add(resultset.getString("name"));
                    v.add(resultset.getString("date"));
                    v.add(resultset.getString("departure_time"));
                    v.add(resultset.getString("arrival_time"));

                    modelTable.addRow(v);
                    jTable1.setModel(modelTable);

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_searchScheduletxtKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Update Table
        if (evt.getClickCount() == 1) {

            jTable1.setEnabled(false);
            int selectedrow = jTable1.getSelectedRow();

            String flightNumber = String.valueOf(jTable1.getValueAt(selectedrow, 1));
            flightNotxt.setText(flightNumber);

            String departureAirport = String.valueOf(jTable1.getValueAt(selectedrow, 2));
            departureAirportComboBox.setSelectedItem(departureAirport);

            String arrivalAirport = String.valueOf(jTable1.getValueAt(selectedrow, 3));
            arrivalAirportComboBox.setSelectedItem(arrivalAirport);

            String date = String.valueOf(jTable1.getValueAt(selectedrow, 4));
            datetxt.setText(date);

            String departureTime = String.valueOf(jTable1.getValueAt(selectedrow, 5));
            departureTimetxt.setText(departureTime);

            String arrivalTime = String.valueOf(jTable1.getValueAt(selectedrow, 6));
            arrivalTimetxt.setText(arrivalTime);

        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please Select Row", "warning", JOptionPane.WARNING_MESSAGE);
        } else {

            String Id = String.valueOf(jTable1.getValueAt(selectedRow, 0));
            //String id = searchScheduletxt.getText();

            String flightNo = flightNotxt.getText();
            String departureAirport = String.valueOf(departureAirportComboBox.getSelectedItem());
            String arrivalAirport = String.valueOf(arrivalAirportComboBox.getSelectedItem());
            String date = datetxt.getText();
            String departureTime = departureTimetxt.getText();
            String arrivalTime = arrivalTimetxt.getText();

            if (flightNo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Flight Number", "warning", JOptionPane.WARNING_MESSAGE);
            } else if (departureAirport == "Select") {
                JOptionPane.showMessageDialog(this, "Select Departure Airport", "warning", JOptionPane.WARNING_MESSAGE);
            } else if (arrivalAirport == "Select") {
                JOptionPane.showMessageDialog(this, "Select Arrival Airport", "warning", JOptionPane.WARNING_MESSAGE);
            } else if (date.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter The Date", "warning", JOptionPane.WARNING_MESSAGE);
            } else if (departureTime.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Departure time", "warning", JOptionPane.WARNING_MESSAGE);
            } else if (arrivalTime.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Arrival time", "warning", JOptionPane.WARNING_MESSAGE);
            } else {

                int departureId = departureMap.get(departureAirport);
                int arrivalId = arrivalMap.get(arrivalAirport);

                try {

                    MySQL.execute("UPDATE `flight_schedule` SET "
                            + "`departure_airport_id` = '" + departureId + "',"
                            + "`arrival_airport_id`='" + arrivalId + "',"
                            + "`date`='" + date + "',"
                            + "`departure_time`='" + departureTime + "',"
                            + "`arrival_time`='" + arrivalTime + "' "
                            + "WHERE `id` = '" + Id + "'");

                    loadUpdate();
                    JOptionPane.showMessageDialog(this, "Updated", "success", JOptionPane.INFORMATION_MESSAGE);
                    reset();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        timePicker1.showPopup(this, 100, 100);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        timePicker2.showPopup(this, 100, 100);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void loadAirports() {

        try {
            ResultSet resultset = MySQL.execute("SELECT * FROM `airports`");

            Vector v = new Vector();
            v.add("Select");

            while (resultset.next()) {
                v.add(resultset.getString("name"));
                departureMap.put(resultset.getString("name"), resultset.getInt("airport_id"));
                arrivalMap.put(resultset.getString("name"), resultset.getInt("airport_id"));
            }
            DefaultComboBoxModel airportModel1 = new DefaultComboBoxModel(v);
            DefaultComboBoxModel airportModel2 = new DefaultComboBoxModel(v);
            departureAirportComboBox.setModel(airportModel1);
            arrivalAirportComboBox.setModel(airportModel2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reset() {
        flightNotxt.setText("");
        departureAirportComboBox.setSelectedIndex(0);
        arrivalAirportComboBox.setSelectedIndex(0);
        datetxt.setText("");
        departureTimetxt.setText("");
        arrivalTimetxt.setText("");

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateSchedule dialog = new UpdateSchedule(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> arrivalAirportComboBox;
    private javax.swing.JTextField arrivalTimetxt;
    private javax.swing.JTextField datetxt;
    private javax.swing.JComboBox<String> departureAirportComboBox;
    private javax.swing.JTextField departureTimetxt;
    private javax.swing.JTextField flightNotxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchScheduletxt;
    // End of variables declaration//GEN-END:variables
}
