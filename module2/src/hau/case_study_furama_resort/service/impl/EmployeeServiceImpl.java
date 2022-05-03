package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.exception.CheckException;
import hau.case_study_furama_resort.model.person_model.Employee;
import hau.case_study_furama_resort.service.IEmployeeService;
import hau.case_study_furama_resort.common.write_read_file.WriteReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee("le thanh hau", "12/8/95", "nam", 1l,
                848776545l, "email@.com", "gda", "đại học", "giám đốc1", 100000000d));
        employeeList.add(new Employee("Trần phương", "23/2/99", "nam", 2l,
                847686575l, "email@.com", "fsfs", "đại học", "giám đốc2", 100000000d));

       WriteReadFile.writeEmployee(employeeList,false);

    }

    @Override
    public void display() {
        employeeList = WriteReadFile.readFileEmployee();
        for (Employee employee:employeeList) {
            System.out.println(employee);
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
        System.out.print("enter employeeCode: ");
        String employeeCode = scanner.nextLine();
        System.out.print("enter level: ");
        String level = scanner.nextLine();
        System.out.print("enter location: ");
        String location = scanner.nextLine();
        System.out.print("enter wage: ");
        double wage = 0.0;
        wage = CheckException.checkDouble(wage);

        Employee employee = new Employee(fullName, dateOfBirth, sex, idNumber, phoneNumber, email, employeeCode, level,
                location, wage);
        employeeList.add(employee);

        WriteReadFile.writeEmployee(employeeList,false);


    }

    @Override
    public void edit() {
        boolean check = true;
        employeeList = WriteReadFile.readFileEmployee();
        System.out.print("Enter employee code edit: ");
        String employeecodeEdit = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode().equals(employeecodeEdit)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < employeeList.size(); i++) {
                if (EmployeeServiceImpl.employeeList.get(i).getEmployeeCode().equals(employeecodeEdit)) {
                    System.out.print("enter fullName: ");
                    EmployeeServiceImpl.employeeList.get(i).setFullName(scanner.nextLine());
                    System.out.print("enter dateOfBirth: ");
                    EmployeeServiceImpl.employeeList.get(i).setDateOfBirth(scanner.nextLine());
                    System.out.print("enter sex: ");
                    EmployeeServiceImpl.employeeList.get(i).setSex(scanner.nextLine());
                    System.out.print("enter idNumber: ");
                    EmployeeServiceImpl.employeeList.get(i).setIdNumber(Long.parseLong(scanner.nextLine()));
                    System.out.print("enter phoneNumber: ");
                    EmployeeServiceImpl.employeeList.get(i).setPhoneNumber(Long.parseLong(scanner.nextLine()));
                    System.out.print("enter email: ");
                    EmployeeServiceImpl.employeeList.get(i).setEmail(scanner.nextLine());
                    System.out.print("enter employeeCode: ");
                    EmployeeServiceImpl.employeeList.get(i).setEmployeeCode(scanner.nextLine());
                    System.out.print("enter level: ");
                    EmployeeServiceImpl.employeeList.get(i).setLevel(scanner.nextLine());
                    System.out.print("enter location: ");
                    EmployeeServiceImpl.employeeList.get(i).setLocation(scanner.nextLine());
                    System.out.print("enter wage: ");
                    EmployeeServiceImpl.employeeList.get(i).setWage(Double.parseDouble(scanner.nextLine()));
                    break;
                }
            }
            WriteReadFile.writeEmployee(employeeList,false);
        } else {
            System.out.println("Employee code not found: " + employeecodeEdit);
        }
    }
}

