/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package icx.service;
import javax.swing.JTable;


/**
 *
 * @author Yasith Sandesh
 */
public interface UserLogsService {
    public boolean addUserLogs(String user_id);
 
    public void loadUserLogs(JTable jTable,String user_id);
    
    public void logOutUserLogs(String user_id);
}
