package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;
import icx.application.Application;
import icx.flight.airline.AirlineCard;
import icx.flight.dialog.RegisterAirline;
import icx.flight.dialog.UpdateAirline;
import icx.flight.airline.AirlineCardWrapper;
import icx.model.AirlineDTO;
import icx.service.impl.AirlineDAO;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author sandaruwan
 */
public class FormAirline extends javax.swing.JPanel {
    
    private AirlineDAO service;
    public static AirlineDTO airlineDTO;
    public static List<AirlineDTO> CARD_LIST;

    public FormAirline() {
        initComponents();
        init();
        loadAirlines();
    }

    
    
    public void init (){
        service = new AirlineDAO();
        service.loadAllAirlineCountries(countryComboBox);
      
        
        this.airlineCount.setText(String.valueOf(service.getAllAirlineCount()));
        this.airlineInActiveCount.setText(String.valueOf(service.getAllInActiveAirlineCount())+" Inactive");
        this.airlineCountriesCount.setText(String.valueOf(service.getAllAirlineCountriesCount()));
    }
    
    private void loadAirlines(){
        AirlineCardWrapper.getAirlines(AirlineCardContainer, countryComboBox, nameField.getText(), codeField.getText());
    }

    // action listeners for text fields and combo box to trigger loadAirlines() on value change
    private void setupListeners(){
    countryComboBox.addActionListener(e -> loadAirlines());
    nameField.addActionListener(e -> loadAirlines());
    codeField.addActionListener(e -> loadAirlines());
    }
    
    private void openRegisterAirlineDialog(){
        RegisterAirline dialog = new RegisterAirline((JFrame) Application.app, true,"Register Airline");
        dialog.setVisible(true);
    }
    
    public static void openUpdateAirlineDialog(AirlineDTO dto){
        UpdateAirline dialog = new UpdateAirline((JFrame) Application.app, true, "Update Airline", dto);
        dialog.setVisible(true);
    }
    
    private void openDeleteAirlineDialog(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        StatusContainer = new javax.swing.JPanel();
        TodayFlightsPanel = new javax.swing.JPanel();
        todayTitle = new javax.swing.JLabel();
        airlineInActiveCount = new javax.swing.JLabel();
        airlineCount = new javax.swing.JLabel();
        printTodayFlightReport = new javax.swing.JButton();
        gapOnePanel = new javax.swing.JPanel();
        TakeOffedPanel = new javax.swing.JPanel();
        takeOffedTitle = new javax.swing.JLabel();
        takeoffedStatus = new javax.swing.JLabel();
        airlineCountriesCount = new javax.swing.JLabel();
        printTakeoffedReport = new javax.swing.JButton();
        gapTwoPanel = new javax.swing.JPanel();
        ClosedPannel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registerAirline = new javax.swing.JButton();
        updateAirline = new javax.swing.JButton();
        deleteAirline = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        searchAction = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        AirlineCardContainer = new javax.swing.JPanel();

        jScrollPane1.setBorder(null);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        StatusContainer.setMaximumSize(new java.awt.Dimension(98321, 192));
        StatusContainer.setMinimumSize(new java.awt.Dimension(20, 192));
        StatusContainer.setPreferredSize(new java.awt.Dimension(802, 198));
        StatusContainer.setLayout(new javax.swing.BoxLayout(StatusContainer, javax.swing.BoxLayout.LINE_AXIS));

        TodayFlightsPanel.setBackground(new java.awt.Color(224, 233, 255));
        TodayFlightsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220)));
        TodayFlightsPanel.setForeground(new java.awt.Color(220, 220, 220));
        TodayFlightsPanel.setMinimumSize(new java.awt.Dimension(240, 0));
        TodayFlightsPanel.setPreferredSize(new java.awt.Dimension(240, 198));

        todayTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        todayTitle.setForeground(new java.awt.Color(0, 70, 110));
        todayTitle.setText("Airlines");

        airlineInActiveCount.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        airlineInActiveCount.setForeground(new java.awt.Color(44, 103, 139));
        airlineInActiveCount.setText("3 Inactive");

        airlineCount.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        airlineCount.setForeground(new java.awt.Color(0, 70, 110));
        airlineCount.setText("89");

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
                    .addComponent(airlineCount)
                    .addComponent(airlineInActiveCount)
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
                .addComponent(airlineInActiveCount)
                .addGap(18, 18, 18)
                .addComponent(airlineCount)
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
        TakeOffedPanel.setMinimumSize(new java.awt.Dimension(240, 0));
        TakeOffedPanel.setPreferredSize(new java.awt.Dimension(240, 192));

        takeOffedTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        takeOffedTitle.setForeground(new java.awt.Color(110, 46, 0));
        takeOffedTitle.setText("Countries");

        takeoffedStatus.setForeground(new java.awt.Color(139, 84, 28));
        takeoffedStatus.setText("Airline Countries Count");

        airlineCountriesCount.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        airlineCountriesCount.setForeground(new java.awt.Color(110, 46, 0));
        airlineCountriesCount.setText("56");

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
                    .addComponent(airlineCountriesCount)
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
                .addComponent(airlineCountriesCount)
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

        ClosedPannel.setForeground(new java.awt.Color(220, 220, 220));

        javax.swing.GroupLayout ClosedPannelLayout = new javax.swing.GroupLayout(ClosedPannel);
        ClosedPannel.setLayout(ClosedPannelLayout);
        ClosedPannelLayout.setHorizontalGroup(
            ClosedPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        ClosedPannelLayout.setVerticalGroup(
            ClosedPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        StatusContainer.add(ClosedPannel);

        jPanel1.add(StatusContainer);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Dashboard > Flight Management >> Airline");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel4.setText("Airline");

        registerAirline.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        registerAirline.setText("Register Airline");
        registerAirline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAirlineActionPerformed(evt);
            }
        });

        updateAirline.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        updateAirline.setText("Update Airline");

        deleteAirline.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        deleteAirline.setText("Delete Airline");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                        .addComponent(registerAirline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateAirline, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteAirline, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateAirline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteAirline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerAirline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(131218, 112));
        jPanel3.setMinimumSize(new java.awt.Dimension(150, 112));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

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
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel8.setText("Country");

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                countryComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(countryComboBox, 0, 193, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6);

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
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel9.setText("Name");

        nameField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nameFieldInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7);

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
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel13);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel10.setText("Airline Code");

        codeField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                codeFieldInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(codeField, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8);

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
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel12);

        searchAction.setBackground(new java.awt.Color(40, 168, 240));
        searchAction.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchAction.setForeground(new java.awt.Color(255, 255, 255));
        searchAction.setText("Search");
        searchAction.setMinimumSize(new java.awt.Dimension(120, 36));
        searchAction.setPreferredSize(new java.awt.Dimension(120, 36));
        searchAction.setSize(new java.awt.Dimension(120, 23));
        searchAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(searchAction, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel9);

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
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10);

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout AirlineCardContainerLayout = new javax.swing.GroupLayout(AirlineCardContainer);
        AirlineCardContainer.setLayout(AirlineCardContainerLayout);
        AirlineCardContainerLayout.setHorizontalGroup(
            AirlineCardContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AirlineCardContainerLayout.setVerticalGroup(
            AirlineCardContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
            .addComponent(AirlineCardContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AirlineCardContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printTodayFlightReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTodayFlightReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printTodayFlightReportActionPerformed

    private void printTakeoffedReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTakeoffedReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printTakeoffedReportActionPerformed

    private void searchActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionActionPerformed
    
        loadAirlines();
        
    }//GEN-LAST:event_searchActionActionPerformed

    private void countryComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_countryComboBoxItemStateChanged
         loadAirlines();
    }//GEN-LAST:event_countryComboBoxItemStateChanged

    private void nameFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nameFieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldInputMethodTextChanged

    private void codeFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_codeFieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_codeFieldInputMethodTextChanged

    private void registerAirlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAirlineActionPerformed
        // TODO add your handling code here:
        openRegisterAirlineDialog();
    }//GEN-LAST:event_registerAirlineActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AirlineCardContainer;
    private javax.swing.JPanel ClosedPannel;
    private javax.swing.JPanel StatusContainer;
    private javax.swing.JPanel TakeOffedPanel;
    private javax.swing.JPanel TodayFlightsPanel;
    private javax.swing.JLabel airlineCount;
    private javax.swing.JLabel airlineCountriesCount;
    private javax.swing.JLabel airlineInActiveCount;
    private javax.swing.JTextField codeField;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JButton deleteAirline;
    private javax.swing.JPanel gapOnePanel;
    private javax.swing.JPanel gapTwoPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton printTakeoffedReport;
    private javax.swing.JButton printTodayFlightReport;
    private javax.swing.JButton registerAirline;
    private javax.swing.JButton searchAction;
    private javax.swing.JLabel takeOffedTitle;
    private javax.swing.JLabel takeoffedStatus;
    private javax.swing.JLabel todayTitle;
    private javax.swing.JButton updateAirline;
    // End of variables declaration//GEN-END:variables
}
