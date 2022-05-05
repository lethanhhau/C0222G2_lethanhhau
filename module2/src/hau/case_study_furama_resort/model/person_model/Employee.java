package hau.case_study_furama_resort.model.person_model;

import java.util.Date;

public class Employee extends Person{
    private static final String COMMA = ",";
    private String employeeCode;
    private String level;
    private String location;
    private Double wage;

    public Employee(String fullName, Date date, String sex, long idNumber, long phoneNumber, String email, String employeeCode, String level, String location, double wage){
    }

    public Employee(String employeeCode, String level, String location, Double wage) {
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String fullName, String dateOfBirth, String sex, Long idNumber, Long phoneNumber, String email,
                    String employeeCode, String level, String location, Double wage) {
        super(fullName, dateOfBirth, sex, idNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee: " +
                super.toString() +
                ", employeeCode=" + employeeCode +
                ", level=" + level +
                ", location=" + location +
                ", wage=" + wage;
    }

    public String getInfoEmployee(){
        return super.getInfoPerson() + COMMA + this.getEmployeeCode() + COMMA + this.getLevel() + COMMA +
                this.getLocation() + COMMA + this.getWage();
    }
}
