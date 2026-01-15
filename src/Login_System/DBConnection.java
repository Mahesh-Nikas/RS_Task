package Login_System;

import java.sql.Connection;
import java.sql.DriverManager;
// this class contain the fuction of creat a connection of database.
public class DBConnection {
    public static  Connection getConnection() {
        Connection con=null;
        try {
            // Driver loader
            Class.forName(PropertyLoader.driver);
            // DB connection
            con = DriverManager.getConnection(PropertyLoader.url, PropertyLoader.user, PropertyLoader.Password);
            System.out.println("Connection Succesful");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}



