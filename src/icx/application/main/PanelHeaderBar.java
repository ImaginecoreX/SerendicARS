package icx.application.main;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sandaruwan
 */
public class PanelHeaderBar extends JPanel {

    private JLabel sessionLabel;
    private Timer timer;
    private int sessionTime = 3600; // session time in seconds (e.g., 1 hour)

    public PanelHeaderBar() {
        setLayout(new MigLayout("insets 0, fillx, aligny center", 
                                "[fill]10[center]10[fill]", 
                                "[]"));

        // Set the header bar style
        putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Header.background;"
                + "arc:20;");

        // Logo and text on the left
        JLabel logoLabel = new JLabel("Your Logo Here");
        logoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(logoLabel, "west");

        // Session countdown timer in the center
        sessionLabel = new JLabel();
        sessionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(sessionLabel, "center");

        // User profile icon on the right
        JLabel userProfileIcon = new JLabel(new ImageIcon("path/to/your/user/profile/icon.png"));
        add(userProfileIcon, "east");

        // Initialize the session timer
        startSessionTimer();
    }

    private void startSessionTimer() {
        updateSessionLabel();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sessionTime > 0) {
                    sessionTime--;
                    updateSessionLabel();
                } else {
                    timer.stop();
                    // Handle session timeout here if needed
                }
            }
        });
        timer.start();
    }

    private void updateSessionLabel() {
        int minutes = sessionTime / 60;
        int seconds = sessionTime % 60;
        sessionLabel.setText(String.format("Session Time: %02d:%02d", minutes, seconds));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Application Header Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        PanelHeaderBar headerBar = new PanelHeaderBar();
        frame.add(headerBar, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
