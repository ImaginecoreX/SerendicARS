package icx.table;

import icx.table.button.TableButtonPanel;
import icx.table.button.TableButtonEvent;
import icx.table.button.TableButton;
import com.formdev.flatlaf.FlatClientProperties;
import icx.util.ImageScaler;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class TableButtonCellRenderer extends DefaultTableCellRenderer implements TableCellRenderer {

    private TableButton button;
    private TableButtonPanel panel = new TableButtonPanel();
    //private JButton button;
    //private JPanel panel = new JPanel();
    private String buttonText;
    private ImageIcon buttonIcon;
    private TableButtonEvent event;

    public TableButtonCellRenderer(String buttonText, ImageIcon buttonIcon, TableButtonEvent event) {
        this.buttonText = buttonText;
        this.buttonIcon = buttonIcon;
        this.event = event;
    }

    public TableButtonCellRenderer(String buttonText, String buttonIconPath, TableButtonEvent event) {
        this.buttonText = buttonText;
        if (buttonIconPath != null) {
            this.buttonIcon = new ImageScaler().getScaledSmoothIcon(buttonIconPath, 30, 30);
        }
        this.event = event;
    }

    private void renderButton() {
        this.button = panel.getTableButton();
        //this.button = new TableButton();
        //this.button = new JButton();

        this.button.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:40;"
                + "focusWidth: 2;"
                + "borderWidth: 0");
        if (buttonText != null) {
            button.setText(buttonText);
        } else if (buttonIcon != null) {
            button.setIcon(buttonIcon);
        } else {
            button.setIcon(buttonIcon);
            button.setText(buttonText);
        }

        //panel.add(button);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column
    ) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        renderButton();

        if (isSelected) {
            panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.selectionBackground;");
        } else {
            panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.background;");
        }

//        this.button.addActionListener(((e) -> {
//            event.run(row);
//        }));
        table.getColumnModel().getColumn(column).setCellEditor(new TableButtonCellEditor(buttonIcon, buttonText, event));
        return panel;
    }

}
