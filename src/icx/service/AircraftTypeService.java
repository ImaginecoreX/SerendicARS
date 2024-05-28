package icx.service;

import icx.model.AircraftTypeDTO;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author sandaruwan
 */
public interface AircraftTypeService {

    public void addAircraftType(AircraftTypeDTO aircraftTypeDTO) throws SQLException;

    public void updateAircraftType(AircraftTypeDTO aircraftTypeDTO) throws SQLException;

    public void deleteAircraftType(int id) throws SQLException;

    public List<AircraftTypeDTO> getAllAircraftTypes() throws SQLException;

    public HashMap<String, String> getManufactures(JComboBox comboBox);

    public HashMap<String, String> getModels(JComboBox comboBox);

    public HashMap<String, String> getSeatCapacity(JComboBox comboBox);

    public HashMap<String, String> getStatus(JComboBox comboBox);
    
    public void tableDataLoad(JTable table) throws SQLException;

}
