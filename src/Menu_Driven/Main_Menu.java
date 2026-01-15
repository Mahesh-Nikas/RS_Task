package Menu_Driven;

import java.util.Scanner;

public class Main_Menu {
    public static void main(String[] arg){
        for(int i=0; i>=0;i++) {
            System.out.println(".... MENU ........");
            System.out.println("Choose option 1: insert in students , 2: update in students , 3:Delete Students , 4: select students , 5: exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    Query.insert();
                    break;
                case 2:
                    Query.update();
                    break;
                case 3:
                    Query.delete();
                    break;
                case 4:
                    Query.select();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
