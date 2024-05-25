package icx.util;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageScaler {

    public ImageIcon getScaledSmoothIcon(String path, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image image = (imageIcon).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public ImageIcon getScaledIcon(String path, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        Image image = (imageIcon).getImage().getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
        return new ImageIcon(image);
    }
}
