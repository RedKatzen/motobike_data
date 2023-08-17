
import java.awt.Dimension;
import java.nio.file.Files;
import java.nio.file.Paths;
import views.Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.stream.Stream; 
import java.util.stream.Collectors;

import connection.ConexaoDAO;

public class Main {
    

   // private static String pathScriptInsert = "sql_scripts/insert_data.sql";
    
    public static void main(String[] args) {
        
        String pathScriptInsert = "sql_scripts/insert_data.sql"; 

        Connection connection = null;
          
           try {
               connection = ConexaoDAO.conectaBD();
               
            
               if(connection != null)
                   System.out.println("Conexão estabelecida!");
               
    //         Principal main = new Principal();
    //         main.setPreferredSize(new Dimension(668, 499));
    //         main.setMaximumSize(new Dimension(668, 499));
    //         main.setMinimumSize(new Dimension(668, 499));
    //         main.setLocationRelativeTo(null);
    //         main.setVisible(true);
               
               //Statement statement = connection.createStatement();
               
               //connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
               
                //Properties properties = new Properties();
                //properties.setProperty("user", user);
                //properties.setProperty("password", password);
                //properties.setProperty("transactionIsolation", "READ_COMMITTED");
               
            //   statement.executeUpdate(sqlScript);
               
            //    connection.commit();
               
            //   executeSqlScritps(statemente, pathScriptCreate);
               executeSqlScritps(connection, pathScriptInsert);
               connection.close();
            
    
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
    
    private static void executeSqlScritps(Connection connection, String scriptPath) {
        try (InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(scriptPath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            
            StringBuilder sql = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sql.append(line).append("\n");
            }

            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sql.toString());
                System.out.println("Scripts SQL executados com sucesso!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao executar script");
        }
    }
}
