package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public static Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/bancoteste?user=svc_churchmanagement&password=abc123456!";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + e);
        }
        return conn;
    }
    
}
