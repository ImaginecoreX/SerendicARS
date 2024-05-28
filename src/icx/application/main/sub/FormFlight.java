package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author sandaruwan
 */
public class FormFlight extends javax.swing.JPanel {

    public FormFlight() {
        initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        lb = new javax.swing.JLabel();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Flight Management Form");
        FlightScrollPanel = new javax.swing.JScrollPane();
        flightContainerPanel = new javax.swing.JPanel();
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
        cardContainerStartGap = new javax.swing.JPanel();
        inputContainer = new javax.swing.JPanel();
        aircraftTypeLabel = new javax.swing.JLabel();
        aircraftTypeSelect = new javax.swing.JComboBox<>();
        departureAirportSelect = new javax.swing.JComboBox<>();
        departureAirportLabel = new javax.swing.JLabel();
        arrivalAirportSelect = new javax.swing.JComboBox<>();
        arrivalAirportLabel = new javax.swing.JLabel();
        dapartureDateSelect = new javax.swing.JComboBox<>();
        departureDateTimeLabel = new javax.swing.JLabel();
        arrivalDateSelect = new javax.swing.JComboBox<>();
        arrivalDateTimeLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        durationField = new javax.swing.JTextField();
        searchFlight = new javax.swing.JButton();
        cardContainerMiddleGapBar = new javax.swing.JPanel();
        resultContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cardContainerEndGap = new javax.swing.JPanel();

        FlightScrollPanel.setBorder(null);

        flightContainerPanel.setMinimumSize(new java.awt.Dimension(829, 0));
        flightContainerPanel.setLayout(new javax.swing.BoxLayout(flightContainerPanel, javax.swing.BoxLayout.PAGE_AXIS));

        StatusContainer.setMaximumSize(new java.awt.Dimension(98321, 192));
        StatusContainer.setMinimumSize(new java.awt.Dimension(20, 192));
        StatusContainer.setPreferredSize(new java.awt.Dimension(802, 198));
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

        flightContainerPanel.add(StatusContainer);

        titleContainer.setMaximumSize(new java.awt.Dimension(32767, 120));
        titleContainer.setMinimumSize(new java.awt.Dimension(0, 120));

        back.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        back.setText("Dashboard >> Flight Management >> Flights");

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
                .addGap(18, 18, 18)
                .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleContainerLayout.createSequentialGroup()
                        .addComponent(back)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(titleContainerLayout.createSequentialGroup()
                        .addComponent(jTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(registerFlight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateFlight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteFlight)
                        .addGap(20, 20, 20))))
        );
        titleContainerLayout.setVerticalGroup(
            titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleContainerLayout.createSequentialGroup()
                .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleContainerLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTitle))
                    .addGroup(titleContainerLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(titleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        flightContainerPanel.add(titleContainer);

        cardContainer.setLayout(new javax.swing.BoxLayout(cardContainer, javax.swing.BoxLayout.LINE_AXIS));

        cardContainerStartGap.setMaximumSize(new java.awt.Dimension(10, 32767));
        cardContainerStartGap.setMinimumSize(new java.awt.Dimension(10, 100));

        javax.swing.GroupLayout cardContainerStartGapLayout = new javax.swing.GroupLayout(cardContainerStartGap);
        cardContainerStartGap.setLayout(cardContainerStartGapLayout);
        cardContainerStartGapLayout.setHorizontalGroup(
            cardContainerStartGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cardContainerStartGapLayout.setVerticalGroup(
            cardContainerStartGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        cardContainer.add(cardContainerStartGap);

        inputContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 88, 97), 1, true));
        inputContainer.setMaximumSize(new java.awt.Dimension(270, 32767));
        inputContainer.setMinimumSize(new java.awt.Dimension(180, 0));

        aircraftTypeLabel.setText("Aircraft Type");

        aircraftTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        departureAirportSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        departureAirportLabel.setText("Departure Airport");

        arrivalAirportSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        arrivalAirportLabel.setText("Arrival Airport");

        dapartureDateSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        departureDateTimeLabel.setText("Departure Date & Time");

        arrivalDateSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        arrivalDateTimeLabel.setText("Arrival Date & Time");

        durationLabel.setText("Duration");

        durationField.setEditable(false);

        searchFlight.setText("Search Flight");

        javax.swing.GroupLayout inputContainerLayout = new javax.swing.GroupLayout(inputContainer);
        inputContainer.setLayout(inputContainerLayout);
        inputContainerLayout.setHorizontalGroup(
            inputContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(inputContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(durationLabel)
                    .addComponent(arrivalDateTimeLabel)
                    .addComponent(departureDateTimeLabel)
                    .addComponent(arrivalAirportLabel)
                    .addComponent(departureAirportLabel)
                    .addComponent(aircraftTypeLabel)
                    .addComponent(aircraftTypeSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(departureAirportSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arrivalAirportSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dapartureDateSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arrivalDateSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(durationField)
                    .addComponent(searchFlight, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputContainerLayout.setVerticalGroup(
            inputContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(aircraftTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aircraftTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(departureAirportLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(departureAirportSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalAirportLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrivalAirportSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(departureDateTimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dapartureDateSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arrivalDateTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrivalDateSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(durationField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardContainer.add(inputContainer);

        cardContainerMiddleGapBar.setMaximumSize(new java.awt.Dimension(10, 32767));
        cardContainerMiddleGapBar.setMinimumSize(new java.awt.Dimension(10, 100));

        javax.swing.GroupLayout cardContainerMiddleGapBarLayout = new javax.swing.GroupLayout(cardContainerMiddleGapBar);
        cardContainerMiddleGapBar.setLayout(cardContainerMiddleGapBarLayout);
        cardContainerMiddleGapBarLayout.setHorizontalGroup(
            cardContainerMiddleGapBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cardContainerMiddleGapBarLayout.setVerticalGroup(
            cardContainerMiddleGapBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        cardContainer.add(cardContainerMiddleGapBar);

        resultContainer.setLayout(new javax.swing.BoxLayout(resultContainer, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 88, 97)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        resultContainer.add(jPanel2);

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 10));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        resultContainer.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(224, 233, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 88, 97), 1, true));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 48));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 48));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        resultContainer.add(jPanel3);

        cardContainer.add(resultContainer);

        cardContainerEndGap.setMaximumSize(new java.awt.Dimension(10, 32767));
        cardContainerEndGap.setMinimumSize(new java.awt.Dimension(10, 100));
        cardContainerEndGap.setPreferredSize(new java.awt.Dimension(10, 610));

        javax.swing.GroupLayout cardContainerEndGapLayout = new javax.swing.GroupLayout(cardContainerEndGap);
        cardContainerEndGap.setLayout(cardContainerEndGapLayout);
        cardContainerEndGapLayout.setHorizontalGroup(
            cardContainerEndGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cardContainerEndGapLayout.setVerticalGroup(
            cardContainerEndGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        cardContainer.add(cardContainerEndGap);

        flightContainerPanel.add(cardContainer);

        FlightScrollPanel.setViewportView(flightContainerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify                     
    private javax.swing.JLabel lb;

    .addComponent(FlightScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
            

    806, Short.MAX_VALUE)
        );
    layout.setVerticalGroup (
            layout.createParallelGroup







(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FlightScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>                        

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
    private javax.swing.JScrollPane FlightScrollPanel;
    private javax.swing.JPanel StatusContainer;
    private javax.swing.JPanel TakeOffedPanel;
    private javax.swing.JPanel TodayFlightsPanel;
    private javax.swing.JLabel aircraftTypeLabel;
    private javax.swing.JComboBox<String> aircraftTypeSelect;
    private javax.swing.JLabel arrivalAirportLabel;
    private javax.swing.JComboBox<String> arrivalAirportSelect;
    private javax.swing.JComboBox<String> arrivalDateSelect;
    private javax.swing.JLabel arrivalDateTimeLabel;
    private javax.swing.JLabel back;
    private javax.swing.JPanel cardContainer;
    private javax.swing.JPanel cardContainerEndGap;
    private javax.swing.JPanel cardContainerMiddleGapBar;
    private javax.swing.JPanel cardContainerStartGap;
    private javax.swing.JLabel closedStatus;
    private javax.swing.JLabel closedTitle;
    private javax.swing.JComboBox<String> dapartureDateSelect;
    private javax.swing.JButton deleteFlight;
    private javax.swing.JLabel departureAirportLabel;
    private javax.swing.JComboBox<String> departureAirportSelect;
    private javax.swing.JLabel departureDateTimeLabel;
    private javax.swing.JTextField durationField;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JPanel flightContainerPanel;
    private javax.swing.JPanel gapOnePanel;
    private javax.swing.JPanel gapTwoPanel;
    private javax.swing.JPanel inputContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jTitle;
    private javax.swing.JButton printClosedReport;
    private javax.swing.JButton printTakeoffedReport;
    private javax.swing.JButton printTodayFlightReport;
    private javax.swing.JButton registerFlight;
    private javax.swing.JPanel resultContainer;
    private javax.swing.JButton searchFlight;
    private javax.swing.JLabel takeOffedTitle;
    private javax.swing.JLabel takeoffedStatus;
    private javax.swing.JPanel titleContainer;
    private javax.swing.JLabel todayStatus;
    private javax.swing.JLabel todayTitle;
    private javax.swing.JButton updateFlight;
>>>>>>> 792616c6aadbd71c837148df9f443a5cd034034b
    // End of variables declaration//GEN-END:variables
}
