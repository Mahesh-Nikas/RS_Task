package Task5;
import java.sql.*;
import java.util.Scanner;

public class Task5 {
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

            // user input
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Id");
            int id=sc.nextInt();


            // create Statement
            PreparedStatement stmt=con.prepareStatement("delete student  where Id=?");
            // set value
            stmt.setInt(1,id);

            // execute statement
            int count=stmt.executeUpdate();
            System.out.println(count+" rows deleted");
            // close connection
            con.close();
            stmt.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
