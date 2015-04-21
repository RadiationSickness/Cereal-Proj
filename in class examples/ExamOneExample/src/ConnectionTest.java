import java.sql.*;
import java.sql.DriverManager;

public class ConnectionTest {

    static Connection getConnection() throws Exception {

        String url = "jdbc:mysql://localhost/";
        String dbName = "sample";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "awreyt";
        String password = "Ta411195";

        Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection(url + dbName, userName,password);
        System.out.println("database connected");
        return conn;
    }
    
public static void closeConnection(Connection conn) {
     try {

        conn.close();

    } catch (SQLException e) {

    }

}
}