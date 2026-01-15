package Login_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Validation {
    public static void validation( String Name,String Pass) {
          Boolean flag=false;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(" Select * from users");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                if(rs.getString("username").equals(Name)&&rs.getString("password").equals(Pass)){
                    flag=true;
                }
            }
               con.close();
            stmt.close();
         }
        catch (Exception e){
            e.printStackTrace();
        }
        if(flag){
            System.out.println("User Validate login succesfully ");
        }
        else
            System.out.println("User Not Valid ");
        System.out.println("\n");
    }

}
