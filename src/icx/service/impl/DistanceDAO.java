package icx.service.impl;

import icx.util.LoggerUtil;
import icx.model.DistanceDTO;
import icx.model.MySQL;
import icx.service.DistanceService;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandaruwan
 */
public class DistanceDAO implements DistanceService {
    
    private static final Logger DistanceDAOLogger = Logger.getLogger("icx.service.impl.DistanceDAO");

    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("icx.service.impl.DistanceDAO.txt", true);
        } catch (Exception e) {
             DistanceDAOLogger.warning("Failed to initialize logger: " + e.getMessage());
        }
        DistanceDAOLogger.addHandler(fileHandler);
    }


    @Override
    public void addDistance(DistanceDTO distanceDTO) throws SQLException {
        String query = "INSERT INTO Distances (`departure_airport_id`, `arrival_airport_id`, `distance`, `calculation_date`) VALUES ('"+ distanceDTO.getAirport1Id() + "', '" + distanceDTO.getAirport2Id() + "', '" + distanceDTO.getDistance() + "','"+distanceDTO.getCalculationDate()+"')";
        MySQL.execute(query);
    }

    @Override
    public void updateDistance(DistanceDTO distanceDTO) {
        String query = "UPDATE `Distances` SET `departure_airport_id`='"+distanceDTO.getAirport1Id()+"', `arrival_airport_id`='"+distanceDTO.getAirport2Id()+"', distance='"+distanceDTO.getDistance()+"' WHERE `distance_id`='"+distanceDTO.getId()+"'";
        try {
             MySQL.execute(query);
        } catch (Exception e) {
            DistanceDAOLogger.warning("Error updating Distance: " + e.getMessage());
        }
    }

    @Override
    public void deleteDistance(int id) {
        String query = "DELETE FROM Distances WHERE `distance_id`=" + id;
        try {
            MySQL.execute(query);
        } catch (Exception e) {
            DistanceDAOLogger.warning("Error deleteing Distance: " + e.getMessage());
        }
    }

    @Override
    public List<DistanceDTO> getAllDistances() throws SQLException {
        String query = "SELECT * FROM Distances";
        ResultSet rs = MySQL.execute(query);
        List<DistanceDTO> distances = new ArrayList<>();
        while (rs.next()) {
            DistanceDTO distance = new DistanceDTO();
            distance.setId(rs.getInt("id"));
            distance.setAirport1Id(rs.getInt("airport1Id"));
            distance.setAirport2Id(rs.getInt("airport2Id"));
            distance.setDistance(rs.getDouble("distance"));
            distances.add(distance);
        }
        return distances;
    }

    @Override
    public DistanceDTO calculate(int airport1Id, int airport2Id, JLabel distance, JLabel msg) {

        if (airport1Id == 0) {
            msg.setText("NULL: Please Choose From Destination!");
            msg.setForeground(Color.red);
            distance.setText("0000.00 KM");

        } else if (airport2Id == 0) {
            msg.setText("NULL: Please Choose To Destination!");
            msg.setForeground(Color.red);
            distance.setText("0000.00 KM");

        } else if (airport1Id == airport2Id) {
            msg.setText("SAME: Please Choose Another Destination!");
            msg.setForeground(Color.red);
        } else if (airport1Id != 0 && airport2Id != 0) {

            try {
                DistanceDTO result = findDistance(airport1Id, airport2Id);
                distance.setText(String.valueOf(result.getDistance()));
                distanceAnimator(result, distance, msg);
                return result;
            } catch (SQLException e) {
                LoggerUtil.logWarning("SQL Error: " + e.getMessage());
                msg.setText("Error calculating distance.");
                msg.setForeground(Color.RED);
            } catch (Exception e) {
                LoggerUtil.logWarning("Error: " + e.getMessage());
                msg.setText("Error calculating distance.");
                msg.setForeground(Color.RED);
            }

        }

        return null;
    }

    @Override
    public DistanceDTO findDistance(int ID1, int ID2) throws SQLException {
        String query = "SELECT * FROM `Distances` WHERE (`departure_airport_id`='" + ID1 + "' OR `departure_airport_id`='" + ID2 + "') AND (`arrival_airport_id`='" + ID1 + "' OR `arrival_airport_id`='" + ID2 + "')";

        try (ResultSet rs = MySQL.execute(query)) {
            if (rs.next()) {
                DistanceDTO dto = new DistanceDTO();
                dto.setId(rs.getInt("distance_id"));
                dto.setAirport1Id(rs.getInt("departure_airport_id"));
                dto.setAirport2Id(rs.getInt("arrival_airport_id"));
                dto.setDistance(rs.getDouble("distance"));
                dto.setCalculationDate(rs.getTimestamp("calculation_date"));
                return dto;
            } else {
                throw new SQLException("No distance found between the specified airports.");
            }

        }
    }

    @Override
    public void distanceAnimator(DistanceDTO distanceDTO, JLabel distance, JLabel msg) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    double totalDistance = distanceDTO.getDistance();
                    int steps = 100; // Number of steps for the animation
                    double increment = totalDistance / steps;

                    for (int i = 0; i <= steps; i++) {
                        double currentDistance = i * increment;
                        distance.setText(String.format("%.2f KM", currentDistance));
                        try {
                            Thread.sleep(5); // Small delay for smooth animation
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }
                    distance.setText(String.format("%.2f KM", totalDistance));
                    msg.setText("Calculated At: " + distanceDTO.getCalculationDate());
                }
            }
        });
        t1.start();

    }

    @Override
    public void tableDataLoad(JTable table) throws SQLException {
        String query = "SELECT d.distance_id, (SELECT a1.name FROM Airports a1 WHERE a1.airport_id = d.departure_airport_id) AS departure_airport, (SELECT a2.name FROM Airports a2 WHERE a2.airport_id = d.arrival_airport_id) AS arrival_airport, d.distance, DATE(d.calculation_date) AS date, TIME(d.calculation_date) AS time FROM Distances d";

        try (ResultSet rs = MySQL.execute(query)) {

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            // Clear existing rows
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("distance_id"),
                    rs.getString("departure_airport"),
                    rs.getString("arrival_airport"),
                    rs.getDouble("distance"),
                    rs.getDate("date"),
                    rs.getTime("time")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            LoggerUtil.logWarning("SQL Error: " + e.getMessage());
            throw e;
        }

    }

}
