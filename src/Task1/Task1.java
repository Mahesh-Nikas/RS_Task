package Task1;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Task1 {
    public static void main(String[] arg) {
        try {
            System.out.println("Name : Mahesh Nikas");
            System.out.println("Batch : IT");
            // load oracle driver
           String oracleDriver="oracle.jdbc.driver.OracleDriver";
            Class.forName(oracleDriver);
            // Establish connection logic
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Nikas@^1336");
            System.out.println("connection Successfuly");
            // close connection
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
