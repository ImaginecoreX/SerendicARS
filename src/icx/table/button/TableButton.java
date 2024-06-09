package icx.table.button;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ksoff
 */
public class TableButton extends JButton {

    private boolean mousePress;

    public TableButton() {
        //setContentAreaFilled(false);
//        setBorder(new EmptyBorder(3, 3, 3, 3));
//        setMargin(new Insets(2, 14, 3, 14));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                mousePress = true;
                setBackground(new Color(158, 158, 158));
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                mousePress = false;
                setBackground(new Color(78, 80, 82));
                repaint();
            }
        });
    }

//    @Override
//    protected void paintComponent(Graphics grphcs) {
//        Graphics2D g2 = (Graphics2D) grphcs.create();
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        int width = getWidth();
//        int height = getHeight();
//        int size = Math.min(width, height);
//        int x = (width - size) / 6;
//        int y = (height - size) / 2;
//        if (mousePress) {
//            g2.setColor(new Color(158, 158, 158));
//        } else {
//            g2.setColor(new Color(78, 80, 82));
//        }
//        g2.fill(new Rectangle2D.Double(x, y, 100, height));
////        g2.fill(new Ellipse2D.Double(x, y, 100, height));
//        g2.dispose();
//        super.paintComponent(grphcs);
//    }

}
