package Task7;
import java.sql.*;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Name : Mahesh Nikas");
            System.out.println("Batch : IT");
            // load oracle driver
            String oracleDriver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(oracleDriver);
            // Establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "Nikas@^1336");
            System.out.println("connection Successfuly");
            System.out.println("\nInsert value for inserting..");
            System.out.println("Enter Id:");
            int id = sc.nextInt();

            System.out.println("Enter Name:");
            String name = sc.next();

            System.out.println("Enter Email:");
            String email = sc.next();

            System.out.println("Enter City:");
            String city = sc.next();

            System.out.println("Enter Contact:");
            String contact = sc.next();
          PreparedStatement stmt=con.prepareStatement("INSERT INTO employee VALUES (?,?,?,?,?)");
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.setString(4, city);
            stmt.setString(5, contact);
            int count=stmt.executeUpdate();
            System.out.println(count+"Row inserted");
          //
            System.out.println("\nFor update");
            System.out.println("Enter the employee id");
            int id1=sc.nextInt();
            System.out.println("Enter the employee contact");
            String contact1=sc.next();
            // create statement
            PreparedStatement stmt1=con.prepareStatement("update employee set contact=? where id=?");
           // set value
            stmt1.setString(1,contact1);
            stmt1.setInt(2,id1);
            // execute satement
            int count1=stmt1.executeUpdate();
            System.out.println(count1+" row updated");

            System.out.println("\nfor get user According to city");
            System.out.println("Enter the city name :");
            String city1=sc.next();

            // create statement
            PreparedStatement stmt2=con.prepareStatement("SELECT * FROM employee  WHERE city = ?");
            // set value
            stmt2.setString(1,city1);
            // execute satement
            ResultSet rs=stmt2.executeQuery();
           while (rs.next()){
               System.out.println("\t"+rs.getInt(id)+"\t"+rs.getString(name)+"\t"+rs.getString(email)+"\t"+rs.getString(city)+"\t"+rs.getString(contact));
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}