package icx.service;

import icx.model.AirportDTO;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author sandaruwan
 */
public interface AirportService {

    public enum DESTINATION {
        FROM, TO
    }

    public void addAirport(AirportDTO airportDTO) throws SQLException;

    public void updateAirport(AirportDTO airportDTO) throws SQLException;

    public void deleteAirport(int id) throws SQLException;

    public List<AirportDTO> getAllAirports() throws SQLException;

    public HashMap<String, String> loadAllAirportNames(JComboBox comboBox, DESTINATION destination) throws SQLException;

}
