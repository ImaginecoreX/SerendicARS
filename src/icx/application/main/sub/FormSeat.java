package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;
import icx.model.MySQL;
import icx.model.SeatLayout;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandaruwan
 */
public class FormSeat extends javax.swing.JPanel {

    public FormSeat() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");

        loadAcFrom();
        loadAcTo();
        loadClass();
        addSeatPanel.setVisible(false);

    }

    HashMap<String, String> AirportCodeMap = new HashMap<>();
    HashMap<String, String> seatClassMap = new HashMap<>();
    HashMap<String, String> seatStatusMap = new HashMap<>();

    String seat_id = null;

    public void resetSeat() {

        airlineName.setText("AirLine");
        FlightNo.setText("");
        From.setText("");
        To.setText("");
        bookedClass.setText("");
        seatNo.setSelectedIndex(0);
        PaxSetField.setText("");
        PaxSearchText.setText("");

    }

    public void loadAcFrom() {

        try {

            ResultSet resultSet = MySQL.execute("SELECT * FROM `Airports` ");

            Vector<String> vector = new Vector<>();
            vector.add("From");

            while (resultSet.next()) {

                vector.add(resultSet.getString("code"));
                AirportCodeMap.put(resultSet.getString("code"), resultSet.getString("airport_id"));

            }

            Sfrom.setModel(new DefaultComboBoxModel<>(vector));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadAcTo() {

        try {

            ResultSet resultSet = MySQL.execute("SELECT * FROM `Airports` ");

            Vector<String> vector = new Vector<>();
            vector.add("TO");

            while (resultSet.next()) {

                vector.add(resultSet.getString("code"));
                AirportCodeMap.put(resultSet.getString("code"), resultSet.getString("airport_id"));

            }

            Sto.setModel(new DefaultComboBoxModel<>(vector));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadClass() {

        try {

            ResultSet resultSet = MySQL.execute("SELECT * FROM `class` ");

            Vector<String> vector = new Vector<>();
            vector.add("Class Selection");

            while (resultSet.next()) {

                vector.add(resultSet.getString("class_type"));
                seatClassMap.put(resultSet.getString("class_type"), resultSet.getString("c_id"));

            }

            Sclass.setModel(new DefaultComboBoxModel<>(vector));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    public void loadStatus() {
//
//        try {
//
//            ResultSet resultSet = MySQL.execute("SELECT * FROM `booking_status` ");
//
//            Vector<String> vector = new Vector<>();
//            vector.add("Change Status");
//
//            while (resultSet.next()) {
//
//                vector.add(resultSet.getString("status"));
//                seatStatusMap.put(resultSet.getString("status"), resultSet.getString("b_id"));
//
//            }
//
//            changeStatus.setModel(new DefaultComboBoxModel<>(vector));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Status = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lb = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Sfrom = new javax.swing.JComboBox<>();
        Sto = new javax.swing.JComboBox<>();
        Sflight = new javax.swing.JComboBox<>();
        Sclass = new javax.swing.JComboBox<>();
        Available = new javax.swing.JRadioButton();
        Booked = new javax.swing.JRadioButton();
        addSeatPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        FlightNo = new javax.swing.JLabel();
        airlineName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        From = new javax.swing.JTextField();
        To = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaxTable = new javax.swing.JTable();
        PaxSearchText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PaxSetField = new javax.swing.JTextField();
        bookedClass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        seatNo = new javax.swing.JComboBox<>();

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel1.setText("Flights");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("UL 504");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText(" Available");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("12J AND 128Y");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setText("Booked");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("2J AND 12Y");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        lb.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb.setText("Seat Management");

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Seat Layout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jButton2.setText("Assign Seats");
        jPanel6.add(jButton2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Dashboard");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("> Seat Management");

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton6.setBackground(new java.awt.Color(255, 153, 51));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton6.setText("Search Seats");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Destination");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        Sfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "From" }));
        Sfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SfromActionPerformed(evt);
            }
        });

        Sto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To" }));
        Sto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoActionPerformed(evt);
            }
        });

        Sflight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flight Selection" }));
        Sflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SflightActionPerformed(evt);
            }
        });

        Sclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class Selection", "First Class", "Business class", "Echonomy Class" }));

        Status.add(Available);
        Available.setText("Available");

        Status.add(Booked);
        Booked.setText("Booked");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sclass, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(Sfrom, 0, 117, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Sflight, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Booked)
                            .addComponent(Available))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sfrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sflight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sclass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Available)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Booked)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addSeatPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Flight NO");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        airlineName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        airlineName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        airlineName.setText("Sri Lankan Airlines");
        airlineName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Destinations");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        From.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromActionPerformed(evt);
            }
        });

        To.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("To");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Booked Class");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setText("Assign Seat");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        PaxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passport Id", "First Name", "Last Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PaxTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaxTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PaxTable);

        PaxSearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaxSearchTextActionPerformed(evt);
            }
        });
        PaxSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PaxSearchTextKeyPressed(evt);
            }
        });

        jLabel14.setText(" Search Passenger");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Passenger");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Select Seat");

        seatNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seat Number" }));

        javax.swing.GroupLayout addSeatPanelLayout = new javax.swing.GroupLayout(addSeatPanel);
        addSeatPanel.setLayout(addSeatPanelLayout);
        addSeatPanelLayout.setHorizontalGroup(
            addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addSeatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PaxSetField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookedClass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addSeatPanelLayout.createSequentialGroup()
                        .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addSeatPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(FlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(airlineName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seatNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSeatPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaxSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        addSeatPanelLayout.setVerticalGroup(
            addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addSeatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlineName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PaxSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSeatPanelLayout.createSequentialGroup()
                        .addGroup(addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addSeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(bookedClass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaxSetField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addSeatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addSeatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SfromActionPerformed

    private void SflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SflightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SflightActionPerformed

    private void StoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoActionPerformed

        String from = String.valueOf(Sfrom.getSelectedItem());
        String to = String.valueOf(Sto.getSelectedItem());

        try {

            Vector v = new Vector();
            v.add("Flight Selection");

            ResultSet resultset = MySQL.execute("SELECT * FROM  `Flights` WHERE `departure_airport_id`= '" + AirportCodeMap.get(from) + "' AND `arrival_airport_id`='" + AirportCodeMap.get(to) + "' ");

            while (resultset.next()) {

                v.add(resultset.getString("flight_number"));
                Sflight.setModel(new DefaultComboBoxModel<>(v));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_StoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String from = String.valueOf(Sfrom.getSelectedItem());
        String to = String.valueOf(Sto.getSelectedItem());
        String flight = String.valueOf(this.Sflight.getSelectedItem());
        String sclass = String.valueOf(this.Sclass.getSelectedItem());

        Available.setActionCommand("1");
        Booked.setActionCommand("2");

        String status = Status.getSelection().getActionCommand();

        addSeatPanel.setVisible(true);

        try {
            if (from == "From") {
                JOptionPane.showMessageDialog(this, "Select Destination", "Warning", JOptionPane.ERROR_MESSAGE);

            } else if (to == "To") {
                JOptionPane.showMessageDialog(this, "Select Destination", "Warning", JOptionPane.ERROR_MESSAGE);

            } else if (flight == "Flight Selection") {
                JOptionPane.showMessageDialog(this, "Select Flight", "Warning", JOptionPane.ERROR_MESSAGE);

            } else if (sclass == "Class Selection") {
                JOptionPane.showMessageDialog(this, "Select Class", "Warning", JOptionPane.ERROR_MESSAGE);

            } else if (Status.getSelection().getActionCommand()==null) {

                JOptionPane.showMessageDialog(this, "Select Seat Status", "Error", JOptionPane.ERROR_MESSAGE);

            } else {

                ResultSet resultSet = MySQL.execute("SELECT * FROM `seat`"
                        + " INNER JOIN `Flights` ON `seat`.`Flights_flight_id`=`Flights`.`flight_id`"
                        + "INNER JOIN `Airports` ON `Flights`.`departure_airport_id`=`Airports`.`airport_id`"
                        + "WHERE `Flights`.`departure_airport_id`='" + AirportCodeMap.get(from) + "' AND `Flights`.`arrival_airport_id`='" + AirportCodeMap.get(to) + "' AND `Flights`.`flight_number` = '" + flight + "' AND `seat`.`c_id` = '" + seatClassMap.get(sclass) + "'  AND `seat`.`b_id`='" + status + "' ");

                Vector<String> vector = new Vector<>();
                vector.add("Seat Number");

                if (resultSet.next()) {

                    airlineName.setText(resultSet.getString("Airports.name"));
                    FlightNo.setText(resultSet.getString("Flights.flight_number"));
                    From.setText(from);
                    To.setText(to);
                    bookedClass.setText(sclass);

                    while (resultSet.next()) {

                        vector.add(resultSet.getString("s_id"));
                        seatNo.setModel(new DefaultComboBoxModel<>(vector));
                    }

                } else {

                    JOptionPane.showMessageDialog(this, "No Seats Available for this flight", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void FromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromActionPerformed

    private void PaxSearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaxSearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaxSearchTextActionPerformed

    private void PaxSearchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaxSearchTextKeyPressed

        try {

            String searchText = PaxSearchText.getText();

            ResultSet resultSet = MySQL.execute("SELECT * FROM `passenger` WHERE `fname` LIKE '" + searchText + "%' OR `lname` LIKE '" + searchText + "%'");

            DefaultTableModel modal = (DefaultTableModel) PaxTable.getModel();
            modal.setRowCount(0);

            while (resultSet.next()) {

                Vector vector = new Vector();
                vector.add(resultSet.getString("passport_id"));
                vector.add(resultSet.getString("fname"));
                vector.add(resultSet.getString("lname"));

                modal.addRow(vector);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_PaxSearchTextKeyPressed

    private void PaxTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaxTableMouseClicked

        int click = evt.getClickCount();
        String fno = FlightNo.getText();

        if (click == 2) {
            if (fno == null) {

                JOptionPane.showMessageDialog(this, "Select Flight First", "Warning", JOptionPane.ERROR_MESSAGE);

            } else {

                int row = PaxTable.getSelectedRow();

                String passport = String.valueOf(PaxTable.getValueAt(row, 0));
                String fname = String.valueOf(PaxTable.getValueAt(row, 1));
                String lname = String.valueOf(PaxTable.getValueAt(row, 2));

                PaxSetField.setText(passport);

            }

        } else {

        }


    }//GEN-LAST:event_PaxTableMouseClicked

    private void ToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {

            MySQL.execute("UPDATE `ticket` INNER JOIN `passenger` ON `passenger`.`p_id`= `ticket`.`p_id` "
                    + "SET `ticket`.`seat_s_id`= '" + seatNo.getSelectedItem() + "' "
                    + "WHERE `passenger`.`passport_id`='" + PaxSetField.getText() + "' ");

            MySQL.execute("UPDATE `seat`  SET `b_id` = '2' "
                    + "WHERE `seat`.`s_id`='" + seatNo.getSelectedItem() + "'");

            resetSeat();
            addSeatPanel.setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SeatLayout layout = new SeatLayout(this);
        layout.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Available;
    private javax.swing.JRadioButton Booked;
    private javax.swing.JLabel FlightNo;
    private javax.swing.JTextField From;
    private javax.swing.JTextField PaxSearchText;
    private javax.swing.JTextField PaxSetField;
    private javax.swing.JTable PaxTable;
    private javax.swing.JComboBox<String> Sclass;
    private javax.swing.JComboBox<String> Sflight;
    private javax.swing.JComboBox<String> Sfrom;
    private javax.swing.ButtonGroup Status;
    private javax.swing.JComboBox<String> Sto;
    private javax.swing.JTextField To;
    private javax.swing.JPanel addSeatPanel;
    private javax.swing.JLabel airlineName;
    private javax.swing.JTextField bookedClass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb;
    private javax.swing.JComboBox<String> seatNo;
    // End of variables declaration//GEN-END:variables
}
