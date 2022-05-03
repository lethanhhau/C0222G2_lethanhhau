package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.exception.CheckException;
import hau.case_study_furama_resort.model.person_model.Customer;
import hau.case_study_furama_resort.service.ICustomerService;
import hau.case_study_furama_resort.common.write_read_file.WriteReadFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = new LinkedList<>();

    {
        customerList.add(new Customer("le van A", "6/8/1996", "nam", 1242l,
                728362l, "email.com", "123", "đqư", "dn"));
        customerList.add(new Customer("nguyen van B", "1/2/1990", "nam", 1864l,
                942351l, "email.com", "38", "hhd", "Qn"));

        WriteReadFile.writeCustomer(customerList,false);

    }

    @Override
    public void display() {
        customerList = WriteReadFile.readFileCustomer();
        for (Customer customer:customerList) {
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
        long idNumber = 0;
        idNumber = CheckException.checkLong(idNumber);
        System.out.print("enter phoneNumber: ");
        long phoneNumber = 0;
        phoneNumber = CheckException.checkLong(phoneNumber);
        System.out.print("enter email: ");
        String email = scanner.nextLine();
        System.out.print("enter customerCode: ");
        String customerCode = scanner.nextLine();
        System.out.print("enter typeOfGuest: ");
        String typeOfGuest = scanner.nextLine();
        System.out.print("enter address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(fullName, dateOfBirth, sex, idNumber, phoneNumber, email, customerCode, typeOfGuest, address);
        customerList.add(customer);

        WriteReadFile.writeCustomer(customerList,false);
    }


    @Override
    public void edit() {
        boolean check = false;
        customerList = WriteReadFile.readFileCustomer();
        System.out.print("Enter customer code edit: ");
        String customerCodeEdit = scanner.nextLine();

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerCode().equals(customerCodeEdit)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCustomerCode().equals(customerCodeEdit)) {
                    System.out.print("enter fullName: ");
                    customerList.get(i).setFullName(scanner.nextLine());
                    System.out.print("enter dateOfBirth: ");
                    customerList.get(i).setDateOfBirth(scanner.nextLine());
                    System.out.print("enter sex: ");
                    customerList.get(i).setSex(scanner.nextLine());
                    System.out.print("enter idNumber: ");
                    customerList.get(i).setIdNumber(Long.parseLong(scanner.nextLine()));
                    System.out.print("enter phoneNumber: ");
                    customerList.get(i).setPhoneNumber(Long.parseLong(scanner.nextLine()));
                    System.out.print("enter email: ");
                    customerList.get(i).setEmail(scanner.nextLine());
                    System.out.print("enter customerCode: ");
                    customerList.get(i).setCustomerCode(scanner.nextLine());
                    System.out.print("enter typeOfGuest: ");
                    customerList.get(i).setTypeOfGuest(scanner.nextLine());
                    System.out.print("enter address: ");
                    customerList.get(i).setAddress(scanner.nextLine());
                    break;
                }
            }
            WriteReadFile.writeCustomer(customerList,false);
        } else {
            System.out.println("Employee code not found: " + customerCodeEdit);
        }
    }
}

