package com.hau.exam_module_5.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String origin;
    private Integer price;
    private String unit;

    @OneToMany(mappedBy = "product")
    @JsonBackReference
    private List<Consignment> consignmentList;

    public Product() {
    }

    public Product(Integer id, String name, String origin, Integer price, String unit, List<Consignment> consignmentList) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.unit = unit;
        this.consignmentList = consignmentList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Consignment> getConsignmentList() {
        return consignmentList;
    }

    public void setConsignmentList(List<Consignment> consignmentList) {
        this.consignmentList = consignmentList;
    }
}
