/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package icx.flight.airline;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import icx.application.main.sub.FormAirline;
import icx.flight.dialog.UpdateAirline;
import icx.model.AirlineDTO;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author sandaruwan
 */
public class AirlineCard extends javax.swing.JPanel {
    
    private String AIRLINE_NAME;
    private String AIRLINE_CODE;
    private String AIRLINE_COUNTRY;
    private String WATER_ID;
    private String STATUS;
    private int AIRLINE_ID;

    
    /**
     * Creates new form AirlineCard
     */
    public AirlineCard(String svgLogo, String airlineName, String airlineCode, String airlineCountry, String waterId, String status, int airlineID) {
        initComponents();
        codeIcon.setSvgIcon("icx/resources/airline/svg/code.svg", 16, 16);
        countryIcon.setSvgIcon("icx/resources/airline/svg/flag.svg", 16, 16);
        airlineLogo.setIcon(new FlatSVGIcon("icx/resources/airline/svg/"+svgLogo, 80, 80));
        
        this.airlineName.setText(airlineName);
        this.airlineCode.setText(airlineCode);
        this.airlineCountry.setText(airlineCountry);
        this.waterId.setText(waterId);
        
        this.AIRLINE_CODE = airlineCode;
        this.AIRLINE_COUNTRY = airlineCountry;
        this.AIRLINE_NAME = airlineName;
        this.WATER_ID = waterId;
        this.STATUS = status;
        this.AIRLINE_ID = airlineID;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        airlineLogo = new javax.swing.JLabel();
        airlineName = new javax.swing.JLabel();
        codeIcon = new icx.util.SvgImg();
        airlineCode = new javax.swing.JLabel();
        airlineCountry = new javax.swing.JLabel();
        countryIcon = new icx.util.SvgImg();
        jPanel2 = new javax.swing.JPanel();
        actionButton = new javax.swing.JButton();
        waterId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(7, 95, 114));
        setMaximumSize(new java.awt.Dimension(320, 96));
        setMinimumSize(new java.awt.Dimension(320, 96));
        setPreferredSize(new java.awt.Dimension(320, 96));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(airlineLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(airlineLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        airlineName.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        airlineName.setForeground(new java.awt.Color(255, 255, 255));
        airlineName.setText("International Carrier");

        airlineCode.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        airlineCode.setForeground(new java.awt.Color(255, 255, 255));
        airlineCode.setText("IC");

        airlineCountry.setForeground(new java.awt.Color(166, 197, 204));
        airlineCountry.setText("USA");

        jPanel2.setOpaque(false);

        actionButton.setBackground(new java.awt.Color(255, 245, 210));
        actionButton.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        actionButton.setForeground(new java.awt.Color(5, 39, 50));
        actionButton.setText("Edit");
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });

        waterId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        waterId.setForeground(new java.awt.Color(36, 113, 131));
        waterId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waterId.setText("IC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(waterId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(waterId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(countryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(airlineCountry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airlineName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(airlineCode)))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(airlineName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(codeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airlineCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(countryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airlineCountry)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonActionPerformed
        // TODO add your handling code here:
            AirlineDTO dto = new AirlineDTO();
            dto.setAirlineCode(this.AIRLINE_CODE);
            dto.setAirlineName(this.AIRLINE_NAME);
            dto.setAirlineCountry(this.AIRLINE_COUNTRY);
            dto.setAirlineStatus(this.STATUS);
            dto.setAirlineID(this.AIRLINE_ID);
            
            FormAirline.openUpdateAirlineDialog(dto);
        
    }//GEN-LAST:event_actionButtonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButton;
    private javax.swing.JLabel airlineCode;
    private javax.swing.JLabel airlineCountry;
    private javax.swing.JLabel airlineLogo;
    private javax.swing.JLabel airlineName;
    private icx.util.SvgImg codeIcon;
    private icx.util.SvgImg countryIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel waterId;
    // End of variables declaration//GEN-END:variables
}
