package le_thanh_hau.comparable_and_comparator.case_study_furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.print(" 1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n" +
                    "Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
            }
        }
    }
}
