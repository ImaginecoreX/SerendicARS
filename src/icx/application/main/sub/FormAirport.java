package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author sandaruwan
 */
public class FormAirport extends javax.swing.JPanel {

    public FormAirport() {
        initComponents();

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
        jTextField6 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        inputContainer2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        gap = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        resultContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();

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
        todayTitle.setText("Airports");

        todayStatus.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        todayStatus.setForeground(new java.awt.Color(44, 103, 139));
        todayStatus.setText("1 Inactive");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 70, 110));
        jLabel1.setText("48");

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
        takeOffedTitle.setText("Countries");

        takeoffedStatus.setForeground(new java.awt.Color(139, 84, 28));
        takeoffedStatus.setText("Airport Countries Count");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 46, 0));
        jLabel2.setText("19");

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
        closedTitle.setText("Cities");

        closedStatus.setForeground(new java.awt.Color(35, 139, 76));
        closedStatus.setText("Aiport Cities Count");

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
        back.setText("Dashboard >> Flight Management >> Airport");

        jTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jTitle.setText("Airport");

        registerFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        registerFlight.setText("Register Airport");

        updateFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        updateFlight.setText("Update Airport");

        deleteFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        deleteFlight.setText("Delete Airport");
        deleteFlight.setMinimumSize(new java.awt.Dimension(120, 24));
        deleteFlight.setPreferredSize(new java.awt.Dimension(120, 24));

        javax.swing.GroupLayout titleContainerLayout = new javax.swing.GroupLayout(titleContainer);
        titleContainer.setLayout(titleContainerLayout);
        titleContainerLayout.setHorizontalGroup(
            titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleContainerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(jTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
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
                .addGap(0, 142, Short.MAX_VALUE))
            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel9.setText("Country");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 125, Short.MAX_VALUE))
            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, 0, 175, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel10.setText("City");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 150, Short.MAX_VALUE))
            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, 0, 174, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel14.setText("Airport Code");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel14.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel14.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel14.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel14);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel11.setText("Latitude");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        inputContainer2.add(jPanel15);

        jPanel16.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel16.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel16.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel16);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel12.setText("Longitude");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        inputContainer2.add(jPanel17);

        jPanel18.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel18.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel18.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel18);

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel13.setText("Airport Status");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jComboBox3, 0, 190, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        inputContainer2.add(jPanel19);

        jPanel20.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel20.setMinimumSize(new java.awt.Dimension(30, 100));
        jPanel20.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel20);

        jButton2.setBackground(new java.awt.Color(40, 168, 240));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setMinimumSize(new java.awt.Dimension(120, 36));
        jButton2.setPreferredSize(new java.awt.Dimension(120, 36));
        jButton2.setSize(new java.awt.Dimension(120, 23));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        inputContainer2.add(jPanel21);

        jPanel22.setMaximumSize(new java.awt.Dimension(30, 32767));
        jPanel22.setMinimumSize(new java.awt.Dimension(30, 0));
        jPanel22.setPreferredSize(new java.awt.Dimension(30, 112));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        inputContainer2.add(jPanel22);

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

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane2.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Code", "Country"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel4);

        jPanel2.add(jScrollPane2);

        resultContainer.add(jPanel2);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        resultContainer.add(jPanel3);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printTodayFlightReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTodayFlightReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printTodayFlightReportActionPerformed

    private void printTakeoffedReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTakeoffedReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printTakeoffedReportActionPerformed

    private void printClosedReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printClosedReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printClosedReportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClosedPannel;
    private javax.swing.JPanel StatusContainer;
    private javax.swing.JPanel TakeOffedPanel;
    private javax.swing.JPanel TodayFlightsPanel;
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
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jTitle;
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
