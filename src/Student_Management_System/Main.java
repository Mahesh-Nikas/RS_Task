package Student_Management_System;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Name : Mahesh Nikas , Branch : IT");

        int ch;

        do {
            System.out.println("\n1 ********* Menu ***************");
            System.out.println("\n1 Insert Student");
            System.out.println("2 Update Student");
            System.out.println("3 Delete Student");
            System.out.println("4 Select Student");
            System.out.println("5 Insert Course");
            System.out.println("6 Select Course");
            System.out.println("7 Student With Course");
            System.out.println("0 Exit");
            System.out.println("Enter choice");

            ch = sc.nextInt();

            if (ch == 1) {
                Student s = new Student();
                System.out.println("Enter Student Id");
                s.setStudent_id(sc.nextInt());
                System.out.println("Enter Name");
                s.setName(sc.next());
                System.out.println("Enter Email");
                s.setEmail(sc.next());
                System.out.println("Enter Phone");
                s.setPhone(sc.next());
                System.out.println("Enter Age");
                s.setAge(sc.nextInt());
                System.out.println("Enter Course Id");
                s.setCourse_id(sc.nextInt());
                StudentDAO.insert(s);
            }

            else if (ch == 2) {
                System.out.println("Enter Student Id");
                int id = sc.nextInt();
                System.out.println("Enter New Email");
                String email = sc.next();
                StudentDAO.update(id, email);
            }

            else if (ch == 3) {
                System.out.println("Enter Student Id");
                int id = sc.nextInt();
                StudentDAO.delete(id);
            }

            else if (ch == 4) {
                StudentDAO.select();
            }

            else if (ch == 5) {
                Course c = new Course();
                System.out.println("Enter Course Id");
                c.setCourse_id(sc.nextInt());
                System.out.println("Enter Course Name");
                c.setCourse_name(sc.next());
                System.out.println("Enter Duration");
                c.setDuration(sc.next());
                CourseDAO.insert(c);
            }

            else if (ch == 6) {
                CourseDAO.select();
            }

            else if (ch == 7) {
                StudentDAO.selectWithCourse();
            }

        } while (ch != 0);
    }
}
