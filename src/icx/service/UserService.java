package icx.service;

/**
 *
 * @author sandaruwan
 */
public interface UserService {

    import icx.model.UserLoginReturnDTO ;
    import java.util.HashMap ;
    import java.util.Vector ;
    import javax.swing.JComboBox ;
    import javax.swing.JTable ;

    /**
     *
     * @author yasith sandesh
     */
    public interface UserService {

        public UserLoginReturnDTO userLogin(String email, String password);

        public boolean userAdd(String mobile, String fname, String lname, String password, String email, String userType);

        public HashMap<String, String> loadUserTypes(JComboBox jcombobox);

        public void loadUsers(JTable jTable, String query);

        public void userUpdate(String u_id, String mobile, String fname, String lname, String password, String email, String status);

        public void userStatusChange(String u_id, String status);

        public void addUserRole(String type);

        public void updateUserRole(String id, String type);

        public void tableLoadRole(JTable jTable);

        public String userCount(int status);

    }
