package icx.model;

import java.sql.Timestamp;

/**
 *
 * @author sandaruwan
 */
public class DistanceDTO {

    private int id;
    private int airport1Id;
    private int airport2Id;
    private double distance;
    private Timestamp calculationDate;

    /**
     * @return the calculationDate
     */
    public Timestamp getCalculationDate() {
        return calculationDate;
    }

    /**
     * @param calculationDate the calculationDate to set
     */
    public void setCalculationDate(Timestamp calculationDate) {
        this.calculationDate = calculationDate;
    }

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
     * @return the airport1Id
     */
    public int getAirport1Id() {
        return airport1Id;
    }

    /**
     * @param airport1Id the airport1Id to set
     */
    public void setAirport1Id(int airport1Id) {
        this.airport1Id = airport1Id;
    }

    /**
     * @return the airport2Id
     */
    public int getAirport2Id() {
        return airport2Id;
    }

    /**
     * @param airport2Id the airport2Id to set
     */
    public void setAirport2Id(int airport2Id) {
        this.airport2Id = airport2Id;
    }

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

}
