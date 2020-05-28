package nmr.demo.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {

    static String URL;
    static String USER;
    static String PASSWORD;


    public static Connection getDBConnection() {

        /*
        Connect to config.properties
         */
        Properties prop = new Properties();
        try {
            FileInputStream propertyFile = new FileInputStream("src/main/resources/application.properties");
            prop.load(propertyFile);
            USER = prop.getProperty("username");
            PASSWORD = prop.getProperty("password");
            URL = prop.getProperty("url");


        }catch (IOException e) {
            e.printStackTrace();
        }

    /*
        Connection Manager
         */

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/NMR_db?serverTimezone=UTC", "root", "jlb110674");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


}


