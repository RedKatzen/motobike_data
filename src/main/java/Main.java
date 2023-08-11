
import java.awt.Dimension;
import java.nio.file.Files;
import java.nio.file.Paths;
import views.Principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.stream.Stream; 
import java.util.stream.Collectors;

public class Main {
    

    private static String pathScriptInsert = "sql_scripts/insert_data.sql";
    
    public static void main(String[] args) {
        
        String sqlScript = "CREATE TABLE fuel_motorbike_data (id INT AUTO_INCREMENT PRIMARY KEY, date DATE, kmTraveled DOUBLE, litersStocked DOUBLE, totalKm DOUBLE, averageLitersPerKm DOUBLE);";

        Connection connection = null;
           
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "root";
        
           try {
               Class.forName("org.mariadb.jdbc.Driver");
               
               connection = DriverManager.getConnection(url, user, password);
               
               if(connection != null)
                   System.out.println("Conexão estabelecida!");
               
    //         Principal main = new Principal();
    //         main.setPreferredSize(new Dimension(668, 499));
    //         main.setMaximumSize(new Dimension(668, 499));
    //         main.setMinimumSize(new Dimension(668, 499));
    //         main.setLocationRelativeTo(null);
    //         main.setVisible(true);
               
               Statement statement = connection.createStatement();
               
               connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
               
                Properties properties = new Properties();
                properties.setProperty("user", user);
                properties.setProperty("password", password);
                properties.setProperty("transactionIsolation", "READ_COMMITTED");
               
            //   statement.executeUpdate(sqlScript);
               
            //    connection.commit();
               
            //   executeSqlScritps(statemente, pathScriptCreate);
            //   executeSqlScritps(statemente, pathScriptInsert);
               
               System.out.println("Scripts SQL executados com sucesso!");
    
           } catch (ClassNotFoundException e) {
               System.err.println("Driver do MySQL não encontrado");
                e.printStackTrace();
           } catch (SQLException e){
               System.err.println("Erro ao realizar conexão");
               e.printStackTrace();
           } finally {
                if(connection != null){
                    try {
                        connection.close();
                    } catch (SQLException e){
                        e.printStackTrace();
                    }
                }
           }
    }
    
    private static void executeSqlScritps(Statement statement, String scriptPath){
        try (Stream<String> lines = Files.lines(Paths.get(scriptPath))) {
            String sql = lines.collect(Collectors.joining(" "));
            statement.executeUpdate(sql);
        } catch (IOException  | SQLException e) {
            e.printStackTrace();
        }
    }
}
