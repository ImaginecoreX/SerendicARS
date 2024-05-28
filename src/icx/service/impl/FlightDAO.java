package icx.service.impl;

import icx.model.FlightDTO;
import icx.model.MySQL;
import icx.service.FlightService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sandaruwan
 */
public class FlightDAO implements FlightService {

    @Override
    public void addFlight(FlightDTO flightDTO) throws SQLException {
        String query = "INSERT INTO Flight (airlineId, aircraftTypeId, departureAirportId, arrivalAirportId, departureTime, arrivalTime) VALUES ("
                + flightDTO.getAirlineId() + ", "
                + flightDTO.getAircraftTypeId() + ", "
                + flightDTO.getDepartureAirportId() + ", "
                + flightDTO.getArrivalAirportId() + ", '"
                + flightDTO.getDepartureTime() + "', '"
                + flightDTO.getArrivalTime() + "')";
        MySQL.execute(query);
    }

    @Override
    public void updateFlight(FlightDTO flightDTO) throws SQLException {
        String query = "UPDATE Flight SET airlineId=" + flightDTO.getAirlineId()
                + ", aircraftTypeId=" + flightDTO.getAircraftTypeId()
                + ", departureAirportId=" + flightDTO.getDepartureAirportId()
                + ", arrivalAirportId=" + flightDTO.getArrivalAirportId()
                + ", departureTime='" + flightDTO.getDepartureTime()
                + "', arrivalTime='" + flightDTO.getArrivalTime()
                + "' WHERE id=" + flightDTO.getId();
        MySQL.execute(query);
    }

    @Override
    public void deleteFlight(int id) throws SQLException {
        String query = "DELETE FROM Flight WHERE id=" + id;
        MySQL.execute(query);
    }

    @Override
    public List<FlightDTO> getAllFlights() throws SQLException {
        String query = "SELECT * FROM Flight";
        ResultSet rs = MySQL.execute(query);
        List<FlightDTO> flights = new ArrayList<>();
        while (rs.next()) {
            FlightDTO flight = new FlightDTO();
            flight.setId(rs.getInt("id"));
            flight.setAirlineId(rs.getInt("airlineId"));
            flight.setAircraftTypeId(rs.getInt("aircraftTypeId"));
            flight.setDepartureAirportId(rs.getInt("departureAirportId"));
            flight.setArrivalAirportId(rs.getInt("arrivalAirportId"));
            flight.setDepartureTime(rs.getTimestamp("departureTime"));
            flight.setArrivalTime(rs.getTimestamp("arrivalTime"));
            flights.add(flight);
        }
        return flights;
    }

}
