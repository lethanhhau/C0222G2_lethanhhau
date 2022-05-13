package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.exception.CheckException;
import hau.case_study_furama_resort.common.validate.Validate;
import hau.case_study_furama_resort.model.person_model.Customer;
import hau.case_study_furama_resort.service.ICustomerService;
import hau.case_study_furama_resort.common.write_read_file.WriteReadFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CustomerServiceImpl implements ICustomerService {
    private Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = new ArrayList<>();
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    static {
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = simpleDateFormat.parse("6/8/1996");
            date2 = simpleDateFormat.parse("1/2/1996");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Customer customer = new Customer("le van A",date1 , "nam", 1l,
                728362l, "email.com", "123", "A12d", "dn");
        customerList.add(customer);
        customerList.add(new Customer("nguyen van B", date2, "nam", 2l,
                942351l, "email.com", "38", "B23f", "Qn"));
        WriteReadFile.writeCustomer(customerList, false);

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
        customerList = WriteReadFile.readFileCustomer();
        System.out.print("enter full Name: ");
        String fullName = scanner.nextLine();
        while (!Validate.isName(fullName)) {
            System.err.println("full Name malformed!");
            System.out.println();
            System.out.print("retype fullName: ");
            fullName = scanner.nextLine();
        }

        System.out.print("enter date Of Birth: ");
        Date date = null;
        date = CheckException.checkDayofbirth(date);

        System.out.print("enter sex: ");
        String sex = scanner.nextLine();

        System.out.print("enter id Number: ");
        long idNumber = 0;
        idNumber = CheckException.checkLong(idNumber);

        System.out.print("enter phone Number: ");
        long phoneNumber = 0;
        phoneNumber = CheckException.checkLong(phoneNumber);
        while (!Validate.isPhone(String.valueOf(phoneNumber))) {
            System.err.println("email malformed!");
            System.out.println();
            System.out.print("retype email: ");
            phoneNumber = CheckException.checkLong(phoneNumber);
        }

        System.out.print("enter email: ");
        String email = scanner.nextLine();

        System.out.print("enter customer Code: ");
        String customerCode = scanner.nextLine();

        System.out.print("enter type Of Guest: ");
        String typeOfGuest = scanner.nextLine();

        System.out.print("enter address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(fullName, date, sex, idNumber, phoneNumber, email, customerCode, typeOfGuest, address);
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
                    CustomerServiceImpl.customerList.get(i).setFullName(scanner.nextLine());
                    System.out.print("enter dateOfBirth: ");
                    System.out.print("Enter End Day: ");
                    String endDayStr = scanner.nextLine();
                    Date dateOfBirth = null;
                    try {
                        dateOfBirth = simpleDateFormat.parse(endDayStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    CustomerServiceImpl.customerList.get(i).setDateOfBirth(dateOfBirth);
                    System.out.print("enter sex: ");
                    CustomerServiceImpl.customerList.get(i).setSex(scanner.nextLine());
                    System.out.print("enter idNumber: ");
                    CustomerServiceImpl.customerList.get(i).setIdNumber(Long.parseLong(scanner.nextLine()));
                    System.out.print("enter phoneNumber: ");
                    CustomerServiceImpl.customerList.get(i).setPhoneNumber(Long.parseLong(scanner.nextLine()));
                    System.out.print("enter email: ");
                    CustomerServiceImpl.customerList.get(i).setEmail(scanner.nextLine());
                    System.out.print("enter customerCode: ");
                    CustomerServiceImpl.customerList.get(i).setCustomerCode(scanner.nextLine());
                    System.out.print("enter typeOfGuest: ");
                    CustomerServiceImpl.customerList.get(i).setTypeOfGuest(scanner.nextLine());
                    System.out.print("enter address: ");
                    CustomerServiceImpl.customerList.get(i).setAddress(scanner.nextLine());
                    break;
                }
            }
            WriteReadFile.writeCustomer(customerList,false);
        } else {
            System.out.println("Employee code not found: " + customerCodeEdit);
        }
    }
}

