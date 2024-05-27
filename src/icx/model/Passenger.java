package icx.model;

/**
 *
 * @author ksoff
 */
public class Passenger {
    
    private int id;
    private String fname;
    private String lname;
    private String passport;
    private String status;

    public Passenger() {
    }

    public Passenger(String fname, String lname, String passport, String status) {
        this.fname = fname;
        this.lname = lname;
        this.passport = passport;
        this.status = status;
    }

    public Passenger(int id, String fname, String lname, String passport, String status) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.passport = passport;
        this.status = status;
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
