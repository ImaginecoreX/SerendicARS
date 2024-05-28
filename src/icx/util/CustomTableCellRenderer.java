package icx.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomTableCellRenderer extends DefaultTableCellRenderer {

    private Color darkBackgroundColor = new Color(240, 240, 240); // Light mode background color
    private Color lightBackgroundColor = new Color(50, 50, 50); // Dark mode background color
    private Color foregroundColor = Color.WHITE; // Default foreground color
    private Color selectionColor = new Color(255, 165, 0); // Custom row selection color

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Set background color based on selection and mode
        if (isSelected) {
            setBackground(selectionColor); // Set custom row selection color
            setForeground(foregroundColor); // Set foreground color
        } else {
            setBackground(row % 2 == 0 ? (isDarkMode() ? darkBackgroundColor : lightBackgroundColor) : (isDarkMode() ? Color.DARK_GRAY : Color.LIGHT_GRAY)); // Alternate row colors
            setForeground(foregroundColor); // Set foreground color
        }

        return cell;
    }

    // Method to detect dark mode
    private boolean isDarkMode() {
        // Logic to detect dark mode
        return false; // Replace with actual dark mode detection logic
    }
}
