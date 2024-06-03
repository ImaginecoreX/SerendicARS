package icx.model;

import icx.application.main.sub.FormAirline;
import icx.flight.airline.AirlineCard;
import icx.service.impl.AirlineDAO;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class AirlineCardWrapper {

    //VARIABLES    
    public static final String GET_ALL_AIRLINES = "SELECT * FROM `Airlines`";

    /**
     * EXECUTE SEARCH QUERY
     *
     */
    public static void getAirlines(JPanel AirlineCardContainer, JComboBox<String> comboBox, String name, String code) {

        String country = (String) comboBox.getSelectedItem();
        StringBuilder queryBuilder = new StringBuilder("SELECT * FROM `Airlines`");

        boolean hasCondition = false;

        if (country != null && !country.equals("Select Country")) {
            if (hasCondition) {
                queryBuilder.append(" AND `country` = '").append(country).append("'");

            } else {
                queryBuilder.append(" WHERE `country` = '").append(country).append("'");
                hasCondition = true;
            }
        }

        if (name != null && !name.isEmpty()) {
            if (hasCondition) {
                queryBuilder.append(" AND `name` LIKE '").append(name).append("%'");
            } else {
                queryBuilder.append(" WHERE `name` LIKE '").append(name).append("%'");
                hasCondition = true;
            }
        }

        if (code != null && !code.isEmpty()) {
            if (hasCondition) {
                queryBuilder.append(" AND `code` = '").append(code).append("'");
            } else {
                queryBuilder.append(" WHERE `code` = '").append(code).append("'");
            }
        }

        String query = queryBuilder.toString();
        init(AirlineCardContainer, query);

    }

    public static void init(JPanel AirlineCardContainer, String query) {
        // Initial layout setup with wrap 1 to ensure the first render is correct
        AirlineCardContainer.setLayout(new MigLayout("wrap 1, gap 16px", "[320px]", "16px"));

        // Add a component listener to handle resizing
        AirlineCardContainer.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateLayout(AirlineCardContainer);
            }
        });

        /**
         * GET ALL AIRLINES
         *
         */
        AirlineDAO service = new AirlineDAO();
        List<AirlineDTO> airlines = service.getAirlines(AirlineCardContainer, query);
        FormAirline.CARD_LIST = airlines;

        // Add AirlineCards
        AirlineCardContainer.removeAll();
        for (AirlineDTO airline : airlines) {
                AirlineCardContainer.add(new AirlineCard(airline.getAirlineCode() + ".svg", airline.getAirlineName(), airline.getAirlineCode(), airline.getAirlineCountry(), airline.getAirlineCode(), airline.getAirlineStatus(), airline.getAirlineID()), "grow");
        }

        // Initial layout update
        updateLayout(AirlineCardContainer);
    }

    /**
     * Update the layout based on the current width of the container.
     */
    private static void updateLayout(JPanel AirlineCardContainer) {
        int containerWidth = AirlineCardContainer.getParent().getWidth(); // Use the parent width for better handling
        int cardWidth = 320; // Width of AirlineCard
        int gap = 16; // Gap between cards

        // Calculate the number of columns that can fit
        int columns = Math.max(1, (containerWidth + gap) / (cardWidth + gap));

        // Update MigLayout constraints
        String layoutConstraints = String.format("wrap %d, gap %dpx", columns, gap);
        ((MigLayout) AirlineCardContainer.getLayout()).setLayoutConstraints(layoutConstraints);

        // Revalidate and repaint to apply changes
        AirlineCardContainer.revalidate();
        AirlineCardContainer.repaint();
    }

}
