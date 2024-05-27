package icx.service;

import icx.model.Passenger;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author ksoff
 */
public interface PassengerSevice {
    
    public void loadPassengerStatus(JComboBox statusComboBox);
    
    public void openAddPassenger(JPanel parent);
    
    public void openManagePassenger(JPanel parent);
    
    public boolean loadPassengers(String text, JTable passengerTable);
    
    public void updatePassenger(Passenger passengerDTO, JDialog parent);
    
    public void addPassenger(Passenger passengerDTO, JDialog parent);
}
