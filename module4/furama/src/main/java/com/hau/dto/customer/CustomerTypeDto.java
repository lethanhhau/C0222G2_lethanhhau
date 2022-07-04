package com.hau.dto.customer;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerTypeDto implements Validator {

    @NotNull
    @NotEmpty
    @NotBlank
    @Pattern(regexp = "^[A-Z][a-z0-9]+||([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+)$")
    private String customerTypeName;

    public CustomerTypeDto() {
    }

    public CustomerTypeDto(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerTypeDto customerTypeDto = (CustomerTypeDto) target;
    }
}
