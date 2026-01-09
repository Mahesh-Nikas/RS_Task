package Task2;
import java.sql.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] arg) {
        try {
            System.out.println("Name : Mahesh Nikas");
            System.out.println("Batch : IT");
            // load oracle driver
            String oracleDriver="oracle.jdbc.driver.OracleDriver";
            Class.forName(oracleDriver);
            // Establish connection
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Nikas@^1336");
            System.out.println("connection Successfuly");
            // create connection

            PreparedStatement stmt=con.prepareStatement("select * from student");
            // execute statement
            ResultSet rs=stmt.executeQuery();
             while(rs.next()){
                 System.out.println("\t"+rs.getInt("Id")+"\t"+rs.getString("Name")+"\t"+rs.getInt("age")+"\t"+rs.getInt("Marks"));
             }
            // close connection
            con.close();
             stmt.close();
             rs.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
