package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;
import icx.flight.airline.AirlineCard;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author sandaruwan
 */
public class TestComponents extends javax.swing.JPanel {
    
    public TestComponents() {
        initComponents();
        init();
    }

    private void init() {
        // Initial layout setup with wrap 1 to ensure the first render is correct
        con.setLayout(new MigLayout("wrap 1, gap 16px", "[320px]", "16px"));

        // Add a component listener to handle resizing
        con.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateLayout();
            }
        });

        // Add AirlineCards
        for (int i = 0; i < 10; i++) {
            con.add(new AirlineCard("AeroTaxi.svg", "International Carrier", "IC", "USA", "IC","",0), "grow");
        }

        // Initial layout update
        updateLayout();
    }

    /**
     * Update the layout based on the current width of the container.
     */
    private void updateLayout() {
        int containerWidth = con.getParent().getWidth(); // Use the parent width for better handling
        int cardWidth = 320; // Width of AirlineCard
        int gap = 16; // Gap between cards

        // Calculate the number of columns that can fit
        int columns = Math.max(1, (containerWidth + gap) / (cardWidth + gap));
        
        // Update MigLayout constraints
        String layoutConstraints = String.format("wrap %d, gap %dpx", columns, gap);
        ((MigLayout) con.getLayout()).setLayoutConstraints(layoutConstraints);
        
        // Revalidate and repaint to apply changes
        con.revalidate();
        con.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        con = new javax.swing.JPanel();
        flightCard2 = new icx.flight.FlightCard();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        con.setLayout(new java.awt.GridLayout(10, 2, 10, 10));
        jScrollPane1.setViewportView(con);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(flightCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flightCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel con;
    private icx.flight.FlightCard flightCard2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
