package icx.util;

import com.formdev.flatlaf.extras.FlatSVGIcon;
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

    public FlatSVGIcon getSvgIcon(String image, int width, int hight) {
        FlatSVGIcon svgIcon = new FlatSVGIcon(image, width, hight);
        return svgIcon;
    }

}
