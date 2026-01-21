package Employee_Tax_Calculation_System;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TaxDAO {

    static Scanner sc = new Scanner(System.in);

    public static void insert() {
        try {
            Connection con = DBConnection.getConnection();

            System.out.println("Enter Tax Id");
            int tax_id = sc.nextInt();

            System.out.println("Enter Emp Id");
            int emp_id = sc.nextInt();

            System.out.println("Enter Financial Year");
            String financial_year = sc.next();

            PreparedStatement stmt = con.prepareStatement("SELECT salary FROM employees WHERE emp_id=?");
            stmt.setInt(1, emp_id);
            ResultSet rs = stmt.executeQuery();

            double salary = 0;
            double tax_amount = 0;

            if (rs.next()) {
                salary = rs.getDouble("salary");
            }

            if (salary <= 250000) {
                tax_amount = 0;
            } else if (salary <= 500000) {
                tax_amount = salary * 0.05;
            } else if (salary <= 1000000) {
                tax_amount = salary * 0.20;
            } else {
                tax_amount = salary * 0.30;
            }

            PreparedStatement stmt1 = con.prepareStatement("INSERT INTO taxes VALUES (?,?,?,?)");
            stmt1.setInt(1, tax_id);
            stmt1.setInt(2, emp_id);
            stmt1.setDouble(3, tax_amount);
            stmt1.setString(4, financial_year);

            int count =  stmt1.executeUpdate();
            System.out.println(count + " Rows Inserted");

            rs.close();
            stmt.close();
            stmt1.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
