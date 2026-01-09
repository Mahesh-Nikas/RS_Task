package Task3;
import java.sql.*;
import java.util.Scanner;

public class Task3 {
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
            System.out.println("Enter Name");
            String Name=sc.next();
            System.out.println("Enter age");
            int age=sc.nextInt();
            System.out.println("Enter Marks");
            int Marks=sc.nextInt();

            // create connection
            PreparedStatement stmt=con.prepareStatement("Insert into student values(?,?,?,?)");
            // set value
            stmt.setInt(1,id);
            stmt.setString(2,Name);
            stmt.setInt(3,age);
            stmt.setInt(4,Marks);
            // execute statement
            int count=stmt.executeUpdate();
            System.out.println(count+" ows inserted");
            // close connection
            con.close();
            stmt.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
