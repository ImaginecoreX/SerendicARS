package icx.table;

/**
 *
 * @author ksoff
 */
import com.formdev.flatlaf.FlatClientProperties;
import icx.toggleSwitch.SwitchButton;
import icx.toggleSwitch.SwitchButtonEvent;
import icx.toggleSwitch.SwitchPanel;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableSwitchButtonCellEditor extends DefaultCellEditor {

    private SwitchButtonEvent event;
    private SwitchPanel panel;
    private SwitchButton button;
    private JTable table;
    private int row;
    private int column;

    public TableSwitchButtonCellEditor(SwitchPanel panel) {
        super(new JCheckBox());
        this.panel = panel;
    }

    public TableSwitchButtonCellEditor(SwitchButtonEvent event) {
        super(new JCheckBox());
        this.panel = new SwitchPanel();
        this.button = panel.getSwitchButton();
        button.addEventSelected(event);
        button.addEventSelected((selected) -> {
            statusChange();
        });
    }

    private void setProperties() {
        panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.selectionBackground;");
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.table = table;
        this.row = row;
        this.column = column;

        if (isSelected) {
            panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.selectionInactiveBackground;");
        }

        button.setCurrentSelectedStatus((boolean) value);

        button.setEnabled(false);
        enable();

        return panel;
    }

    @Override
    public Object getCellEditorValue() {
        return button.isSelected();
    }

    private void enable() {
        // for smoothing process
        new Thread(() -> {
            try {
                Thread.sleep(100);
                button.setEnabled(true);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }).start();
    }

    public void statusChange() {
        setProperties();
        table.setValueAt(button.isSelected(), row, column);
    }

}
