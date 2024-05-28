//package icx.util;
//
//import org.jdesktop.swingx.JXMapKit;
//import org.jdesktop.swingx.JXMapViewer;
//
//import javax.swing.*;
//import java.awt.*;
//
///**
// *
// * @author sandaruwan
// */
//public class MapView extends JPanel{
//    public MapView() {
//        setLayout(new BorderLayout());
//
//        JXMapKit jxMapKit = new JXMapKit();
//        jxMapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);
//        jxMapKit.setZoom(8);
//
//        // Add marker
//        JXMapViewer mapViewer = jxMapKit.getMainMap();
//        GeoPosition marker = new GeoPosition(37.7749, -122.4194);
//        mapViewer.setAddressLocation(marker);
//
//        add(jxMapKit, BorderLayout.CENTER);
//    }
//}
