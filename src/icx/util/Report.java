/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.logging.FileHandler;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import java.util.logging.Logger;

/**
 *
 * @author Yasith Sandesh
 */
public class Report {

    private static Logger printLogger;
    private static FileHandler fileHandler;

    static {

        printLogger = Logger.getLogger("icx.util.Print");

        try {
            fileHandler = new FileHandler("C:\\Users\\94701\\Documents\\loggers\\icx.util.Print.txt", true);
        } catch (Exception e) {
        }

        printLogger.addHandler(fileHandler);

    }

    public void print(JTable jTable, String reportFilePath, HashMap<String, Object> map) {
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportFilePath, map, new JRTableModelDataSource(jTable.getModel()));
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            printLogger.warning(e.toString());
        }
    }

    public void print(String reportFilePath, HashMap<String, Object> map, String DBname, String root, String password) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DBname, root, password);
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportFilePath, map, connection);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            printLogger.warning(e.toString());
        }
    }
    
      public void print(String reportFilePath, HashMap<String, Object> map) {
       try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportFilePath, map);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            printLogger.warning(e.toString());
        }
    }

}
