package Menu_Driven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Query {

  static Scanner sc=new Scanner(System.in);
        public static void insert() {
                   try{
                       Connection con=DBConnection.getConnection();
                       System.out.println("Enter Student_id");
                       int Student_id =sc.nextInt();
                       System.out.println("Enter the Name");
                       String Name=sc.next();
                       System.out.println("Enter Student Cource");
                       String Cource =sc.next();
                       System.out.println("Enter Student_Age");
                       int Age =sc.nextInt();
                       PreparedStatement stmt= con.prepareStatement(" INSERT INTO students ( student_id,name, course, age) VALUES ( ?,?,?,?)");
                       stmt.setInt(1,Student_id);
                       stmt.setString(2,Name);
                       stmt.setString(3,Cource);
                       stmt.setInt(4,Age);
                       int count=stmt.executeUpdate();
                       System.out.println(count+" Rows Inserted ");
                   }
                   catch (Exception e){
                       e.printStackTrace();
                   }
        }

        public static void update () {
            try{
                Connection con=DBConnection.getConnection();
                System.out.println("Enter Student_id");
                int Student_id =sc.nextInt();
                System.out.println("Enter the Cource for update");
                String Course=sc.next();
                PreparedStatement stmt=con.prepareStatement(" update students set course = ? where student_id=? ");
                stmt.setString(1,Course);
                stmt.setInt(2,Student_id);
                int count = stmt.executeUpdate();
                System.out.println(count+" rows update");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        public static void delete () {
            try{
                Connection con=DBConnection.getConnection();
                System.out.println("Enter Student_id for delete");
                int id =sc.nextInt();
                PreparedStatement stmt=con.prepareStatement(" delete students  where student_id=? ");
                stmt.setInt(1,id);
                int count = stmt.executeUpdate();
                System.out.println(count+" rows deleted");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        public static void select () {
            try{
                Connection con=DBConnection.getConnection();
                PreparedStatement stmt=con.prepareStatement("Select * from students");
                ResultSet rs= stmt.executeQuery();
                while (rs.next()){
                    System.out.println("\t"+rs.getInt("student_id")+"\t"+rs.getString("name")+"\t"+rs.getString("course")+"\t"+rs.getInt("age"));
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
}

