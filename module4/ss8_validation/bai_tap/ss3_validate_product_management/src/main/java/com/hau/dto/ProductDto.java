package com.hau.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class ProductDto implements Validator {

    @PositiveOrZero
    private Integer id;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 50)
    @Pattern(regexp = "^[A-Z][a-z0-9]+||([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+)$", message = "name product invalid!")
    private String nameProduct;

    @NotNull
    @PositiveOrZero( message = "price invalid")
    private Double priceProduct;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 255)
    @Pattern(regexp = "^[A-Z][a-z0-9]+||([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+)$", message = "Describe product invalid!")
    private String describeProduct;

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 500)
    @Pattern(regexp = "^[A-Z][a-z0-9]+||([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+)$", message = "Producer product invalid!")
    private String producerProduct;

    public ProductDto() {
    }

    public ProductDto(Integer id, String nameProduct, Double priceProduct, String describeProduct, String producerProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.describeProduct = describeProduct;
        this.producerProduct = producerProduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    public String getProducerProduct() {
        return producerProduct;
    }

    public void setProducerProduct(String producerProduct) {
        this.producerProduct = producerProduct;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductDto productDto = (ProductDto)target;
    }
}
