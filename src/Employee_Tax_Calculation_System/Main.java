package Employee_Tax_Calculation_System;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Name : Mahesh Nikas , Branch : IT ");

        int ch;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 Add Employee");
            System.out.println("2 View Employees");
            System.out.println("3 Update Employee Details");
            System.out.println("4 Delete Employee");
            System.out.println("5 Calculate and Store Tax");
            System.out.println("6 Exit");
            System.out.println("7 Calculate and Store Tax");
            System.out.println("----------------");
            System.out.println("Enter your choice\n");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    EmployeeDAO.insert();
                    break;

                case 2:
                    EmployeeDAO.select();
                    break;

                case 3:
                    EmployeeDAO.update();
                    break;

                case 4:
                    EmployeeDAO.delete();
                    break;

                case 5:
                    TaxDAO.insert();
                    break;

                case 6:
                    System.out.println("Exit");
                    break;
                case 7:
                    EmployeeDAO.selectAll();

                default:
                    System.out.println("Wrong Choice");
            }

        } while (ch != 6);
    }
}
