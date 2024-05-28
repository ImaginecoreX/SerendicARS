package icx.service;

import icx.model.AirlineDTO;
import java.util.HashMap;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author sandaruwan
 */
public interface AirlineService {

    public HashMap<String, String> loadAllAirlineCountries(JComboBox comboBox);
    
    public HashMap<String, String> loadAllCountries(JComboBox comboBox);
    
    public HashMap<String, String> loadStatus(JComboBox comboBox);

    public List<AirlineDTO> getAirlines(JPanel panel, String query);

    public void registerAirline(String name, String code, String country, String status);

    public int getAllAirlineCount();
    
    public int getAllActiveAirlineCount();
    
    public int getAllInActiveAirlineCount();
    
    public int getAllAirlineCountriesCount();
    
    

}
