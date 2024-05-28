    package icx.service.impl;

import icx.model.AirlineDTO;
import icx.model.MySQL;
import icx.service.AirlineService;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author sandaruwan
 */
public class AirlineDAO implements AirlineService {

    private static final Logger airlineServiceLogger = Logger.getLogger("icx.service.impl.AirlineServiceIMPL");

    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("icx.service.impl.AirlineServiceIMPL.txt", true);
        } catch (Exception e) {
             airlineServiceLogger.warning("Failed to initialize logger: " + e.getMessage());
        }
        airlineServiceLogger.addHandler(fileHandler);
    }


    private static List<AirlineDTO> airlineList;

    // Constructor
    public AirlineDAO() {
        airlineList = new ArrayList<>();
        initList();
    }

    
    public List<AirlineDTO> initList() {
        List<AirlineDTO> airlines = new ArrayList<>();

        try (ResultSet rs = MySQL.execute("SELECT * FROM `Airlines`")) {
            while (rs.next()) {

                AirlineDTO airline = new AirlineDTO();
                airline.setAirlineID(rs.getInt("airline_id"));
                airline.setAirlineName(rs.getString("name"));
                airline.setAirlineCode(rs.getString("code"));
                airline.setAirlineCountry(rs.getString("country"));
                airline.setAirlineStatus(rs.getString("status"));

                airlines.add(airline);
            }
            this.airlineList = airlines;
            return airlines;

        } catch (Exception e) {
            airlineServiceLogger.warning("Error getting airlines: " + e.getMessage());
        }
        return null;
    }

    /**
     * LOAD DISTINCT COUNTRIES
     */
    @Override
    public HashMap<String, String> loadAllAirlineCountries(JComboBox comboBox) {
        try (ResultSet rs = MySQL.execute("SELECT `a`.* FROM `Airlines` `a` INNER JOIN (SELECT MIN(`airline_id`) AS `id` FROM `Airlines` GROUP BY `country`) `b` ON `a`.`airline_id` = `b`.`id` ORDER BY `country` ASC")) {
            if (rs.next()) {
                Vector<String> vector = new Vector<>();
                HashMap<String, String> countryMap = new HashMap<>();
                vector.add("Select Country");
                do {
                    String country = rs.getString("country");
                    vector.add(country);
                    countryMap.put(country, rs.getString("airline_id"));
                } while (rs.next());

                DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
                model.removeAllElements();
                model.addAll(vector);

                comboBox.setSelectedIndex(0);
                return countryMap;
            }
        } catch (Exception e) {
            airlineServiceLogger.warning("Error loading airline countries: " + e.getMessage());
        }

        return null;
    }

    /**
     * GET ALL AIRLINES
     */
    @Override
    public List<AirlineDTO> getAirlines(JPanel panel, String query) {

        List<AirlineDTO> airlines = new ArrayList<>();

        try (ResultSet rs = MySQL.execute(query)) {
            while (rs.next()) {

                AirlineDTO airline = new AirlineDTO();
                airline.setAirlineID(rs.getInt("airline_id"));
                airline.setAirlineName(rs.getString("name"));
                airline.setAirlineCode(rs.getString("code"));
                airline.setAirlineCountry(rs.getString("country"));
                airline.setAirlineStatus(rs.getString("status"));

                airlines.add(airline);
            }
            return airlines;

        } catch (Exception e) {
            airlineServiceLogger.warning("Error getting airlines: " + e.getMessage());
        }

        return null;
    }

    @Override
    public void registerAirline(String name, String code, String country, String status) {
        try {
            
            MySQL.execute("INSERT INTO `Airlines`(`name`,`code`,`country`,`status`) VALUES('"+name+"','"+code+"','"+country+"','"+status+"')");
            
        } catch (Exception e) {
            airlineServiceLogger.warning("Error while registration: "+e.getMessage());
        }
    }

    @Override
    public int getAllAirlineCount() {
        return airlineList.size();
    }

    @Override
    public int getAllActiveAirlineCount() {
        return (int) airlineList.stream().filter(airline -> "active".equals(airline.getAirlineStatus())).count();
    }

    @Override
    public int getAllInActiveAirlineCount() {
        return (int) airlineList.stream().filter(airline -> "inactive".equals(airline.getAirlineStatus())).count();

    }

    @Override
    public int getAllAirlineCountriesCount() {
        try (ResultSet rs = MySQL.execute("SELECT COUNT(DISTINCT `country`) FROM `Airlines`")) {
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
            airlineServiceLogger.warning("Error getting airline countries count: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public HashMap<String, String> loadStatus(JComboBox comboBox) {
        try (ResultSet rs = MySQL.execute("SELECT DISTINCT `status` FROM ars.Airlines")) {
            if (rs.next()) {
                Vector<String> vector = new Vector<>();
                HashMap<String, String> statusMap = new HashMap<>();
                vector.add("Select Status");
                int mapID = 0;
                do {
                    String status = rs.getString("status");
                    vector.add(status);
                    statusMap.put(status, String.valueOf(mapID++));
                } while (rs.next());

                DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
                model.removeAllElements();
                model.addAll(vector);

                comboBox.setSelectedIndex(0);
                return statusMap;
            }
        } catch (Exception e) {
            airlineServiceLogger.warning("Error loading status: " + e.getMessage());
        }

        return null;
    }


    @Override
    public HashMap<String, String> loadAllCountries(JComboBox comboBox) {
        try (ResultSet rs = MySQL.execute("SELECT * FROM `country` ORDER BY `name` ASC")) {
            if (rs.next()) {
                Vector<String> vector = new Vector<>();
                HashMap<String, String> countryMap = new HashMap<>();
                vector.add("Select Country");
                do {
                    String country = rs.getString("name");
                    vector.add(country);
                    countryMap.put(country, rs.getString("id"));
                } while (rs.next());

                DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
                model.removeAllElements();
                model.addAll(vector);

                comboBox.setSelectedIndex(0);
                return countryMap;
            }
        } catch (Exception e) {
            airlineServiceLogger.warning("Error loading countries: " + e.getMessage());
        }

        return null;
    }

}
