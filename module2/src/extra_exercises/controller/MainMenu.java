package extra_exercises.controller;

import extra_exercises.model.TransportManager;
import extra_exercises.service.Transport;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();

        int choice;
        int choices;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.add vehicle");
        System.out.println("2.display vehicle");
        System.out.println("3.delete vehicle");
        System.out.println("4.search vehicle");
        System.out.println("5.Exit");
        System.out.print("Enter choice: ");
        choice = Integer.parseInt(sc.nextLine());

        switch (choice){
            case 1:
                System.out.println("1.add Truck");
                System.out.println("2.add Car");
                System.out.println("3.add Motorcycle");
                System.out.println("4.Exit");

                System.out.print("Enter choices: ");
                choices = Integer.parseInt(sc.nextLine());
                switch (choices){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        transportManager.addMotorcycle(sc);
                        break;
                    case 4:

                }
            case 2:
                System.out.println("1.display Truck");
                System.out.println("2.display Car");
                System.out.println("3.display Motorcycle");
                System.out.print("Enter choices: ");
                choices = Integer.parseInt(sc.nextLine());

            case 3:

            case 4:

            case 5:
        }
    }
}
