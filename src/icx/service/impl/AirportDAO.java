package icx.service.impl;

import icx.model.AirportDTO;
import icx.model.MySQL;
import icx.service.AirportService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author sandaruwan
 */
public class AirportDAO implements AirportService {

    @Override
    public void addAirport(AirportDTO airportDTO) throws SQLException {
        String query = "INSERT INTO Airport (name, code, city, country) VALUES ('" + airportDTO.getName() + "', '" + airportDTO.getCode() + "', '" + airportDTO.getCity() + "', '" + airportDTO.getCountry() + "')";
        MySQL.execute(query);
    }

    @Override
    public void updateAirport(AirportDTO airportDTO) throws SQLException {
        String query = "UPDATE Airport SET name='" + airportDTO.getName() + "', code='" + airportDTO.getCode() + "', city='" + airportDTO.getCity() + "', country='" + airportDTO.getCountry() + "' WHERE id=" + airportDTO.getId();
        MySQL.execute(query);
    }

    @Override
    public void deleteAirport(int id) throws SQLException {
        String query = "DELETE FROM Airport WHERE id=" + id;
        MySQL.execute(query);
    }

    @Override
    public List<AirportDTO> getAllAirports() throws SQLException {
        String query = "SELECT * FROM Airport";
        ResultSet rs = MySQL.execute(query);
        List<AirportDTO> airports = new ArrayList<>();
        while (rs.next()) {
            AirportDTO airport = new AirportDTO();
            airport.setId(rs.getInt("id"));
            airport.setName(rs.getString("name"));
            airport.setCode(rs.getString("code"));
            airport.setCity(rs.getString("city"));
            airport.setCountry(rs.getString("country"));
            airports.add(airport);
        }
        return airports;
    }

    @Override
    public HashMap<String, String> loadAllAirportNames(JComboBox comboBox, DESTINATION destination) throws SQLException {
        ResultSet rs = MySQL.execute("SELECT `a`.* FROM `Airports` `a` INNER JOIN (SELECT MIN(`airport_id`) AS `id` FROM `Airports` GROUP BY `name`) `b` ON `a`.`airport_id` = `b`.`id` ORDER BY `name` ASC");
        if (rs.next()) {
            Vector<String> vector = new Vector<>();
            HashMap<String, String> airportMap = new HashMap<>();
            vector.add("Select " + destination + " Airport");
            do {
                String country = rs.getString("name");
                vector.add(country);
                airportMap.put(country, rs.getString("airport_id"));
            } while (rs.next());

            DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
            model.removeAllElements();
            model.addAll(vector);

            comboBox.setSelectedIndex(0);
            return airportMap;
        }
        return null;
    }
}
