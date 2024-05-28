package icx.service;

import icx.model.DistanceDTO;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author sandaruwan
 */
public interface DistanceService {
    
     public void addDistance(DistanceDTO distanceDTO) throws SQLException;

    public void updateDistance(DistanceDTO distanceDTO);

    public void deleteDistance(int id);

    public List<DistanceDTO> getAllDistances() throws SQLException;
    
    public DistanceDTO calculate(int airport1Id, int airport2Id,JLabel distance, JLabel msg);
    
    public DistanceDTO findDistance(int ID1, int ID2)throws SQLException;
    
    public void distanceAnimator(DistanceDTO distanceDTO, JLabel distance, JLabel msg);
    
    public void tableDataLoad(JTable table) throws SQLException;
    
}
