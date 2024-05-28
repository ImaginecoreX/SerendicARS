package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import icx.application.Application;
import icx.flight.dialog.AddDistance;
import icx.flight.dialog.DeleteDistance;
import icx.flight.dialog.UpdateDistance;
import icx.util.LoggerUtil;
import icx.model.DistanceDTO;
import icx.service.AirportService;
import icx.service.impl.AirportDAO;
import icx.service.impl.DistanceDAO;
import icx.table.TableButtonCellRenderer;
import icx.table.TableContentCenterCellRenderer;
import icx.table.TableSwitchButtonCellEditor;
import icx.table.TableSwitchButtonCellRenderer;
import icx.table.header.TableButtonHeaderRenderer;
import icx.table.header.TableCheckBoxHeaderRenderer;
import icx.util.CustomTableCellRenderer;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandaruwan
 */
public class FormDistanceCalculation extends javax.swing.JPanel {

    private static List<DistanceDTO> disatances;
    private static AirportDAO airportDAO;
    private static DistanceDAO distanceDAO;

    public FormDistanceCalculation() {
        initComponents();
        updateDistanceAction.setEnabled(false);
        deleteDistanceAction.setEnabled(false);
        airportDAO = new AirportDAO();
        distanceDAO = new DistanceDAO();
        init();
        distanceTable.setDefaultRenderer(Object.class, new CustomTableCellRenderer()); // Apply custom renderer

        // Set row height
        distanceTable.setRowHeight(40); // Set custom row height
        // Add padding
        distanceTable.setIntercellSpacing(new Dimension(10, 10));
        tableScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        mapImage.setHorizontalAlignment(JLabel.CENTER);
        mapImage.setIcon(new FlatSVGIcon("icx/resources/flights/svg/map.svg", mapPanel.getWidth(), mapPanel.getHeight()));

    }

    public void init() {
        /**
         * LOAD FROM AIRPORTS
         *
         */
        try {
            airportDAO.loadAllAirportNames(aiport1ID, AirportService.DESTINATION.FROM);
        } catch (SQLException e) {
            LoggerUtil.logWarning(e.getMessage());
        }

        /**
         * LOAD TO AIRPORTS
         *
         */
        try {
            airportDAO.loadAllAirportNames(airport2ID, AirportService.DESTINATION.TO);
        } catch (SQLException e) {
            LoggerUtil.logWarning(e.getMessage());
        }

        /**
         * LOAD TABLE DATA
         *
         */
        try {
            distanceDAO.tableDataLoad(distanceTable);
        } catch (SQLException e) {
            LoggerUtil.logWarning(e.getMessage());
        }

    }

    private void openAddDistanceDialog() {
        AddDistance dialog = new AddDistance((JFrame) Application.app, true, "Add Distance", this);
        dialog.setVisible(true);
    }

    private void openUpdateDistanceDialog() {
        UpdateDistance dialog = new UpdateDistance((JFrame) Application.app, true, "Update Distance");
        dialog.setVisible(true);
    }

    private void openDeleteDistanceDialog() {
        DeleteDistance dialog = new DeleteDistance((JFrame) Application.app, true, "Delete Distance");
        dialog.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        DistanceScrollPanel = new javax.swing.JScrollPane();
        DistanceContainerPanel = new javax.swing.JPanel();
        mapPanel = new javax.swing.JPanel();
        mapImage = new javax.swing.JLabel();
        calculatorPanel = new javax.swing.JPanel();
        distanceCounter = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        airport2ID = new javax.swing.JComboBox<>();
        aiport1ID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        actionCalculate = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        updateDistanceAction = new javax.swing.JButton();
        addDistanceAction = new javax.swing.JButton();
        deleteDistanceAction = new javax.swing.JButton();
        tableDataPanel = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        distanceTable = new javax.swing.JTable();

        DistanceScrollPanel.setBorder(null);

        DistanceContainerPanel.setLayout(new javax.swing.BoxLayout(DistanceContainerPanel, javax.swing.BoxLayout.PAGE_AXIS));

        mapPanel.setBackground(new java.awt.Color(0, 102, 153));
        mapPanel.setMaximumSize(new java.awt.Dimension(32767, 200));
        mapPanel.setMinimumSize(new java.awt.Dimension(0, 200));
        mapPanel.setPreferredSize(new java.awt.Dimension(804, 200));
        mapPanel.setLayout(new java.awt.CardLayout());

        mapImage.setText(" ");
        mapPanel.add(mapImage, "card2");

        DistanceContainerPanel.add(mapPanel);

        distanceCounter.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        distanceCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distanceCounter.setText("0000.00 KM");

        infoLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Select Destination To Calculate Distance!");

        airport2ID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        aiport1ID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setText("..To..");

        jPanel2.setLayout(new java.awt.GridBagLayout());

        actionCalculate.setBackground(new java.awt.Color(7, 95, 114));
        actionCalculate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        actionCalculate.setForeground(new java.awt.Color(255, 255, 255));
        actionCalculate.setText("Calculate");
        actionCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionCalculateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 350, 0, 350);
        jPanel2.add(actionCalculate, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aiport1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(airport2ID, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airport2ID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(aiport1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout calculatorPanelLayout = new javax.swing.GroupLayout(calculatorPanel);
        calculatorPanel.setLayout(calculatorPanelLayout);
        calculatorPanelLayout.setHorizontalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(distanceCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        calculatorPanelLayout.setVerticalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(distanceCounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel)
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DistanceContainerPanel.add(calculatorPanel);

        titlePanel.setMaximumSize(new java.awt.Dimension(32767, 108));
        titlePanel.setMinimumSize(new java.awt.Dimension(0, 108));
        titlePanel.setPreferredSize(new java.awt.Dimension(804, 108));

        jLabel4.setText("Dashboard > Flight Management >> Distance Calculation");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Distance Calculation");

        updateDistanceAction.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        updateDistanceAction.setText("Update");
        updateDistanceAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDistanceActionActionPerformed(evt);
            }
        });

        addDistanceAction.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addDistanceAction.setText("Register");
        addDistanceAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDistanceActionActionPerformed(evt);
            }
        });

        deleteDistanceAction.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        deleteDistanceAction.setText("Delete");
        deleteDistanceAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDistanceActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(addDistanceAction, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateDistanceAction, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteDistanceAction, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteDistanceAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDistanceAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateDistanceAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        DistanceContainerPanel.add(titlePanel);

        tableDataPanel.setLayout(new javax.swing.BoxLayout(tableDataPanel, javax.swing.BoxLayout.LINE_AXIS));

        distanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Distance ID", "Departure Airport", "Arrival Airport", "Distance", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        distanceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                distanceTableMouseClicked(evt);
            }
        });
        tableScrollPane.setViewportView(distanceTable);

        tableDataPanel.add(tableScrollPane);

        DistanceContainerPanel.add(tableDataPanel);

        DistanceScrollPanel.setViewportView(DistanceContainerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DistanceScrollPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DistanceScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actionCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionCalculateActionPerformed
        // TODO add your handling code here:
        distanceDAO.calculate(aiport1ID.getSelectedIndex(), airport2ID.getSelectedIndex(), distanceCounter, infoLabel);
    }//GEN-LAST:event_actionCalculateActionPerformed

    private void addDistanceActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDistanceActionActionPerformed
        // TODO add your handling code here:
        openAddDistanceDialog();
    }//GEN-LAST:event_addDistanceActionActionPerformed

    private void updateDistanceActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDistanceActionActionPerformed
        // TODO add your handling code here:
        // Open the update dialog with the selected row data
        int selectedRow = distanceTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) distanceTable.getModel();

        int distanceId = (int) model.getValueAt(selectedRow, 0);
        String departureAirport = (String) model.getValueAt(selectedRow, 1);
        String arrivalAirport = (String) model.getValueAt(selectedRow, 2);
        double distance = (double) model.getValueAt(selectedRow, 3);
        Date date = (Date) model.getValueAt(selectedRow, 4);
        Time time = (Time) model.getValueAt(selectedRow, 5);
        
        UpdateDistance updateDialog = new UpdateDistance((JFrame) Application.app, true, "Update Distance", distanceId, departureAirport, arrivalAirport, distance, date, time);
        updateDialog.setVisible(true);
    }//GEN-LAST:event_updateDistanceActionActionPerformed

    private void deleteDistanceActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDistanceActionActionPerformed
        // TODO add your handling code here:
        // Open the update dialog with the selected row data
            // Open the update dialog with the selected row data
        int selectedRow = distanceTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) distanceTable.getModel();

        int distanceId = (int) model.getValueAt(selectedRow, 0);
        String departureAirport = (String) model.getValueAt(selectedRow, 1);
        String arrivalAirport = (String) model.getValueAt(selectedRow, 2);
        double distance = (double) model.getValueAt(selectedRow, 3);
        Date date = (Date) model.getValueAt(selectedRow, 4);
        Time time = (Time) model.getValueAt(selectedRow, 5);
        
        DeleteDistance deleteDistance = new DeleteDistance((JFrame) Application.app, true, "Update Distance", distanceId, departureAirport, arrivalAirport, distance, date, time);
        deleteDistance.setVisible(true);
    }//GEN-LAST:event_deleteDistanceActionActionPerformed

    private void distanceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distanceTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            int selectedRow = distanceTable.getSelectedRow();

            if (selectedRow != -1) {
                deleteDistanceAction.setEnabled(true);
                updateDistanceAction.setEnabled(true);
            }
        } else if (evt.getClickCount() == 2) {
            int selectedRow = distanceTable.getSelectedRow();

            if (selectedRow != -1) {
                // Assuming the model's columns are:
                // 0 - distance_id, 1 - departure_airport, 2 - arrival_airport, 3 - distance, 4 - date, 5 - time
                DefaultTableModel model = (DefaultTableModel) distanceTable.getModel();

                int distanceId = (int) model.getValueAt(selectedRow, 0);
                String departureAirport = (String) model.getValueAt(selectedRow, 1);
                String arrivalAirport = (String) model.getValueAt(selectedRow, 2);
                double distance = (double) model.getValueAt(selectedRow, 3);
                Date date = (Date) model.getValueAt(selectedRow, 4);
                Time time = (Time) model.getValueAt(selectedRow, 5);

                // Open the update dialog with the selected row data
                UpdateDistance updateDialog = new UpdateDistance((JFrame) Application.app, true, "Update Distance", distanceId, departureAirport, arrivalAirport, distance, date, time);
                updateDialog.setVisible(true);
            }
        }
    }//GEN-LAST:event_distanceTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DistanceContainerPanel;
    private javax.swing.JScrollPane DistanceScrollPanel;
    private javax.swing.JButton actionCalculate;
    private javax.swing.JButton addDistanceAction;
    private javax.swing.JComboBox<String> aiport1ID;
    private javax.swing.JComboBox<String> airport2ID;
    private javax.swing.JPanel calculatorPanel;
    private javax.swing.JButton deleteDistanceAction;
    private javax.swing.JLabel distanceCounter;
    private javax.swing.JTable distanceTable;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mapImage;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JPanel tableDataPanel;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton updateDistanceAction;
    // End of variables declaration//GEN-END:variables
}
