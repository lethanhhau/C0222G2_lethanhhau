package com.hau.model;

import javax.persistence.*;

@Entity
public class Consignment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String code;

        @ManyToOne
        @JoinColumn(name = "product_id", referencedColumnName = "id")
        private Product product;

        private Integer amount;

        @Column(columnDefinition = "Date")
        private String importDate;

        @Column(columnDefinition = "Date")
        private String dateOfManufacture;

        @Column(columnDefinition = "Date")
        private String expirationDate;

    public Consignment() {
    }

    public Consignment(Integer id, String code, Product product, Integer amount, String importDate, String dateOfManufacture, String expirationDate) {
        this.id = id;
        this.code = code;
        this.product = product;
        this.amount = amount;
        this.importDate = importDate;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
