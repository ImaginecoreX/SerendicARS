package icx.table;

import com.formdev.flatlaf.FlatClientProperties;
import icx.toggleSwitch.SwitchPanel;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class TableSwitchButtonCellRenderer extends DefaultTableCellRenderer implements TableCellRenderer {

    private SwitchPanel panel = new SwitchPanel();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column
    ) {
        panel.getSwitchButton().setCurrentSelectedStatus((boolean) value);

        if (isSelected) {
            panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.selectionBackground;");
            //panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.selectionInactiveBackground;");
        } else {
            panel.putClientProperty(FlatClientProperties.STYLE, "background:$Table.background;");
        }

        return panel;
    }

}
