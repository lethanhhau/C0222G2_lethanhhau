package com.hau.model;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_email")
    private String productEmail;
    @Column(name = "product_address")
    private String productAddress;

    public Customer() {
    }

    public Customer(String productName, String productEmail, String productAddress) {
        this.productName = productName;
        this.productEmail = productEmail;
        this.productAddress = productAddress;
    }

    public Customer(int id, String productName, String email, String address) {
        this.id = id;
        this.productName = productName;
        this.productEmail = productEmail;
        this.productAddress = productAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductEmail() {
        return productEmail;
    }

    public void setProductEmail(String productEmail) {
        this.productEmail = productEmail;
    }

    public String getProductAddress() {
        return productAddress;
    }

    public void setProductAddress(String productAddress) {
        this.productAddress = productAddress;
    }
}
