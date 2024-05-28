package icx.model;

import java.sql.Timestamp;

/**
 *
 * @author sandaruwan
 */
public class FlightDTO {

    private int id;
    private int airlineId;
    private int aircraftTypeId;
    private int departureAirportId;
    private int arrivalAirportId;
    private Timestamp departureTime;
    private Timestamp arrivalTime;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the airlineId
     */
    public int getAirlineId() {
        return airlineId;
    }

    /**
     * @param airlineId the airlineId to set
     */
    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    /**
     * @return the aircraftTypeId
     */
    public int getAircraftTypeId() {
        return aircraftTypeId;
    }

    /**
     * @param aircraftTypeId the aircraftTypeId to set
     */
    public void setAircraftTypeId(int aircraftTypeId) {
        this.aircraftTypeId = aircraftTypeId;
    }

    /**
     * @return the departureAirportId
     */
    public int getDepartureAirportId() {
        return departureAirportId;
    }

    /**
     * @param departureAirportId the departureAirportId to set
     */
    public void setDepartureAirportId(int departureAirportId) {
        this.departureAirportId = departureAirportId;
    }

    /**
     * @return the arrivalAirportId
     */
    public int getArrivalAirportId() {
        return arrivalAirportId;
    }

    /**
     * @param arrivalAirportId the arrivalAirportId to set
     */
    public void setArrivalAirportId(int arrivalAirportId) {
        this.arrivalAirportId = arrivalAirportId;
    }

    /**
     * @return the departureTime
     */
    public Timestamp getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the arrivalTime
     */
    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

}
