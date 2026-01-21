package Student_Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CourseDAO {

    public static void insert(Course c) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("INSERT INTO courses VALUES (?,?,?)");

            ps.setInt(1, c.getCourse_id());
            ps.setString(2, c.getCourse_name());
            ps.setString(3, c.getDuration());

            ps.executeUpdate();

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(int id, String duration) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("UPDATE courses SET duration=? WHERE course_id=?");

            ps.setString(1, duration);
            ps.setInt(2, id);

            ps.executeUpdate();

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("DELETE FROM courses WHERE course_id=?");

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void select() {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM courses");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1)+" "+
                                rs.getString(2)+" "+
                                rs.getString(3)
                );
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectById(int id) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM courses WHERE course_id=?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1)+" "+
                                rs.getString(2)+" "+
                                rs.getString(3)
                );
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
