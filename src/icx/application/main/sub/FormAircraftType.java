package icx.application.main.sub;

import icx.application.Application;
import icx.flight.dialog.AddAircraftType;
import icx.flight.dialog.DeleteAircraftType;
import icx.flight.dialog.UpdateAircraftType;
import icx.model.AircraftTypeDTO;
import icx.service.impl.AircraftTypeDAO;
import icx.util.CustomTableCellRenderer;
import icx.util.LoggerUtil;
import icx.util.ReportFactory;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author sandaruwan
 */
public class FormAircraftType extends javax.swing.JPanel {

    private AircraftTypeDAO aircraftTypeDAO;
    private static AircraftTypeDTO aircraftTypeDTO;

    public FormAircraftType() {
        initComponents();
        aircraftTypeDAO = new AircraftTypeDAO();
        aircraftTypeDTO = new AircraftTypeDTO();
        init();
        jTable1.setDefaultRenderer(Object.class, new CustomTableCellRenderer()); // Apply custom renderer

        // Set row height
        jTable1.setRowHeight(40); // Set custom row height
        // Add padding
        jTable1.setIntercellSpacing(new Dimension(10, 10));
        jScrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    }

    public void init() {
        //LOAD ALL AIRCRAFT MANUFACTURES
        HashMap<String, String> manufac = aircraftTypeDAO.getManufactures(manufactureComboBox);
        HashMap<String, String> models = aircraftTypeDAO.getModels(modelComboBox);
        HashMap<String, String> capacities = aircraftTypeDAO.getSeatCapacity(jComboBox7);
        HashMap<String, String> status = aircraftTypeDAO.getStatus(jComboBox6);
        /**
         * LOAD TABLE DATA
         *
         */
        try {
            aircraftTypeDAO.tableDataLoad(jTable1);
        } catch (SQLException e) {
            LoggerUtil.logWarning(e.getMessage());
        }

        jLabel1.setText(String.valueOf(manufac.size()));
        jLabel2.setText(String.valueOf(models.size()));
        jLabel3.setText(String.valueOf(capacities.size()));
    }

    private void setupListeners() {
        manufactureComboBox.addActionListener(e -> init());
        modelComboBox.addActionListener(e -> init());
        jComboBox7.addActionListener(e -> init());
        jComboBox6.addActionListener(e -> init());

    }

    private void openAddAirCraftTypeDialog() {
        AddAircraftType dialog = new AddAircraftType((JFrame) Application.app, true, "Add Aircraft Type");
        dialog.setVisible(true);
    }

    private void openUpdateAirCraftTypeDialog() {
        UpdateAircraftType dialog = new UpdateAircraftType((JFrame) Application.app, true, "Update Aircraft Type");
        dialog.setVisible(true);
    }
    
    private void openDeleteAirCraftTypeDialog() {
        DeleteAircraftType dialog = new DeleteAircraftType((JFrame) Application.app, true, "Delete Aircraft Type");
        dialog.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        StatusContainer = new javax.swing.JPanel();
        TodayFlightsPanel = new javax.swing.JPanel();
        todayTitle = new javax.swing.JLabel();
        todayStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        printTodayFlightReport = new javax.swing.JButton();
        gapOnePanel = new javax.swing.JPanel();
        TakeOffedPanel = new javax.swing.JPanel();
        takeOffedTitle = new javax.swing.JLabel();
        takeoffedStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        printTakeoffedReport = new javax.swing.JButton();
        gapTwoPanel = new javax.swing.JPanel();
        ClosedPannel = new javax.swing.JPanel();
        closedTitle = new javax.swing.JLabel();
        closedStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        printClosedReport = new javax.swing.JButton();
        titleContainer = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jTitle = new javax.swing.JLabel();
        registerFlight = new javax.swing.JButton();
        updateFlight = new javax.swing.JButton();
        deleteFlight = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        searchContainer = new javax.swing.JPanel();
        inputContainer1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        aircraftTypeName = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        manufactureComboBox = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        modelComboBox = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        inputContainer2 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel30 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jPanel28 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        gap = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        resultContainer = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jScrollPane1.setBorder(null);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        StatusContainer.setMaximumSize(new java.awt.Dimension(98321, 192));
        StatusContainer.setMinimumSize(new java.awt.Dimension(20, 192));
        StatusContainer.setPreferredSize(new java.awt.Dimension(802, 198));
        StatusContainer.setLayout(new javax.swing.BoxLayout(StatusContainer, javax.swing.BoxLayout.LINE_AXIS));

        TodayFlightsPanel.setBackground(new java.awt.Color(224, 233, 255));
        TodayFlightsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220)));
        TodayFlightsPanel.setForeground(new java.awt.Color(220, 220, 220));

        todayTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        todayTitle.setForeground(new java.awt.Color(0, 70, 110));
        todayTitle.setText("Manufactures");

        todayStatus.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        todayStatus.setForeground(new java.awt.Color(44, 103, 139));
        todayStatus.setText("Aircraft Manufactures");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 70, 110));
        jLabel1.setText("12");

        printTodayFlightReport.setBackground(new java.awt.Color(77, 159, 255));
        printTodayFlightReport.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        printTodayFlightReport.setForeground(new java.awt.Color(255, 255, 255));
        printTodayFlightReport.setText("GET REPORT 􀎚   ");
        printTodayFlightReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTodayFlightReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TodayFlightsPanelLayout = new javax.swing.GroupLayout(TodayFlightsPanel);
        TodayFlightsPanel.setLayout(TodayFlightsPanelLayout);
        TodayFlightsPanelLayout.setHorizontalGroup(
            TodayFlightsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayFlightsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TodayFlightsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(todayStatus)
                    .addComponent(todayTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TodayFlightsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printTodayFlightReport, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        TodayFlightsPanelLayout.setVerticalGroup(
            TodayFlightsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayFlightsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(todayTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todayStatus)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printTodayFlightReport, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        StatusContainer.add(TodayFlightsPanel);

        gapOnePanel.setMaximumSize(new java.awt.Dimension(10, 32767));
        gapOnePanel.setMinimumSize(new java.awt.Dimension(10, 0));

        javax.swing.GroupLayout gapOnePanelLayout = new javax.swing.GroupLayout(gapOnePanel);
        gapOnePanel.setLayout(gapOnePanelLayout);
        gapOnePanelLayout.setHorizontalGroup(
            gapOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        gapOnePanelLayout.setVerticalGroup(
            gapOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        StatusContainer.add(gapOnePanel);

        TakeOffedPanel.setBackground(new java.awt.Color(255, 236, 136));
        TakeOffedPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220)));
        TakeOffedPanel.setForeground(new java.awt.Color(220, 220, 220));

        takeOffedTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        takeOffedTitle.setForeground(new java.awt.Color(110, 46, 0));
        takeOffedTitle.setText("Models");

        takeoffedStatus.setForeground(new java.awt.Color(139, 84, 28));
        takeoffedStatus.setText("Aircraft Models");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 46, 0));
        jLabel2.setText("47");

        printTakeoffedReport.setBackground(new java.awt.Color(255, 130, 77));
        printTakeoffedReport.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        printTakeoffedReport.setForeground(new java.awt.Color(255, 255, 255));
        printTakeoffedReport.setText("GET REPORT 􀎚   ");
        printTakeoffedReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTakeoffedReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TakeOffedPanelLayout = new javax.swing.GroupLayout(TakeOffedPanel);
        TakeOffedPanel.setLayout(TakeOffedPanelLayout);
        TakeOffedPanelLayout.setHorizontalGroup(
            TakeOffedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TakeOffedPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TakeOffedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(takeoffedStatus)
                    .addComponent(takeOffedTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TakeOffedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printTakeoffedReport, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        TakeOffedPanelLayout.setVerticalGroup(
            TakeOffedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TakeOffedPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(takeOffedTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(takeoffedStatus)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printTakeoffedReport, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StatusContainer.add(TakeOffedPanel);

        gapTwoPanel.setMaximumSize(new java.awt.Dimension(10, 32767));
        gapTwoPanel.setMinimumSize(new java.awt.Dimension(10, 0));

        javax.swing.GroupLayout gapTwoPanelLayout = new javax.swing.GroupLayout(gapTwoPanel);
        gapTwoPanel.setLayout(gapTwoPanelLayout);
        gapTwoPanelLayout.setHorizontalGroup(
            gapTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        gapTwoPanelLayout.setVerticalGroup(
            gapTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        StatusContainer.add(gapTwoPanel);

        ClosedPannel.setBackground(new java.awt.Color(177, 255, 150));
        ClosedPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220)));
        ClosedPannel.setForeground(new java.awt.Color(220, 220, 220));

        closedTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        closedTitle.setForeground(new java.awt.Color(0, 110, 57));
        closedTitle.setText("Capacity");

        closedStatus.setForeground(new java.awt.Color(35, 139, 76));
        closedStatus.setText("Aircraft Seat Categories");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 110, 57));
        jLabel3.setText("17");

        printClosedReport.setBackground(new java.awt.Color(0, 174, 59));
        printClosedReport.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        printClosedReport.setForeground(new java.awt.Color(255, 255, 255));
        printClosedReport.setText("GET REPORT 􀎚   ");
        printClosedReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printClosedReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClosedPannelLayout = new javax.swing.GroupLayout(ClosedPannel);
        ClosedPannel.setLayout(ClosedPannelLayout);
        ClosedPannelLayout.setHorizontalGroup(
            ClosedPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClosedPannelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ClosedPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(closedStatus)
                    .addComponent(closedTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClosedPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printClosedReport, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        ClosedPannelLayout.setVerticalGroup(
            ClosedPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClosedPannelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(closedTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closedStatus)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printClosedReport, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StatusContainer.add(ClosedPannel);

        jPanel1.add(StatusContainer);

        titleContainer.setMaximumSize(new java.awt.Dimension(32767, 134));
        titleContainer.setMinimumSize(new java.awt.Dimension(0, 134));
        titleContainer.setPreferredSize(new java.awt.Dimension(849, 134));

        back.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        back.setText("Dashboard >> Flight Management >> Aircraft Type");

        jTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jTitle.setText("Aircraft Type");

        registerFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        registerFlight.setText("Register Type");
        registerFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerFlightActionPerformed(evt);
            }
        });

        updateFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        updateFlight.setText("Update Type");
        updateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFlightActionPerformed(evt);
            }
        });

        deleteFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        deleteFlight.setText("Delete Type");
        deleteFlight.setMinimumSize(new java.awt.Dimension(120, 24));
        deleteFlight.setPreferredSize(new java.awt.Dimension(120, 24));
        deleteFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titleContainerLayout = new javax.swing.GroupLayout(titleContainer);
        titleContainer.setLayout(titleContainerLayout);
        titleContainerLayout.setHorizontalGroup(
            titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleContainerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(jTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(registerFlight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateFlight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jSeparator1)
        );
        titleContainerLayout.setVerticalGroup(
            titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleContainerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTitle)
                    .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(registerFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(titleContainer);

        searchContainer.setLayout(new javax.swing.BoxLayout(searchContainer, javax.swing.BoxLayout.PAGE_AXIS));

        inputContainer1.setMaximumSize(new java.awt.Dimension(131218, 100));
        inputContainer1.setPreferredSize(new java.awt.Dimension(849, 100));
        inputContainer1.setLayout(new javax.swing.BoxLayout(inputContainer1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel5.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel5.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inputContainer1.add(jPanel5);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel8.setText("Name");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 130, Short.MAX_VALUE))
            .addComponent(aircraftTypeName, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aircraftTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        inputContainer1.add(jPanel6);

        jPanel11.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel11.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel11.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inputContainer1.add(jPanel11);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel9.setText("Manufacture");

        manufactureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 113, Short.MAX_VALUE))
            .addComponent(manufactureComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 194, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manufactureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        inputContainer1.add(jPanel7);

        jPanel13.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel13.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel13.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inputContainer1.add(jPanel13);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel10.setText("Model");

        modelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 135, Short.MAX_VALUE))
            .addComponent(modelComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 174, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        inputContainer1.add(jPanel8);

        jPanel12.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel12.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel12.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inputContainer1.add(jPanel12);

        jButton2.setBackground(new java.awt.Color(40, 168, 240));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setMinimumSize(new java.awt.Dimension(120, 36));
        jButton2.setPreferredSize(new java.awt.Dimension(120, 36));
        jButton2.setSize(new java.awt.Dimension(120, 23));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        inputContainer1.add(jPanel9);

        jPanel10.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel10.setMinimumSize(new java.awt.Dimension(30, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        inputContainer1.add(jPanel10);

        searchContainer.add(inputContainer1);

        inputContainer2.setMaximumSize(new java.awt.Dimension(131218, 112));
        inputContainer2.setMinimumSize(new java.awt.Dimension(150, 112));
        inputContainer2.setLayout(new javax.swing.BoxLayout(inputContainer2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel24.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel24.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel24.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel24);

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel15.setText("Seat Capacity");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 123, Short.MAX_VALUE))
            .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.TRAILING, 0, 212, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        inputContainer2.add(jPanel29);

        jPanel30.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel30.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel30.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel30);

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel14.setText("Status");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 144, Short.MAX_VALUE))
            .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.TRAILING, 0, 184, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        inputContainer2.add(jPanel27);

        jPanel28.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel28.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel28.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel28);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel25);

        jPanel26.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel26.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel26.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel26);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel31);

        jPanel32.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel32.setMinimumSize(new java.awt.Dimension(30, 0));
        jPanel32.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel32);

        searchContainer.add(inputContainer2);

        jPanel1.add(searchContainer);

        javax.swing.GroupLayout gapLayout = new javax.swing.GroupLayout(gap);
        gap.setLayout(gapLayout);
        gapLayout.setHorizontalGroup(
            gapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        gapLayout.setVerticalGroup(
            gapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gapLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel1.add(gap);

        resultContainer.setLayout(new javax.swing.BoxLayout(resultContainer, javax.swing.BoxLayout.LINE_AXIS));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Type ID", "Name", "Manufacturer", "Model", "Seat Capacity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        resultContainer.add(jPanel14);

        jPanel1.add(resultContainer);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printTodayFlightReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTodayFlightReportActionPerformed
        // TODO add your handling code here:
        ReportFactory factory = new ReportFactory();
        factory.getAircraftManufactureReport();
    }//GEN-LAST:event_printTodayFlightReportActionPerformed

    private void printTakeoffedReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTakeoffedReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printTakeoffedReportActionPerformed

    private void printClosedReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printClosedReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printClosedReportActionPerformed

    private void registerFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerFlightActionPerformed
        // TODO add your handling code here:
        openAddAirCraftTypeDialog();
    }//GEN-LAST:event_registerFlightActionPerformed

    private void updateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFlightActionPerformed
        // TODO add your handling code here:
        openUpdateAirCraftTypeDialog();
    }//GEN-LAST:event_updateFlightActionPerformed

    private void deleteFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFlightActionPerformed
        // TODO add your handling code here:
        openDeleteAirCraftTypeDialog();
    }//GEN-LAST:event_deleteFlightActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClosedPannel;
    private javax.swing.JPanel StatusContainer;
    private javax.swing.JPanel TakeOffedPanel;
    private javax.swing.JPanel TodayFlightsPanel;
    private javax.swing.JTextField aircraftTypeName;
    private javax.swing.JLabel back;
    private javax.swing.JLabel closedStatus;
    private javax.swing.JLabel closedTitle;
    private javax.swing.JButton deleteFlight;
    private javax.swing.JPanel gap;
    private javax.swing.JPanel gapOnePanel;
    private javax.swing.JPanel gapTwoPanel;
    private javax.swing.JPanel inputContainer1;
    private javax.swing.JPanel inputContainer2;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jTitle;
    private javax.swing.JComboBox<String> manufactureComboBox;
    private javax.swing.JComboBox<String> modelComboBox;
    private javax.swing.JButton printClosedReport;
    private javax.swing.JButton printTakeoffedReport;
    private javax.swing.JButton printTodayFlightReport;
    private javax.swing.JButton registerFlight;
    private javax.swing.JPanel resultContainer;
    private javax.swing.JPanel searchContainer;
    private javax.swing.JLabel takeOffedTitle;
    private javax.swing.JLabel takeoffedStatus;
    private javax.swing.JPanel titleContainer;
    private javax.swing.JLabel todayStatus;
    private javax.swing.JLabel todayTitle;
    private javax.swing.JButton updateFlight;
    // End of variables declaration//GEN-END:variables
}
