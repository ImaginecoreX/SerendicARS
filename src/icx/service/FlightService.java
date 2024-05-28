package icx.service;

import icx.model.FlightDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sandaruwan
 */
public interface FlightService {

    public void addFlight(FlightDTO flightDTO) throws SQLException;

    public void updateFlight(FlightDTO flightDTO) throws SQLException;

    public void deleteFlight(int id) throws SQLException;

    public List<FlightDTO> getAllFlights() throws SQLException;

}
