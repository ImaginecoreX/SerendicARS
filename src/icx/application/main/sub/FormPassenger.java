package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;
import icx.table.TableButtonCellRenderer;
import icx.table.header.TableCheckBoxHeaderRenderer;
import icx.table.TableContentCenterCellRenderer;
import icx.table.TableSwitchButtonCellEditor;
import icx.table.TableSwitchButtonCellRenderer;
import icx.table.header.TableButtonHeaderRenderer;
import icx.util.ImageScaler;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import icx.util.Constants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author sandaruwan
 */
public class FormPassenger extends javax.swing.JPanel {

    public FormPassenger() {
        initComponents();
        init();
        renderData();
    }

    private void renderData() {
        new TableContentCenterCellRenderer().renderTable(passengerTable);
        passengerTable.getColumnModel().getColumn(0).setHeaderRenderer(new TableCheckBoxHeaderRenderer(passengerTable, 0));

        passengerTable.getColumnModel().getColumn(6).setCellRenderer(new TableButtonCellRenderer("View", "", (int row) -> {
            System.out.println(row);
        }));

        passengerTable.getColumnModel().getColumn(7).setHeaderRenderer(new TableButtonHeaderRenderer(passengerTable, 7, "Print Report", () -> {
            System.out.println("Print Report");
        }));

        passengerTable.getColumnModel().getColumn(7).setCellRenderer(new TableSwitchButtonCellRenderer());
        passengerTable.getColumnModel().getColumn(7).setCellEditor(new TableSwitchButtonCellEditor((boolean selected) -> {
            System.out.println(selected);
        }));
        testData();
    }

    private void testData() {
        DefaultTableModel model = (DefaultTableModel) passengerTable.getModel();
        model.addRow(new Object[]{true, "Nsme", "ticket", "serial", "status", "Passport", "", true});
        model.addRow(new Object[]{false, "Nsme", "ticket", "serial", "status", "Passport", "", false});
        model.addRow(new Object[]{true, "Nsme", "ticket", "serial", "status", "Passport", "", true});
    }

    private void init() {
        title.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        JTextField[] fields = {destinationField, flightField, classField};
        for (JTextField field : fields) {
            field.putClientProperty("JTextField.leadingIcon", new ImageScaler().getSvgIcon("icx/icon/svg/search.svg", 20, 20));
            field.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        }

        JPanel[] panels = {destinationPanel, flightPanel, classPanel, recentFlightDetailPanel1, recentFlightDetailPanel2, recentFlightDetailPanel3, recentFlightDetailPanel4};
        for (JPanel panel : panels) {
            panel.putClientProperty(FlatClientProperties.STYLE, ""
                    + "background:$SubPanel.background;"
                    + "arc:20;");
        }
        //        JTable[] tables = {destinationTable, flightTable, classTable};
        //        for (JTable table : tables) {
        //            table.setVisible(false);
        //        }

        //        JScrollPane[] containers = {destinationScroll, flightScroll, classScroll};
        //        for (JScrollPane container : containers) {
        //            container.setVisible(false);
        //        }
        JPanel[] containers = {destinationContainer, flightContainer, classContainer};
        for (JPanel container : containers) {
            container.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        recentFlightsScroll = new javax.swing.JScrollPane();
        RecentFlightsContainer = new javax.swing.JPanel();
        recentFlightDetailPanel1 = new javax.swing.JPanel();
        flight1 = new javax.swing.JLabel();
        flightName1 = new javax.swing.JLabel();
        passengerCount1 = new javax.swing.JLabel();
        count1 = new javax.swing.JLabel();
        otherDetails1 = new javax.swing.JLabel();
        recentFlightDetailPanel2 = new javax.swing.JPanel();
        flight2 = new javax.swing.JLabel();
        flightName2 = new javax.swing.JLabel();
        passengerCount2 = new javax.swing.JLabel();
        count2 = new javax.swing.JLabel();
        otherDetails2 = new javax.swing.JLabel();
        recentFlightDetailPanel3 = new javax.swing.JPanel();
        flight3 = new javax.swing.JLabel();
        flightName3 = new javax.swing.JLabel();
        passengerCount3 = new javax.swing.JLabel();
        count3 = new javax.swing.JLabel();
        otherDetails3 = new javax.swing.JLabel();
        recentFlightDetailPanel4 = new javax.swing.JPanel();
        otherDetails4 = new javax.swing.JLabel();
        count4 = new javax.swing.JLabel();
        passengerCount4 = new javax.swing.JLabel();
        flightName4 = new javax.swing.JLabel();
        flight4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dashboardText = new javax.swing.JLabel();
        currentPanelText = new javax.swing.JLabel();
        headContainer = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        butonContainer = new javax.swing.JPanel();
        addPassengerButton = new javax.swing.JButton();
        updatePassengerButton = new javax.swing.JButton();
        deletePassengerButton = new javax.swing.JButton();
        searchPanelContainer = new javax.swing.JPanel();
        destinationPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        destinationField = new javax.swing.JTextField();
        destinationContainer = new javax.swing.JPanel();
        destinationScroll = new javax.swing.JScrollPane();
        destinationTable = new javax.swing.JTable();
        flightPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        flightField = new javax.swing.JTextField();
        flightContainer = new javax.swing.JPanel();
        flightScroll = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        classPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        classField = new javax.swing.JTextField();
        classContainer = new javax.swing.JPanel();
        classScroll = new javax.swing.JScrollPane();
        classTable = new javax.swing.JTable();
        passengerScroll = new javax.swing.JScrollPane();
        passengerTable = new javax.swing.JTable();
        moreButton = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        recentFlightsScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        recentFlightsScroll.setPreferredSize(new java.awt.Dimension(820, 219));

        RecentFlightsContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        RecentFlightsContainer.setMinimumSize(new java.awt.Dimension(440, 270));
        RecentFlightsContainer.setPreferredSize(new java.awt.Dimension(900, 266));
        RecentFlightsContainer.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        recentFlightDetailPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        recentFlightDetailPanel1.setMinimumSize(new java.awt.Dimension(100, 0));

        flight1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        flight1.setText("Flight: ");

        flightName1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        flightName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flightName1.setText("FlightName");

        passengerCount1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        passengerCount1.setText("Passenger Count:");

        count1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        count1.setText("100");

        otherDetails1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        otherDetails1.setText("Other Details");
        otherDetails1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout recentFlightDetailPanel1Layout = new javax.swing.GroupLayout(recentFlightDetailPanel1);
        recentFlightDetailPanel1.setLayout(recentFlightDetailPanel1Layout);
        recentFlightDetailPanel1Layout.setHorizontalGroup(
            recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherDetails1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(recentFlightDetailPanel1Layout.createSequentialGroup()
                        .addGroup(recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recentFlightDetailPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(count1))
                            .addComponent(passengerCount1)
                            .addComponent(flight1))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(flightName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        recentFlightDetailPanel1Layout.setVerticalGroup(
            recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flight1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flightName1)
                .addGap(18, 18, 18)
                .addComponent(passengerCount1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count1)
                .addGap(18, 18, 18)
                .addComponent(otherDetails1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        RecentFlightsContainer.add(recentFlightDetailPanel1);

        recentFlightDetailPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        recentFlightDetailPanel2.setMinimumSize(new java.awt.Dimension(100, 0));

        flight2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        flight2.setText("Other Details");

        flightName2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        flightName2.setText("100");

        passengerCount2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        passengerCount2.setText("Passenger Count:");

        count2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        count2.setText("Flight: ");

        otherDetails2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        otherDetails2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otherDetails2.setText("FlightName");

        javax.swing.GroupLayout recentFlightDetailPanel2Layout = new javax.swing.GroupLayout(recentFlightDetailPanel2);
        recentFlightDetailPanel2.setLayout(recentFlightDetailPanel2Layout);
        recentFlightDetailPanel2Layout.setHorizontalGroup(
            recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flight2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(recentFlightDetailPanel2Layout.createSequentialGroup()
                        .addGroup(recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recentFlightDetailPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(flightName2))
                            .addComponent(passengerCount2)
                            .addComponent(count2))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(otherDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        recentFlightDetailPanel2Layout.setVerticalGroup(
            recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(count2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherDetails2)
                .addGap(18, 18, 18)
                .addComponent(passengerCount2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flightName2)
                .addGap(18, 18, 18)
                .addComponent(flight2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        RecentFlightsContainer.add(recentFlightDetailPanel2);

        recentFlightDetailPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        recentFlightDetailPanel3.setMinimumSize(new java.awt.Dimension(100, 0));

        flight3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        flight3.setText("Other Details");

        flightName3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        flightName3.setText("100");

        passengerCount3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        passengerCount3.setText("Passenger Count:");

        count3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        count3.setText("Flight: ");

        otherDetails3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        otherDetails3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otherDetails3.setText("FlightName");

        javax.swing.GroupLayout recentFlightDetailPanel3Layout = new javax.swing.GroupLayout(recentFlightDetailPanel3);
        recentFlightDetailPanel3.setLayout(recentFlightDetailPanel3Layout);
        recentFlightDetailPanel3Layout.setHorizontalGroup(
            recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flight3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(recentFlightDetailPanel3Layout.createSequentialGroup()
                        .addGroup(recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recentFlightDetailPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(flightName3))
                            .addComponent(passengerCount3)
                            .addComponent(count3))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(otherDetails3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        recentFlightDetailPanel3Layout.setVerticalGroup(
            recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(count3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherDetails3)
                .addGap(18, 18, 18)
                .addComponent(passengerCount3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flightName3)
                .addGap(18, 18, 18)
                .addComponent(flight3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        RecentFlightsContainer.add(recentFlightDetailPanel3);

        recentFlightDetailPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        otherDetails4.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        otherDetails4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otherDetails4.setText("FlightName");

        count4.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        count4.setText("Flight: ");

        passengerCount4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        passengerCount4.setText("Passenger Count:");

        flightName4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        flightName4.setText("100");

        flight4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        flight4.setText("Other Details");

        javax.swing.GroupLayout recentFlightDetailPanel4Layout = new javax.swing.GroupLayout(recentFlightDetailPanel4);
        recentFlightDetailPanel4.setLayout(recentFlightDetailPanel4Layout);
        recentFlightDetailPanel4Layout.setHorizontalGroup(
            recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                        .addComponent(flight4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                        .addGroup(recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(flightName4))
                            .addComponent(passengerCount4)
                            .addComponent(count4))
                        .addGap(0, 61, Short.MAX_VALUE))))
            .addComponent(otherDetails4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        recentFlightDetailPanel4Layout.setVerticalGroup(
            recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(count4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherDetails4)
                .addGap(18, 18, 18)
                .addComponent(passengerCount4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flightName4)
                .addGap(18, 18, 18)
                .addComponent(flight4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        RecentFlightsContainer.add(recentFlightDetailPanel4);

        recentFlightsScroll.setViewportView(RecentFlightsContainer);

        dashboardText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        dashboardText.setForeground(new java.awt.Color(0, 153, 255));
        dashboardText.setText("Dashboard");

        currentPanelText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        currentPanelText.setText("> Passenger Management");

        title.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        title.setText("Passenger Management");

        butonContainer.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        addPassengerButton.setBackground(new java.awt.Color(102, 153, 255));
        addPassengerButton.setText("Add Passenger");
        addPassengerButton.setMargin(new java.awt.Insets(2, 5, 3, 5));
        butonContainer.add(addPassengerButton);

        updatePassengerButton.setBackground(new java.awt.Color(0, 153, 153));
        updatePassengerButton.setText("Update Passenger");
        updatePassengerButton.setMargin(new java.awt.Insets(2, 5, 3, 5));
        butonContainer.add(updatePassengerButton);

        deletePassengerButton.setBackground(new java.awt.Color(255, 51, 51));
        deletePassengerButton.setText("Delete Passenger");
        deletePassengerButton.setMargin(new java.awt.Insets(2, 5, 3, 5));
        butonContainer.add(deletePassengerButton);

        javax.swing.GroupLayout headContainerLayout = new javax.swing.GroupLayout(headContainer);
        headContainer.setLayout(headContainerLayout);
        headContainerLayout.setHorizontalGroup(
            headContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headContainerLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        headContainerLayout.setVerticalGroup(
            headContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title)
                    .addComponent(butonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchPanelContainer.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        destinationPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Select Destination");

        destinationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                destinationFieldKeyReleased(evt);
            }
        });

        destinationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination", "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        destinationTable.setShowHorizontalLines(true);
        destinationScroll.setViewportView(destinationTable);

        javax.swing.GroupLayout destinationContainerLayout = new javax.swing.GroupLayout(destinationContainer);
        destinationContainer.setLayout(destinationContainerLayout);
        destinationContainerLayout.setHorizontalGroup(
            destinationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(destinationScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        destinationContainerLayout.setVerticalGroup(
            destinationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(destinationScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout destinationPanelLayout = new javax.swing.GroupLayout(destinationPanel);
        destinationPanel.setLayout(destinationPanelLayout);
        destinationPanelLayout.setHorizontalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(destinationField)
                    .addGroup(destinationPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 141, Short.MAX_VALUE))
                    .addComponent(destinationContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        destinationPanelLayout.setVerticalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(destinationContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        searchPanelContainer.add(destinationPanel);

        flightPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Select Flight");

        flightField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                flightFieldKeyReleased(evt);
            }
        });

        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight", "TIme"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightTable.setShowHorizontalLines(true);
        flightScroll.setViewportView(flightTable);

        javax.swing.GroupLayout flightContainerLayout = new javax.swing.GroupLayout(flightContainer);
        flightContainer.setLayout(flightContainerLayout);
        flightContainerLayout.setHorizontalGroup(
            flightContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(flightScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        flightContainerLayout.setVerticalGroup(
            flightContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(flightScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout flightPanelLayout = new javax.swing.GroupLayout(flightPanel);
        flightPanel.setLayout(flightPanelLayout);
        flightPanelLayout.setHorizontalGroup(
            flightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(flightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(flightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addComponent(flightField)
                    .addComponent(flightContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        flightPanelLayout.setVerticalGroup(
            flightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flightField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(flightContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        searchPanelContainer.add(flightPanel);

        classPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Select Class");

        classField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                classFieldKeyReleased(evt);
            }
        });

        classTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        classTable.setShowHorizontalLines(true);
        classScroll.setViewportView(classTable);

        javax.swing.GroupLayout classContainerLayout = new javax.swing.GroupLayout(classContainer);
        classContainer.setLayout(classContainerLayout);
        classContainerLayout.setHorizontalGroup(
            classContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(classScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        classContainerLayout.setVerticalGroup(
            classContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(classScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout classPanelLayout = new javax.swing.GroupLayout(classPanel);
        classPanel.setLayout(classPanelLayout);
        classPanelLayout.setHorizontalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(classPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 191, Short.MAX_VALUE))
                    .addComponent(classField)
                    .addComponent(classContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        classPanelLayout.setVerticalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        searchPanelContainer.add(classPanel);

        passengerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Onboard Passengers", "Ticket No", "Seat No/CI", "Status", "Passport No", "", "Print Report"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        passengerTable.setRowHeight(30);
        passengerTable.setShowGrid(false);
        passengerScroll.setViewportView(passengerTable);
        if (passengerTable.getColumnModel().getColumnCount() > 0) {
            passengerTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        moreButton.setBackground(Constants.TRANSPARENT);
        moreButton.setIcon(new FlatSVGIcon("icx/icon/svg/right_arrow.svg"));
        moreButton.setOpaque(true);
        moreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(headContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passengerScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dashboardText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentPanelText))
                            .addComponent(recentFlightsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(recentFlightsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dashboardText)
                    .addComponent(currentPanelText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passengerScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void moreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moreButtonActionPerformed

    private void destinationFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destinationFieldKeyReleased
        // Select Destination
        String destination = destinationField.getText();
        if (!destination.equals("") && destination != null) {
            destinationContainer.setVisible(true);
            //destinationScroll.setVisible(true);
            //destinationTable.setVisible(true);
        } else {
            destinationContainer.setVisible(false);
        }
    }//GEN-LAST:event_destinationFieldKeyReleased

    private void flightFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flightFieldKeyReleased
        // Select Flight
        String flight = flightField.getText();
        if (!flight.equals("") && flight != null) {
            flightContainer.setVisible(true);
            //flightScroll.setVisible(true);
            //flightField.setVisible(true);
        } else {
            flightContainer.setVisible(false);
        }
    }//GEN-LAST:event_flightFieldKeyReleased

    private void classFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_classFieldKeyReleased
        // Select Class
        String className = classField.getText();
        if (!className.equals("") && className != null) {
            classContainer.setVisible(true);
            //classScroll.setVisible(true);
            //classTable.setVisible(true);
        } else {
            classContainer.setVisible(false);
        }
    }//GEN-LAST:event_classFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RecentFlightsContainer;
    private javax.swing.JButton addPassengerButton;
    private javax.swing.JPanel butonContainer;
    private javax.swing.JPanel classContainer;
    private javax.swing.JTextField classField;
    private javax.swing.JPanel classPanel;
    private javax.swing.JScrollPane classScroll;
    private javax.swing.JTable classTable;
    private javax.swing.JLabel count1;
    private javax.swing.JLabel count2;
    private javax.swing.JLabel count3;
    private javax.swing.JLabel count4;
    private javax.swing.JLabel currentPanelText;
    private javax.swing.JLabel dashboardText;
    private javax.swing.JButton deletePassengerButton;
    private javax.swing.JPanel destinationContainer;
    private javax.swing.JTextField destinationField;
    private javax.swing.JPanel destinationPanel;
    private javax.swing.JScrollPane destinationScroll;
    private javax.swing.JTable destinationTable;
    private javax.swing.JLabel flight1;
    private javax.swing.JLabel flight2;
    private javax.swing.JLabel flight3;
    private javax.swing.JLabel flight4;
    private javax.swing.JPanel flightContainer;
    private javax.swing.JTextField flightField;
    private javax.swing.JLabel flightName1;
    private javax.swing.JLabel flightName2;
    private javax.swing.JLabel flightName3;
    private javax.swing.JLabel flightName4;
    private javax.swing.JPanel flightPanel;
    private javax.swing.JScrollPane flightScroll;
    private javax.swing.JTable flightTable;
    private javax.swing.JPanel headContainer;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton moreButton;
    private javax.swing.JLabel otherDetails1;
    private javax.swing.JLabel otherDetails2;
    private javax.swing.JLabel otherDetails3;
    private javax.swing.JLabel otherDetails4;
    private javax.swing.JLabel passengerCount1;
    private javax.swing.JLabel passengerCount2;
    private javax.swing.JLabel passengerCount3;
    private javax.swing.JLabel passengerCount4;
    private javax.swing.JScrollPane passengerScroll;
    private javax.swing.JTable passengerTable;
    private javax.swing.JPanel recentFlightDetailPanel1;
    private javax.swing.JPanel recentFlightDetailPanel2;
    private javax.swing.JPanel recentFlightDetailPanel3;
    private javax.swing.JPanel recentFlightDetailPanel4;
    private javax.swing.JScrollPane recentFlightsScroll;
    private javax.swing.JPanel searchPanelContainer;
    private javax.swing.JLabel title;
    private javax.swing.JButton updatePassengerButton;
    // End of variables declaration//GEN-END:variables
}
