package extra_exercises.controller;

import extra_exercises.service.TransportManager;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
            TransportManager transportManager = new TransportManager();
            Scanner sc = new Scanner(System.in);
            int choice;
            boolean check = true;
            do {
                System.out.print("Menu Transport" + "\n" +
                        "1.Add Vehicle" + "\n" +
                        "2.Display Vehicle" + "\n" +
                        "3.Delete Vehicle" + "\n" +
                        "4.Search Vehicle" + "\n" +
                        "5.Exit" + "\n" +
                        "Enter the choise: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        transportManager.add();
                    case 2:
                        transportManager.display();
                    case 3:
                        transportManager.delete();
                    case 4:
                        transportManager.search();
                    case 5:
                        check = false;
                        break;
                    default:
                        check = false;
                        break;
                }
            } while (check);
        }
}

