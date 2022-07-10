package com.hau.dto.contract;

import com.hau.model.customer.Customer;
import com.hau.model.employee.Employee;
import com.hau.model.facility.Facility;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ContractDto implements Validator {

    private Integer contractId;
    @NotNull
    @NotEmpty
    @NotBlank
    private String startDate;
    @NotNull
    @NotEmpty
    @NotBlank
    private String endDate;
    private Double deposits;
    private Employee employee;
    private Customer customer;
    private Facility facility;

    public ContractDto() {
    }

    public ContractDto(Integer contractId, String startDate, String endDate, Double deposits, Employee employee,
                       Customer customer, Facility facility) {
        this.contractId = contractId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposits = deposits;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getDeposits() {
        return deposits;
    }

    public void setDeposits(Double deposits) {
        this.deposits = deposits;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ContractDto contractDto = (ContractDto) target;
    }
}
