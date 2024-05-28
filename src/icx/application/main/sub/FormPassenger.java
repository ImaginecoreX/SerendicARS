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
            field.putClientProperty("JTextField.leadingIcon", new ImageScaler().getScaledSmoothIcon("/icx/icon/png/logo.png", 24, 24));
            field.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        }
        
        JPanel[] panels = {destinationPanel, flightPanel, classPanel, recentFlightDetailPanel1, recentFlightDetailPanel2, recentFlightDetailPanel3, recentFlightDetailPanel4};
        for (JPanel panel : panels) {
            panel.putClientProperty(FlatClientProperties.STYLE, ""
                    + "background:$SubPanel.background;"
                    + "arc:20;");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recentFlightsScroll = new javax.swing.JScrollPane();
        RecentFlightsContainer = new javax.swing.JPanel();
        recentFlightDetailPanel1 = new javax.swing.JPanel();
        recentFlightDetailPanel2 = new javax.swing.JPanel();
        recentFlightDetailPanel3 = new javax.swing.JPanel();
        recentFlightDetailPanel4 = new javax.swing.JPanel();
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
        flightPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        flightField = new javax.swing.JTextField();
        classPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        classField = new javax.swing.JTextField();
        passengerScroll = new javax.swing.JScrollPane();
        passengerTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        recentFlightsScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        recentFlightsScroll.setPreferredSize(new java.awt.Dimension(820, 219));

        RecentFlightsContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        RecentFlightsContainer.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        recentFlightDetailPanel1.setMinimumSize(new java.awt.Dimension(100, 0));

        javax.swing.GroupLayout recentFlightDetailPanel1Layout = new javax.swing.GroupLayout(recentFlightDetailPanel1);
        recentFlightDetailPanel1.setLayout(recentFlightDetailPanel1Layout);
        recentFlightDetailPanel1Layout.setHorizontalGroup(
            recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        recentFlightDetailPanel1Layout.setVerticalGroup(
            recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        RecentFlightsContainer.add(recentFlightDetailPanel1);

        recentFlightDetailPanel2.setMinimumSize(new java.awt.Dimension(100, 0));

        javax.swing.GroupLayout recentFlightDetailPanel2Layout = new javax.swing.GroupLayout(recentFlightDetailPanel2);
        recentFlightDetailPanel2.setLayout(recentFlightDetailPanel2Layout);
        recentFlightDetailPanel2Layout.setHorizontalGroup(
            recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        recentFlightDetailPanel2Layout.setVerticalGroup(
            recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        RecentFlightsContainer.add(recentFlightDetailPanel2);

        recentFlightDetailPanel3.setMinimumSize(new java.awt.Dimension(100, 0));

        javax.swing.GroupLayout recentFlightDetailPanel3Layout = new javax.swing.GroupLayout(recentFlightDetailPanel3);
        recentFlightDetailPanel3.setLayout(recentFlightDetailPanel3Layout);
        recentFlightDetailPanel3Layout.setHorizontalGroup(
            recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        recentFlightDetailPanel3Layout.setVerticalGroup(
            recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        RecentFlightsContainer.add(recentFlightDetailPanel3);

        javax.swing.GroupLayout recentFlightDetailPanel4Layout = new javax.swing.GroupLayout(recentFlightDetailPanel4);
        recentFlightDetailPanel4.setLayout(recentFlightDetailPanel4Layout);
        recentFlightDetailPanel4Layout.setHorizontalGroup(
            recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        recentFlightDetailPanel4Layout.setVerticalGroup(
            recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
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

        butonContainer.setLayout(new java.awt.GridLayout(1, 0));

        addPassengerButton.setText("Add Passenger");
        addPassengerButton.setMargin(new java.awt.Insets(2, 5, 3, 5));
        butonContainer.add(addPassengerButton);

        updatePassengerButton.setText("Update Passenger");
        updatePassengerButton.setMargin(new java.awt.Insets(2, 5, 3, 5));
        butonContainer.add(updatePassengerButton);

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

        javax.swing.GroupLayout destinationPanelLayout = new javax.swing.GroupLayout(destinationPanel);
        destinationPanel.setLayout(destinationPanelLayout);
        destinationPanelLayout.setHorizontalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, destinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(destinationField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, destinationPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 135, Short.MAX_VALUE)))
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
                .addContainerGap(158, Short.MAX_VALUE))
        );

        searchPanelContainer.add(destinationPanel);

        flightPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Select Flight");

        javax.swing.GroupLayout flightPanelLayout = new javax.swing.GroupLayout(flightPanel);
        flightPanel.setLayout(flightPanelLayout);
        flightPanelLayout.setHorizontalGroup(
            flightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, flightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(flightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, flightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 184, Short.MAX_VALUE))
                    .addComponent(flightField, javax.swing.GroupLayout.Alignment.LEADING))
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
                .addContainerGap(158, Short.MAX_VALUE))
        );

        searchPanelContainer.add(flightPanel);

        classPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Select Class");

        javax.swing.GroupLayout classPanelLayout = new javax.swing.GroupLayout(classPanel);
        classPanel.setLayout(classPanelLayout);
        classPanelLayout.setHorizontalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, classPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 185, Short.MAX_VALUE))
                    .addComponent(classField, javax.swing.GroupLayout.Alignment.LEADING))
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
                .addContainerGap(158, Short.MAX_VALUE))
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
        passengerScroll.setViewportView(passengerTable);
        if (passengerTable.getColumnModel().getColumnCount() > 0) {
            passengerTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icx/icon/png/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(headContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passengerScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dashboardText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentPanelText)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(recentFlightsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(recentFlightsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RecentFlightsContainer;
    private javax.swing.JButton addPassengerButton;
    private javax.swing.JPanel butonContainer;
    private javax.swing.JTextField classField;
    private javax.swing.JPanel classPanel;
    private javax.swing.JLabel currentPanelText;
    private javax.swing.JLabel dashboardText;
    private javax.swing.JButton deletePassengerButton;
    private javax.swing.JTextField destinationField;
    private javax.swing.JPanel destinationPanel;
    private javax.swing.JTextField flightField;
    private javax.swing.JPanel flightPanel;
    private javax.swing.JPanel headContainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
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
