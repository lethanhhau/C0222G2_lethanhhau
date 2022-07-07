package com.hau.model.contract;

import com.hau.model.customer.Customer;
import com.hau.model.employee.Employee;
import com.hau.model.facility.Facility;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractId;
    private String startDate;
    private String endDate;
    private Double deposits;
    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "facility_id",referencedColumnName = "facilityId")
    private Facility facility;

    @OneToMany(mappedBy = "contract")
    private List<ContractDetail> contractDetails;

    public Contract() {
    }

    public Contract(Integer contractId, String startDate, String endDate, Double deposits, Employee employee,
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
}
