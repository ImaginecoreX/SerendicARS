package icx.util;

import com.formdev.flatlaf.extras.FlatSVGIcon;

/**
 *
 * @author sandaruwan
 */
public class SvgImg extends javax.swing.JLabel{
 private FlatSVGIcon svgIcon;
    
    public void setSvgIcon(String image,int width,int hight){
    
        svgIcon = new FlatSVGIcon(image, width, hight);
        super.setIcon(svgIcon);
        
    }
    
    
    
}

