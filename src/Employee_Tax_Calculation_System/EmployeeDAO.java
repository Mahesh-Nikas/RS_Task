package Employee_Tax_Calculation_System;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeDAO {

    static Scanner sc = new Scanner(System.in);

    public static void insert() {
        try {
            Connection con = DBConnection.getConnection();

            System.out.println("Enter Emp Id");
            int emp_id = sc.nextInt();

            System.out.println("Enter Name");
            String name = sc.next();

            System.out.println("Enter Email");
            String email = sc.next();

            System.out.println("Enter Salary");
            double salary = sc.nextDouble();

            System.out.println("Enter Dept Id");
            int dept_id = sc.nextInt();

            PreparedStatement stmt = con.prepareStatement("INSERT INTO employees VALUES (?,?,?,?,?)");
            stmt.setInt(1, emp_id);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.setDouble(4, salary);
            stmt.setInt(5, dept_id);

            int count = stmt.executeUpdate();
            System.out.println(count + " Rows Inserted");

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update() {
        try {
            Connection con = DBConnection.getConnection();

            System.out.println("Enter Emp Id");
            int emp_id = sc.nextInt();

            System.out.println("Enter New Salary");
            double salary = sc.nextDouble();

            PreparedStatement stmt = con.prepareStatement("UPDATE employees SET salary=? WHERE emp_id=?");
            stmt.setDouble(1, salary);
            stmt.setInt(2, emp_id);

            int count = stmt.executeUpdate();
            System.out.println(count + " Rows Updated");

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void selectAll() {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement stmt = con.prepareStatement("SELECT e.emp_id,e.name,e.email,e.salary,d.dept_name,d.location,t.tax_amount,t.financial_year FROM employees e INNER JOIN departments d ON e.dept_id=d.dept_id INNER JOIN taxes t ON e.emp_id=t.emp_id");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("email") + "\t" +
                                rs.getDouble("salary") + "\t" +
                                rs.getString("dept_name") + "\t" +
                                rs.getString("location") + "\t" +
                                rs.getDouble("tax_amount") + "\t" +
                                rs.getString("financial_year")
                );
            }
            stmt.close();
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void delete() {
        try {
            Connection con = DBConnection.getConnection();

            System.out.println("Enter Emp Id");
            int emp_id = sc.nextInt();

            PreparedStatement stmt = con.prepareStatement("DELETE FROM employees WHERE emp_id=?");
            stmt.setInt(1, emp_id);

            int count = stmt.executeUpdate();
            System.out.println(count + " Rows Deleted");

            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void select() {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM employees");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("email") + "\t" +
                                rs.getDouble("salary") + "\t" +
                                rs.getInt("dept_id")
                );
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
