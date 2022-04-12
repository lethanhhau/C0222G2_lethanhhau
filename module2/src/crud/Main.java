package crud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        boolean flag = true;
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.print("Your choice: ");
            choice = (Integer.parseInt((new Scanner(System.in)).nextLine()));
            switch (choice) {
                case 1:
                    studentManager.add();
                    break;
                case 2:
                    studentManager.display();
                    break;
                case 3:
                    studentManager.edit();
                    break;
                case 4:
                    studentManager.delete();
                    break;
                case 5:
                    studentManager.search();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        while (flag);
    }
    }

