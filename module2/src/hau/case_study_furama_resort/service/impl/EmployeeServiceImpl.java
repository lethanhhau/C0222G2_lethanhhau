package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.model.person_model.Employee;
import hau.case_study_furama_resort.service.IEmployeeService;
import hau.case_study_furama_resort.util.ReadFile;
import hau.case_study_furama_resort.util.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private static final String FILE_EMPLOYEE = "src/hau/case_study_furama_resort/data/employee.csv";
    private static final String COMMA = ",";
    private Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee("le thanh hau", "12/8/95", "nam", 1,
                848776545, "email@.com", "gda", "đại học", "giám đốc1", 100000000d));
        employees.add(new Employee("Trần phương", "23/2/99", "nam", 2,
                847686575, "email@.com", "fsfs", "đại học", "giám đốc2", 100000000d));

       WriteFile.writeEmployee(employees,false);

    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadFile.readFileEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((i + 1) + "." + employeeList.get(i).toString());
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
        System.out.print("enter employeeCode: ");
        String employeeCode = scanner.nextLine();
        System.out.print("enter level: ");
        String level = scanner.nextLine();
        System.out.print("enter location: ");
        String location = scanner.nextLine();
        System.out.print("enter wage: ");
        double wage = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(fullName, dateOfBirth, sex, idNumber, phoneNumber, email, employeeCode, level,
                location, wage);
        employees.add(employee);

        WriteFile.writeEmployee(employees,false);


    }

    @Override
    public void edit() {
        boolean check = true;
        System.out.print("Enter employee code edit: ");
        String employeecodeEdit = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeCode().equals(employeecodeEdit)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getEmployeeCode().equals(employeecodeEdit)) {
                    System.out.print("enter fullName: ");
                    employees.get(i).setFullName(scanner.nextLine());
                    System.out.print("enter dateOfBirth: ");
                    employees.get(i).setDateOfBirth(scanner.nextLine());
                    System.out.print("enter sex: ");
                    employees.get(i).setSex(scanner.nextLine());
                    System.out.print("enter idNumber: ");
                    employees.get(i).setIdNumber(Integer.parseInt(scanner.nextLine()));
                    System.out.print("enter phoneNumber: ");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print("enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("enter employeeCode: ");
                    String employeeCode = scanner.nextLine();
                    System.out.print("enter level: ");
                    String level = scanner.nextLine();
                    System.out.print("enter location: ");
                    String location = scanner.nextLine();
                    System.out.print("enter wage: ");
                    double wage = Double.parseDouble(scanner.nextLine());
                    break;
                }
            }
        } else {
            System.out.println("Employee code not found: " + employeecodeEdit);
        }
    }
}

