package icx.service.impl;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import icx.model.MySQL;
import icx.service.UserService;
import icx.model.UserLoginReturnDTO;
import javax.swing.JOptionPane;
import icx.model.UserDTO;
import icx.service.UserLogsService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 *
 * @author sandaruwan
 */
public class UserServiceIMPL implements UserService, UserLogsService {

    private static Logger userServiceLogger;
    private static FileHandler fileHandler;

    static {
        userServiceLogger = Logger.getLogger("icx.service.impl.UserServiceIMPL");
        try {
            fileHandler = new FileHandler("icx.service.impl.UserServiceIMPL.txt", true);
        } catch (Exception e) {
        }
        userServiceLogger.addHandler(fileHandler);
    }

    @Override
    public UserLoginReturnDTO userLogin(String email, String password) {

        try {
            ResultSet resultSet = MySQL.execute("SELECT * FROM `user` WHERE `email`='" + email + "' AND `password`='" + password + "'");

            if (resultSet.next()) {

                if (resultSet.getInt("status") == 1) {

                    boolean call = this.addUserLogs(String.valueOf(resultSet.getInt("u_id")));

                    if (call) {

                        return new UserLoginReturnDTO(new UserDTO(resultSet.getInt("u_id"), resultSet.getString("mobile"), resultSet.getString("fname"), resultSet.getString("lname"), resultSet.getString("password"), resultSet.getString("email"), resultSet.getInt("status"), resultSet.getString("user_type_id")), true, "sucess");
                    }

                } else {
                    return new UserLoginReturnDTO(null, false, "Block User");
                }

            } else {

                return new UserLoginReturnDTO(null, false, "");

            }

        } catch (Exception e) {
            userServiceLogger.warning(e.toString());
        }

        return null;
    }

    @Override
    public HashMap<String, String> loadUserTypes(JComboBox jcombobox) {
        try {
            ResultSet resultset = MySQL.execute("SELECT * FROM `user_type`");
            Vector<String> vector = new Vector<>();
            HashMap<String, String> typeIdMap = new HashMap<>();
            vector.add("Select Type");
            while (resultset.next()) {
                vector.add(resultset.getString("type"));
                typeIdMap.put(resultset.getString("type"), resultset.getString("id"));
            }

            DefaultComboBoxModel model = (DefaultComboBoxModel) jcombobox.getModel();
            model.removeAllElements();
            model.addAll(vector);
            jcombobox.setSelectedIndex(0);

            return typeIdMap;
        } catch (Exception e) {
            userServiceLogger.warning(e.toString());
        }
        return null;
    }

    @Override
    public void loadUsers(JTable jTable, String query) {

        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
        tableModel.setRowCount(0);

        try {

            ResultSet resultSet = MySQL.execute(query);

            while (resultSet.next()) {
                Vector rowData = new Vector();
                rowData.add(resultSet.getString("u_id"));
                rowData.add(resultSet.getString("fname"));
                rowData.add(resultSet.getString("lname"));
                rowData.add(resultSet.getString("password"));
                rowData.add(resultSet.getString("mobile"));
                rowData.add(resultSet.getString("email"));
                rowData.add(resultSet.getString("type"));
                if (resultSet.getInt("status") == 1) {
                    rowData.add("Active");
                } else {
                    rowData.add("Block");
                }

                tableModel.addRow(rowData);

            }

        } catch (Exception e) {
            userServiceLogger.warning(e.toString());
        }
    }

    @Override
    public void userAdd(String mobile, String fname, String lname, String password, String email, String userType) {
        try {
            MySQL.execute("INSERT INTO `user`(`mobile`,`fname`,`lname`,`password`,`email`,`user_type_id`) VALUES('" + mobile + "','" + fname + "','" + lname + "','" + password + "','" + email + "','" + userType + "')");

        } catch (Exception e) {
             userServiceLogger.warning(e.toString());
        }

    }

    @Override
    public void userUpdate(String u_id, String mobile, String fname, String lname, String password, String email, String status) {
        try {
            MySQL.execute("UPDATE `user` SET `mobile`='" + mobile + "',`fname`='" + fname + "',`password`='" + password + "',`email`='" + email + "',`status`='" + status + "' WHERE `u_id`='" + u_id + "'");
        } catch (Exception e) {
            userServiceLogger.warning(e.toString());
        }
    }

    @Override
    public void userStatusChange(String u_id, String status) {
        try {
            MySQL.execute("UPDATE `user` SET `status`='" + status + "' WHERE `u_id`='" + u_id + "'");
        } catch (Exception e) {
             userServiceLogger.warning(e.toString());
        }
    }

    @Override
    public void addUserRole(String type) {
        try {
            MySQL.execute("INSERT INTO `user_type`(`type`) VALUES('" + type + "')");
        } catch (Exception e) {
             userServiceLogger.warning(e.toString());
        }
    }

    @Override
    public void updateUserRole(String id, String type) {
        try {
            MySQL.execute("UPDATE `user_type` SET `type`='" + type + "' WHERE `id`='" + id + "'");
        } catch (Exception e) {
         userServiceLogger.warning(e.toString());
        }
    }

    ////USER LOGS
    @Override
    public boolean addUserLogs(String user_id) {
        Date dateTime = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            MySQL.execute("INSERT INTO `user_log`(`login_date_time`,`logout_date_time`,`u_id`) VALUES('" + format.format(dateTime) + "','" + format.format(dateTime) + "','" + user_id + "')");
            return true;
        } catch (Exception e) {
          userServiceLogger.warning(e.toString());
        }
        return false;
    }

    @Override
    public void loadUserLogs(JTable jTable, String user_id) {
        try {
            DefaultTableModel tablemodel = (DefaultTableModel) jTable.getModel();
            tablemodel.setRowCount(0);

            ResultSet resultSet = MySQL.execute("SELECT * FROM `user` INNER JOIN `user_log` ON `user`.`u_id`=`user_log`.`u_id` INNER JOIN `user_type` ON `user`.`user_type_id`=`user_type`.`id` WHERE `user`.`u_id`='" + user_id + "'");
            while (resultSet.next()) {

                Vector row = new Vector();
                row.add(resultSet.getString("ul_id"));
                row.add(resultSet.getString("login_date_time"));
                row.add(resultSet.getString("logout_date_time"));
//                row.add(resultSet.getString("fname"));
//                row.add(resultSet.getString("lname"));
//                row.add(resultSet.getString("email"));
//                row.add(resultSet.getString("mobile"));
//                row.add(resultSet.getString("type"));
                tablemodel.addRow(row);
            }

        } catch (Exception e) {
            userServiceLogger.warning(e.toString());
        }
    }

    @Override
    public void logOutUserLogs(String user_id) {
        Date dateTime = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            MySQL.execute("UPDATE `user_log` SET `logout_date_time`='" + format.format(dateTime) + "' WHERE `u_id`='" + user_id + "'");
        } catch (Exception e) {
             userServiceLogger.warning(e.toString());
        }
    }

    @Override
    public void tableLoadRole(JTable jTable) {
        try {
            DefaultTableModel tablemodel = (DefaultTableModel) jTable.getModel();
            tablemodel.setRowCount(0);

            ResultSet resultSet = MySQL.execute("SELECT * FROM `user_type`");
            while (resultSet.next()) {

                Vector row = new Vector();
                row.add(resultSet.getString("id"));
                row.add(resultSet.getString("type"));
                tablemodel.addRow(row);
            }

        } catch (Exception e) {
          userServiceLogger.warning(e.toString());
        }
    }

}
