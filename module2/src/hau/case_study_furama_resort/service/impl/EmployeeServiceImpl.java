package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.exception.CheckException;
import hau.case_study_furama_resort.common.validate.Validate;
import hau.case_study_furama_resort.model.person_model.Employee;
import hau.case_study_furama_resort.service.IEmployeeService;
import hau.case_study_furama_resort.common.write_read_file.WriteReadFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    static {
            Date date1 = null;
            Date date2 = null;
            try {
                date1 = simpleDateFormat.parse("12/8/1995");
                date2 = simpleDateFormat.parse("23/2/1999");
            } catch (ParseException e) {
                e.printStackTrace();
            }

        employeeList.add(new Employee("trần văn A", date1, "nam", 1l,
                848776545l, "email@.com", "FLI296", "đại học", "trưởng phòng", 1000d));
        employeeList.add(new Employee("Nguyễn văn H", date2, "nam", 2l,
                847686575l, "email@.com", "GDA146", "cao đẳng", "giám đốc2", 10000d));

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
        employeeList = WriteReadFile.readFileEmployee();
        System.out.print("enter fullName: ");
        String fullName = scanner.nextLine();
        while (!Validate.isName(fullName)) {
            System.err.println("fullName malformed!");
            System.out.println();
            System.out.print("retype fullName: ");
            fullName = scanner.nextLine();
        }

        System.out.print("enter date Of Birth: ");
        Date date = null;
        date = CheckException.checkDayofbirth(date);

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

        Employee employee = new Employee(fullName, date, sex, idNumber, phoneNumber, email, employeeCode, level,
                location, wage);
        employeeList.add(employee);

        WriteReadFile.writeEmployee(employeeList,false);


    }

    @Override
    public void edit() {
        boolean check = false;
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
                    System.out.print("Enter End Day: ");
                    String endDayStr = scanner.nextLine();
                    Date dateOfBirth = null;
                    try {
                        dateOfBirth = simpleDateFormat.parse(endDayStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    EmployeeServiceImpl.employeeList.get(i).setDateOfBirth(dateOfBirth);
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

