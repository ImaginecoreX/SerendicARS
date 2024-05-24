package icx.util;

import icx.application.main.PanelHeaderBar;
import javax.swing.JPanel;
import java.awt.BorderLayout;


/**
 *
 * @author sandaruwan
 */
public class HeaderBarManager {

    public static JPanel addHeaderBar(JPanel panel) {
        // Create a new panel with BorderLayout
        JPanel wrapperPanel = new JPanel(new BorderLayout());

        // Add the header bar to the top of the wrapper panel
        wrapperPanel.add(new PanelHeaderBar(), BorderLayout.NORTH);

        // Add the original panel to the center of the wrapper panel
        wrapperPanel.add(panel, BorderLayout.CENTER);

        return wrapperPanel;
    }
}