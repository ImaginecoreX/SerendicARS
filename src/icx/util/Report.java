package icx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
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
            fileHandler = new FileHandler("icx.util.Print.txt", true);
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

      
      // Add methods for each report type
    public void printTodayFlightsReport() {
        print("path/to/TodayFlightsReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printTodayTakeoffedFlightsReport() {
        print("path/to/TodayTakeoffedFlightsReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printTodayClosedFlightsReport() {
        print("path/to/TodayClosedFlightsReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printAirlinesReport() {
        print("path/to/AirlinesReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printAirlineCountriesReport() {
        print("path/to/AirlineCountriesReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printAirportsReport() {
        print("path/to/AirportsReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printAirportCountriesReport() {
        print("path/to/AirportCountriesReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printAirportCitiesReport() {
        print("path/to/AirportCitiesReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printAircraftManufactureReport(Date param1, Date param2) {
         String reportFilePath = "src/icx/flight/reports/AircraftManufactureReport.jasper";
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("param1", param1);
        parameters.put("param2", param2);
        
        print(reportFilePath, parameters, "ars", "root", "Ms2005j@Neru");
    }

    public void printAircraftModelsReport() {
        print("path/to/AircraftModelsReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }

    public void printAircraftCapacityReport() {
        print("path/to/AircraftCapacityReport.jasper", new HashMap<>(), "ars", "root", "Ms2005j@Neru");
    }
}
