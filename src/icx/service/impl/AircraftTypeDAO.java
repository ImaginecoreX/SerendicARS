package icx.service.impl;

import icx.model.AircraftTypeDTO;
import icx.model.MySQL;
import icx.service.AircraftTypeService;
import icx.util.LoggerUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandaruwan
 */
public class AircraftTypeDAO implements AircraftTypeService {

    private static final Logger aircraftTypeServiceLogger = Logger.getLogger("icx.service.impl.AircraftTypeDAO");

    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("icx.service.impl.AircraftTypeDAO.txt", true);
        } catch (Exception e) {
            aircraftTypeServiceLogger.warning("Failed to initialize logger: " + e.getMessage());
        }
        aircraftTypeServiceLogger.addHandler(fileHandler);
    }

    @Override
    public void addAircraftType(AircraftTypeDTO aircraftTypeDTO) throws SQLException {
        String query = "INSERT INTO AircraftType (name, model, capacity) VALUES ('" + aircraftTypeDTO.getName() + "', '" + aircraftTypeDTO.getModel() + "', " + aircraftTypeDTO.getCapacity() + ")";
        MySQL.execute(query);
    }

    @Override
    public void updateAircraftType(AircraftTypeDTO aircraftTypeDTO) throws SQLException {
        String query = "UPDATE AircraftType SET name='" + aircraftTypeDTO.getName() + "', model='" + aircraftTypeDTO.getModel() + "', capacity=" + aircraftTypeDTO.getCapacity() + " WHERE id=" + aircraftTypeDTO.getId();
        MySQL.execute(query);
    }

    @Override
    public void deleteAircraftType(int id) throws SQLException {
        String query = "DELETE FROM AircraftType WHERE id=" + id;
        MySQL.execute(query);
    }

    @Override
    public List<AircraftTypeDTO> getAllAircraftTypes() throws SQLException {
        String query = "SELECT * FROM AircraftType";
        ResultSet rs = MySQL.execute(query);
        List<AircraftTypeDTO> aircraftTypes = new ArrayList<>();
        while (rs.next()) {
            AircraftTypeDTO aircraftType = new AircraftTypeDTO();
            aircraftType.setId(rs.getInt("id"));
            aircraftType.setName(rs.getString("name"));
            aircraftType.setModel(rs.getString("model"));
            aircraftType.setCapacity(rs.getInt("capacity"));
            aircraftTypes.add(aircraftType);
        }
        return aircraftTypes;
    }

    @Override
    public HashMap<String, String> getManufactures(JComboBox comboBox) {
        try (ResultSet rs = MySQL.execute("SELECT `a`.* FROM `Aircraft_Types` `a` INNER JOIN (SELECT MIN(`aircraft_type_id`) AS `id` FROM `Aircraft_Types` GROUP BY `manufacturer`) `b` ON `a`.`aircraft_type_id` = `b`.`id` ORDER BY `manufacturer` ASC")) {
            if (rs.next()) {
                Vector<String> vector = new Vector<>();
                HashMap<String, String> manufacturerMap = new HashMap<>();
                vector.add("Select Manufacturer");
                do {
                    String manufacture = rs.getString("manufacturer");
                    vector.add(manufacture);
                    manufacturerMap.put(manufacture, rs.getString("aircraft_type_id"));
                } while (rs.next());

                DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
                model.removeAllElements();
                model.addAll(vector);

                comboBox.setSelectedIndex(0);
                return manufacturerMap;
            }
        } catch (Exception e) {
            aircraftTypeServiceLogger.warning("Error loading Aircraft Manufactures: " + e.getMessage());
        }

        return null;
    }

    @Override
    public HashMap<String, String> getModels(JComboBox comboBox) {
        try (ResultSet rs = MySQL.execute("SELECT `a`.* FROM `Aircraft_Types` `a` INNER JOIN (SELECT MIN(`aircraft_type_id`) AS `id` FROM `Aircraft_Types` GROUP BY `model`) `b` ON `a`.`aircraft_type_id` = `b`.`id` ORDER BY `model` ASC")) {
            if (rs.next()) {
                Vector<String> vector = new Vector<>();
                HashMap<String, String> modelMap = new HashMap<>();
                vector.add("Select Model");
                do {
                    String model = rs.getString("model");
                    vector.add(model);
                    modelMap.put(model, rs.getString("aircraft_type_id"));
                } while (rs.next());

                DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
                model.removeAllElements();
                model.addAll(vector);

                comboBox.setSelectedIndex(0);
                return modelMap;
            }
        } catch (Exception e) {
            aircraftTypeServiceLogger.warning("Error loading Aircraft Model: " + e.getMessage());
        }

        return null;
    }

    @Override
    public HashMap<String, String> getSeatCapacity(JComboBox comboBox) {
        try (ResultSet rs = MySQL.execute("SELECT `a`.* FROM `Aircraft_Types` `a` INNER JOIN (SELECT MIN(`aircraft_type_id`) AS `id` FROM `Aircraft_Types` GROUP BY `seat_capacity`) `b` ON `a`.`aircraft_type_id` = `b`.`id` ORDER BY `seat_capacity` ASC")) {
            if (rs.next()) {
                Vector<String> vector = new Vector<>();
                HashMap<String, String> seatMap = new HashMap<>();
                vector.add("Select Seat Capacity");
                do {
                    String seat = rs.getString("seat_capacity");
                    vector.add(seat);
                    seatMap.put(seat, rs.getString("aircraft_type_id"));
                } while (rs.next());

                DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
                model.removeAllElements();
                model.addAll(vector);

                comboBox.setSelectedIndex(0);
                return seatMap;
            }
        } catch (Exception e) {
            aircraftTypeServiceLogger.warning("Error loading Aircraft Seat Capacity: " + e.getMessage());
        }

        return null;
    }

    @Override
    public HashMap<String, String> getStatus(JComboBox comboBox) {
        try (ResultSet rs = MySQL.execute("SELECT `a`.* FROM `Aircraft_Types` `a` INNER JOIN (SELECT MIN(`aircraft_type_id`) AS `id` FROM `Aircraft_Types` GROUP BY `status`) `b` ON `a`.`aircraft_type_id` = `b`.`id` ORDER BY `status` ASC")) {
            if (rs.next()) {
                Vector<String> vector = new Vector<>();
                HashMap<String, String> statusMap = new HashMap<>();
                vector.add("Select Status");
                do {
                    String status = rs.getString("status");
                    vector.add(status);
                    statusMap.put(status, rs.getString("aircraft_type_id"));
                } while (rs.next());

                DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
                model.removeAllElements();
                model.addAll(vector);

                comboBox.setSelectedIndex(0);
                return statusMap;
            }
        } catch (Exception e) {
            aircraftTypeServiceLogger.warning("Error loading Aircraft Status: " + e.getMessage());
        }

        return null;
    }

    @Override
    public void tableDataLoad(JTable table) throws SQLException {
        String query = "SELECT * FROM ars.Aircraft_Types";

        try (ResultSet rs = MySQL.execute(query)) {

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            // Clear existing rows
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("aircraft_type_id"),
                    rs.getString("name"),
                    rs.getString("manufacturer"),
                    rs.getString("model"),
                    rs.getInt("seat_capacity"),
                    rs.getString("status")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            LoggerUtil.logWarning("SQL Error: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public HashMap<String, String> getTypes(JComboBox comboBox) {
        try {
            ResultSet rs = MySQL.execute("SELECT `a`.* FROM `Aircraft_Types` `a` INNER JOIN (SELECT MIN(`aircraft_type_id`) AS `id` FROM `Aircraft_Types` GROUP BY `name`) `b` ON `a`.`aircraft_type_id` = `b`.`id` ORDER BY `name` ASC");
            if (rs.next()) {
                Vector<String> vector = new Vector<>();
                HashMap<String, String> typeMap = new HashMap<>();
                vector.add("Select Aircraft Type");
                do {
                    String status = rs.getString("name");
                    vector.add(status);
                    typeMap.put(status, rs.getString("aircraft_type_id"));
                } while (rs.next());

                DefaultComboBoxModel model = (DefaultComboBoxModel) comboBox.getModel();
                model.removeAllElements();
                model.addAll(vector);

                comboBox.setSelectedIndex(0);
                return typeMap;
            }
        } catch (Exception e) {
            aircraftTypeServiceLogger.warning("Error loading Aircraft Names: " + e.getMessage());
        }
        return null;
    }

}
