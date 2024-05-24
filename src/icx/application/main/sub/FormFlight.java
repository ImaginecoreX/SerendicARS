package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author sandaruwan
 */
public class FormFlight extends javax.swing.JPanel {

    public FormFlight() {
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
        cardContainer = new javax.swing.JPanel();

        jScrollPane1.setBorder(null);

        StatusContainer.setLayout(new javax.swing.BoxLayout(StatusContainer, javax.swing.BoxLayout.LINE_AXIS));

        TodayFlightsPanel.setBackground(new java.awt.Color(224, 233, 255));
        TodayFlightsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220)));
        TodayFlightsPanel.setForeground(new java.awt.Color(220, 220, 220));

        todayTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        todayTitle.setForeground(new java.awt.Color(0, 70, 110));
        todayTitle.setText("Today's Flights");

        todayStatus.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        todayStatus.setForeground(new java.awt.Color(44, 103, 139));
        todayStatus.setText("5 More to Takeoff");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 70, 110));
        jLabel1.setText("24");

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
                .addContainerGap(91, Short.MAX_VALUE))
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
                .addContainerGap(18, Short.MAX_VALUE))
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
            .addGap(0, 202, Short.MAX_VALUE)
        );

        StatusContainer.add(gapOnePanel);

        TakeOffedPanel.setBackground(new java.awt.Color(255, 236, 136));
        TakeOffedPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220)));
        TakeOffedPanel.setForeground(new java.awt.Color(220, 220, 220));

        takeOffedTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        takeOffedTitle.setForeground(new java.awt.Color(110, 46, 0));
        takeOffedTitle.setText("Takeoffed Flights");

        takeoffedStatus.setForeground(new java.awt.Color(139, 84, 28));
        takeoffedStatus.setText("5 More to Closed");

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
                .addContainerGap(102, Short.MAX_VALUE))
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
                .addContainerGap(16, Short.MAX_VALUE))
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
            .addGap(0, 202, Short.MAX_VALUE)
        );

        StatusContainer.add(gapTwoPanel);

        ClosedPannel.setBackground(new java.awt.Color(177, 255, 150));
        ClosedPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220)));
        ClosedPannel.setForeground(new java.awt.Color(220, 220, 220));

        closedTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        closedTitle.setForeground(new java.awt.Color(0, 110, 57));
        closedTitle.setText("Closed Flights");

        closedStatus.setForeground(new java.awt.Color(35, 139, 76));
        closedStatus.setText("2 More Pending");

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
                .addContainerGap(112, Short.MAX_VALUE))
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
                .addContainerGap(16, Short.MAX_VALUE))
        );

        StatusContainer.add(ClosedPannel);

        back.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        back.setText("Dashboard >> Flight Management");

        jTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jTitle.setText("Flight Management");

        registerFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        registerFlight.setText("Register Flight");

        updateFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        updateFlight.setText("Update Flight");

        deleteFlight.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        deleteFlight.setText("Delete Flight");

        javax.swing.GroupLayout titleContainerLayout = new javax.swing.GroupLayout(titleContainer);
        titleContainer.setLayout(titleContainerLayout);
        titleContainerLayout.setHorizontalGroup(
            titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleContainerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleContainerLayout.createSequentialGroup()
                        .addComponent(back)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(titleContainerLayout.createSequentialGroup()
                        .addComponent(jTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerFlight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateFlight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteFlight)
                        .addGap(26, 26, 26))))
        );
        titleContainerLayout.setVerticalGroup(
            titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleContainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(back)
                .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTitle))
                    .addGroup(titleContainerLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cardContainerLayout = new javax.swing.GroupLayout(cardContainer);
        cardContainer.setLayout(cardContainerLayout);
        cardContainerLayout.setHorizontalGroup(
            cardContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cardContainerLayout.setVerticalGroup(
            cardContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatusContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titleContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cardContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(StatusContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

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
    private javax.swing.JPanel cardContainer;
    private javax.swing.JLabel closedStatus;
    private javax.swing.JLabel closedTitle;
    private javax.swing.JButton deleteFlight;
    private javax.swing.JPanel gapOnePanel;
    private javax.swing.JPanel gapTwoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitle;
    private javax.swing.JButton printClosedReport;
    private javax.swing.JButton printTakeoffedReport;
    private javax.swing.JButton printTodayFlightReport;
    private javax.swing.JButton registerFlight;
    private javax.swing.JLabel takeOffedTitle;
    private javax.swing.JLabel takeoffedStatus;
    private javax.swing.JPanel titleContainer;
    private javax.swing.JLabel todayStatus;
    private javax.swing.JLabel todayTitle;
    private javax.swing.JButton updateFlight;
    // End of variables declaration//GEN-END:variables
}
