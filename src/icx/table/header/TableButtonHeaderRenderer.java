package icx.table.header;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatUIUtils;
import com.formdev.flatlaf.util.UIScale;
import icx.util.ImageScaler;
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
import javax.swing.border.MatteBorder;
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

    public TableButtonHeaderRenderer(JTable table, int column, String buttonText, String buttonSVGIconPath, TableButtonHeaderEvent event) {
        this.table = table;
        this.column = column;
        this.button = new JButton(buttonText);
        this.button.setIcon(new ImageScaler().getSvgIcon(buttonSVGIconPath, 20, 20));
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
        this.setBorder(new MatteBorder(0, 0, 1, 1, new Color(90,94,96)));

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
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(FlatUIUtils.getUIColor("TableHeader.bottomSeperatorColor", Color.yellow));
        float size = UIScale.scale(1f);
        g2.fill(new Rectangle2D.Float(0, getHeight() - size, getWidth(), size));
        g2.dispose();
        super.paintComponent(g);
    }

}
