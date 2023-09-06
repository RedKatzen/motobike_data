package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public static Connection conn;
    
    public static Connection conectaBD(){
        try {
            String url = "jdbc:mysql://localhost:3306/mysql?user=root&password=root";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + e);
        }
        return conn;
    }
    
}
