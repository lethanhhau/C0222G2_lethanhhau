package com.hau.dto.customer;

import com.hau.model.customer.CustomerType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerDto implements Validator {

    private Integer customerId;

    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "^(KH)-[0-9]{4}$")
    private String customerCode;
    private CustomerType customerType;

    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "^[A-Z][a-z0-9]+||([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+)$")
    private String customerName;
    @NotNull
    private String customerBirthday;
    private String customerGender;
    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "^([0-9]{9})||([0-9]{12})$")
    private String customerIdCard;
    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "^((09)|(\\(84\\)\\+9))[0-1][0-9]{7}$", message = "Phone number must have 9 digits and start with 0 or 84!")
    private String customerPhone;
    @NotNull
    @NotEmpty
    @NotBlank
    private String customerEmail;
    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "^[A-Z][a-z0-9]+||([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+)$")
    private String customerAddress;

    public CustomerDto() {
    }

    public CustomerDto(Integer customerId,String customerCode, CustomerType customerType, String customerName, String customerBirthday,
                       String customerGender, String customerIdCard, String customerPhone, String customerEmail,
                       String customerAddress) {
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerDto customerDto = (CustomerDto) target;
    }
}
