package icx.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sandaruwan
 */
public class MySQL {

    private static Connection connection;
//        private static String URL = "sql213.infinityfree.com";
//    private static String DATABASE = "if0_36604738_ars_db";
//    private static String USERNAME = "if0_36604738";
//    private static String PASSWORD = "EVmt1ZsboG97";
//    private static String PORT = "3306";
    private static String URL = "localhost";
    private static String DATABASE = "ars";
    private static String USERNAME = "root";
    private static String PASSWORD = "Ms2005j@Neru";
    private static String PORT = "3306";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + URL + ":" + PORT + "/" + DATABASE, USERNAME, PASSWORD);
            System.out.println("Database connection established successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet execute(String query) throws Exception {

        Statement statement = connection.createStatement();

        if (query.startsWith("SELECT") | query.startsWith("select")) {
            return statement.executeQuery(query);
        } else {
            statement.executeUpdate(query);
            return null;
        }
    }
}
