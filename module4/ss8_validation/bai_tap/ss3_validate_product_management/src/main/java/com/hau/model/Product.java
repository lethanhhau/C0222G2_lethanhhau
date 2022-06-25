package com.hau.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_product")
    private String nameProduct;

    @Column(name = "price_product")
    private Double priceProduct;

    @Column(name = "describe_product")
    private String describeProduct;

    @Column(name = "producer_product")
    private String producerProduct;

    public Product() {
    }

    public Product(Integer id, String nameProduct, Double priceProduct, String describeProduct, String producerProduct) {
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
}
