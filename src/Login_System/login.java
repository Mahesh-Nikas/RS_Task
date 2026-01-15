package Login_System;

import Menu_Driven.DBConnection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class login {
    public static void main(String[] arg) {
        for (int i = 0; i <= 3; i++) {
            System.out.println("Name : Mahesh Nikas, Branch : IT");
            Scanner sc = new Scanner(System.in);
            System.out.println("......... login  ...........");
            System.out.println(" Enter Your Name");
            String Name = sc.next();
            System.out.println(" Enter Your Password");
            String Pass = sc.next();
            Validation.validation(Name, Pass);

        }
    }
}
