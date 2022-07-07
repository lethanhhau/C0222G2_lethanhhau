package com.hau.dto.emplooyee;

import com.hau.model.employee.Division;
import com.hau.model.employee.EducationDegree;
import com.hau.model.employee.Position;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class EmployeeDto implements Validator {
    private Integer employeeId;
    @NotNull
    @NotEmpty
    @NotBlank
    private String employeeName;
    @NotNull
    @NotEmpty
    @NotBlank
    private String employeeBirthday;
    @NotNull @NotNull
    @NotEmpty
    @NotBlank private String employeeIdCard;
    @NotNull
    private Double employeeSalary;
    @NotNull
    @NotEmpty
    @NotBlank
    private String employeePhone;
    @NotNull
    @NotEmpty
    @NotBlank
    private String employeeEmail;
    @NotNull
    @NotEmpty
    @NotBlank
    private String employeeAddress;
    @NotNull
    private Position position;
    @NotNull
    private EducationDegree educationDegree;
    @NotNull
    private Division division;
    @NotNull
    @NotEmpty
    @NotBlank
    private String username;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer employeeId, String employeeName, String employeeBirthday, String employeeIdCard, Double employeeSalary, String employeePhone, String employeeEmail,
                       String employeeAddress, Position position, EducationDegree educationDegree, Division division, String username) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.username = username;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        EmployeeDto employeeDto = (EmployeeDto)target;
    }
}
