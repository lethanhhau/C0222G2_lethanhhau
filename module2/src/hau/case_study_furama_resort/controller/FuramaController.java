package hau.case_study_furama_resort.controller;

import hau.case_study_furama_resort.service.ICustomerService;
import hau.case_study_furama_resort.service.IEmployeeService;
import hau.case_study_furama_resort.service.IFacilityService;
import hau.case_study_furama_resort.service.impl.CustomerServiceImpl;
import hau.case_study_furama_resort.service.impl.EmployeeServiceImpl;
import hau.case_study_furama_resort.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeService iEmployeeService = new EmployeeServiceImpl();
    private static ICustomerService iCustomerService = new CustomerServiceImpl();
    private static IFacilityService iFacilityService = new FacilityServiceImpl();

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
                    choiceEmployees();
                    break;
                case 2:
                    choiceCustomer();
                    break;
                case 3:
                    choiceFacility();
                    break;
                case 4:
                    choiceBooking();
                    break;
                case 5:
                    choicePromotion();
                    break;
                case 6:
                    check = false;
                    break;
                default:
                    System.out.println("chon lai di thang ngu lam deo gi co so " + choice);
            }
        }
    }

    public void choiceEmployees() {
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

    public void choiceCustomer() {
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
    public void choiceFacility(){
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
                    iFacilityService.display();
                    break;
                case 2:
                    choiceFacilityServiceImpl();
                    break;
                case 3:

                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }

    public void choiceFacilityServiceImpl(){
        boolean check = true;
        while (check){
            System.out.print(
                    "1.	Add New Villa \n" +
                            "2.	Add New House \n" +
                            "3.	Add New Room \n" +
                            "4.	Back to menu \n" +
                            "Enter Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iFacilityService.addHouse();
                    break;
                case 2:
                    iFacilityService.addRoom();
                    break;
                case 3:
                    iFacilityService.addVila();
                case 4:
                    check = false;
                    break;
            }
        }
    }
    public void choiceBooking(){
        boolean check = true;
        while (check){
            System.out.print(" 1.Add new booking \n" +
                    "2.Display list booking \n" +
                    "3.Create new constracts \n" +
                    "4.Display list contracts \n" +
                    "5.Edit contracts \n" +
                    "6.Return main menu \n"+
                    "Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    check = false;
                    break;
            }
        }
    }
    public void choicePromotion(){
        boolean check = true;
        while (check){
            System.out.print("1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu \n" +
                    "Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                case 2:
                case 3:
                    check = false;
                    break;
            }
        }
    }
}
