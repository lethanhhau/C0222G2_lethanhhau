package hau.case_study_furama_resort.controller;

import hau.case_study_furama_resort.service.ICustomerService;
import hau.case_study_furama_resort.service.IEmployeeService;
import hau.case_study_furama_resort.service.impl.CustomerServiceImpl;
import hau.case_study_furama_resort.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeService iEmployeeService = new EmployeeServiceImpl();
    private static ICustomerService iCustomerService = new CustomerServiceImpl();

    public void displayMainMenu() {
        boolean check = true;
        while (check) {
            Scanner sc = new Scanner(System.in);
            System.out.print(
                    "---Resort Management Application Furama-- \n" +
                            "1.Employee Management \n" +
                            "2.Customer Management\n" +
                            "3.Facility Management \n" +
                            "4.Booking Management \n" +
                            "5.Promotion Management \n" +
                            "6.Exit \n" +
                            "enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    enterSelectionEmployees();
                    break;
                case 2:
                    enterSelectionCustomer();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    check = false;
                    break;
                default:
                    System.out.println("chon lai di thang ngu lam deo gi co so " + choice);
            }
        }
    }

    public void enterSelectionEmployees() {
        boolean check = true;
        while (check) {
            System.out.print(
                    "1	Display list employees \n" +
                            "2	Add new employee \n" +
                            "3	Edit employee \n" +
                            "4	Return main menu \n" +
                            "Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    iEmployeeService.edit();
                    break;
                case 4:
                    check = false;
                    break;
                default:
            }
        }
    }

    public void enterSelectionCustomer() {
        boolean check = true;
        while (check) {
            System.out.print(
                    "1.Display list customers\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu\n" +
                            "Enter choi: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    iCustomerService.edit();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }

    }
    public void enterSelectionFacility(){
        boolean check = true;
        while (check) {
            System.out.print(
                    "1.Display list facility\n" +
                            "2.Add new facility\n" +
                            "3.Display list facility maintenance\n" +
                            "4.Return main menu\n" +
                            "Enter choi: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    check = false;
                    break;
            }
        }

    }
}
