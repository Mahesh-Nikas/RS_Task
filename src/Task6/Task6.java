package Task6;
import java.sql.*;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Name : Mahesh Nikas");
            System.out.println("Batch : IT");
            // load oracle driver
            String oracleDriver="oracle.jdbc.driver.OracleDriver";
            Class.forName(oracleDriver);
            // Establish connection
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Nikas@^1336");
            System.out.println("connection Successfuly");
            try {

                // create statement
                PreparedStatement stmt = con.prepareStatement("CREATE TABLE employee (\n" +
                        "    id      NUMBER PRIMARY KEY,\n" +
                        "    name    VARCHAR2(50),\n" +
                        "    email   VARCHAR2(100),\n" +
                        "    city    VARCHAR2(50),\n" +
                        "    contact VARCHAR2(15))");

                // execute statement
                int count = stmt.executeUpdate();
                System.out.println(" table created");
            }
            catch (SQLException e){
                System.out.println("Table already exist");
            }

            // Menu
            System.out.println("\nChoose Operation:");
            System.out.println("1 : Insert");
            System.out.println("2 : Update");
            System.out.println("3 : Delete");

            int choice = sc.nextInt();

            //  INSERT
            if (choice == 1) {

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
                // statement created
                PreparedStatement stmt1 = con.prepareStatement("INSERT INTO employee VALUES (?,?,?,?,?)");
                // set value
                stmt1.setInt(1, id);
                stmt1.setString(2, name);
                stmt1.setString(3, email);
                stmt1.setString(4, city);
                stmt1.setString(5, contact);
               // execute query
                int count1 = stmt1.executeUpdate();
                System.out.println(count1 + " row inserted");
              // statment close
                stmt1.close();
            }

            //  UPDATE
            else if (choice == 2) {

                System.out.println("Enter Id to update:");
                int id = sc.nextInt();

                System.out.println("Enter New City:");
                String city = sc.next();
              // statement create
                PreparedStatement stmt2 = con.prepareStatement("UPDATE employee SET city=? WHERE id=?");
             // set value
                stmt2.setString(1, city);
                stmt2.setInt(2, id);
              // execute statement
                int count3 = stmt2.executeUpdate();
                System.out.println(count3 + " rows updated");
             // close statement
                stmt2.close();
            }

            //  DELETE
            else if (choice == 3) {

                System.out.println("Enter Id to delete:");
                int id = sc.nextInt();
                 // crate statement
                PreparedStatement stmt4 = con.prepareStatement("DELETE FROM employee WHERE id=?");
                    // set value
                stmt4.setInt(1, id);
               // execute query
                int count5 = stmt4.executeUpdate();
                System.out.println(count5 + " record deleted");
               // close statement
                stmt4.close();
            }

            else {
                System.out.println("Invalid choice");
            }

            // 5️⃣ Close Connection
            con.close();
            sc.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
