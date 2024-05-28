package icx.table;

/**
 *
 * @author ksoff
 */
import icx.table.button.TableButtonPanel;
import icx.table.button.TableButtonEvent;
import icx.table.button.TableButton;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;

public class TableButtonCellEditor extends DefaultCellEditor {

    private TableButtonPanel panel;
    private TableButton button;
    //private JPanel panel;
    private String buttonText;
    private ImageIcon buttonIcon;
    private TableButtonEvent event;

    //public TableButtonCellEditor(TableButton button) {
//    public TableButtonCellEditor() {
//        super(new JCheckBox());
//        this.panel = new TableButtonPanel();
//    }
    public TableButtonCellEditor(ImageIcon buttonIcon, String buttonText, TableButtonEvent event) {
        super(new JCheckBox());
        this.panel = new TableButtonPanel();
        this.buttonText = buttonText;
        this.buttonIcon = buttonIcon;
        this.event = event;
    }

    public TableButtonCellEditor(TableButtonPanel panel) {
        super(new JCheckBox());
        this.panel = panel;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        renderButton();

        panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.selectionBackground;");

        this.button.addActionListener(((e) -> {
            panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.selectionInactiveBackground;");
            event.run(row);
        }));

        return panel;
    }

    private void renderButton() {
        this.button = this.panel.getTableButton();

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
    }

}
