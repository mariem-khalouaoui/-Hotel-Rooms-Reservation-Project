import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDB {
    public static Connection getConnection() {
        Connection connection = null; 
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/BD", "root","");
        } catch ( SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed: " );
        }
        return connection; // Return connection variable
    }
}