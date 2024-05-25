package icx.table.header;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;

public class TableButtonHeaderRenderer extends JPanel implements TableCellRenderer {

    private final JTable table;
    private final int column;
    private final JButton button;
    private final TableButtonHeaderEvent event;

    public TableButtonHeaderRenderer(JTable table, int column, String buttonText, TableButtonHeaderEvent event) {
        this.table = table;
        this.column = column;
        this.button = new JButton(buttonText);
        this.event = event;
        init();
    }

    private void run() {
        System.out.println("Clicked");
        event.run();
    }
    
    private void init() {
        
        button.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(button);

        putClientProperty(FlatClientProperties.STYLE, "background:$Table.background");

        table.getTableHeader().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int col = table.columnAtPoint(e.getPoint());
                    if (col == column) {
                        run();
                    }
                }
            }
        });

//        try {
//            table.getModel().addTableModelListener((e) -> {
//                if (e.getColumn()== column) {
//                    checkRow();
//                }
//            });
//        } catch (NullPointerException e) {
//        }
    }

//    private void checkRow() throws NullPointerException {
//        boolean initValue = table.getRowCount() == 0 ? false : (boolean) table.getValueAt(0, column);
//        for (int i = 0; i < table.getRowCount(); i++) {
//            boolean value = (boolean) table.getValueAt(i, column);
//            if (initValue != value) {
//                putClientProperty(FlatClientProperties.SELECTED_STATE, FlatClientProperties.SELECTED_STATE_INDETERMINATE);
//                table.getTableHeader().revalidate();
//                table.getTableHeader().repaint();
//                return;
//            }
//        }
//        putClientProperty(FlatClientProperties.SELECTED_STATE, null);
//        setSelected(initValue);
//        table.getTableHeader().revalidate();
//        table.getTableHeader().repaint();
//    }

//    private void SelectedTableRow(boolean selected) {
//        for (int i = 0; i < table.getRowCount(); i++) {
//            table.setValueAt(selected, i, column);
//        }
//    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(Color.getColor("$TableHeader.background"));
        float size = UIScale.scale(1f);
        g2.fill(new Rectangle2D.Float(0, getHeight() - size, getWidth() - size, size));
        g2.dispose();
        super.paintComponent(g);
    }

}
