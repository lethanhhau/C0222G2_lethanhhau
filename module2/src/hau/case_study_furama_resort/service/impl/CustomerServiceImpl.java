package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.model.person_model.Customer;
import hau.case_study_furama_resort.service.ICustomerService;
import hau.case_study_furama_resort.util.WriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private Scanner scanner = new Scanner(System.in);
    public static List<Customer> customers = new LinkedList<>();

    {
        customers.add(new Customer("le van A", "6/8/1996", "nam", 1242,
                728362, "email.com", "123", "đqư", "dn"));
        customers.add(new Customer("nguyen van B", "1/2/1990", "nam", 1864,
                942351, "email.com", "38", "hhd", "Qn"));

        WriteFile.writeCustomer(customers,false);

    }

    @Override
    public void display() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }

    }

    @Override
    public void add() {
        System.out.print("enter fullName: ");
        String fullName = scanner.nextLine();
        System.out.print("enter dateOfBirth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("enter sex: ");
        String sex = scanner.nextLine();
        System.out.print("enter idNumber: ");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("enter phoneNumber: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("enter email: ");
        String email = scanner.nextLine();
        System.out.print("enter customerCode: ");
        String customerCode = scanner.nextLine();
        System.out.print("enter typeOfGuest: ");
        String typeOfGuest = scanner.nextLine();
        System.out.print("enter address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(fullName, dateOfBirth, sex, idNumber, phoneNumber, email, customerCode, typeOfGuest, address);
        customers.add(customer);

        WriteFile.writeCustomer(customers,false);
    }


    @Override
    public void edit() {
        boolean check = false;
        System.out.print("Enter customer code edit: ");
        String customerCodeEdit = scanner.nextLine();

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerCode().equals(customerCodeEdit)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getCustomerCode().equals(customerCodeEdit)) {
                    System.out.print("enter fullName: ");
                    customers.get(i).setFullName(scanner.nextLine());
                    System.out.print("enter dateOfBirth: ");
                    customers.get(i).setDateOfBirth(scanner.nextLine());
                    System.out.print("enter sex: ");
                    customers.get(i).setSex(scanner.nextLine());
                    System.out.print("enter idNumber: ");
                    customers.get(i).setIdNumber(Integer.parseInt(scanner.nextLine()));
                    System.out.print("enter phoneNumber: ");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print("enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("enter customerCode: ");
                    String customerCode = scanner.nextLine();
                    System.out.print("enter typeOfGuest: ");
                    String typeOfGuest = scanner.nextLine();
                    System.out.print("enter address: ");
                    String address = scanner.nextLine();
                    break;
                }
            }
        } else {
            System.out.println("Employee code not found: " + customerCodeEdit);
        }
    }
}

