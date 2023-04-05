package com.hau.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;

    @Column(columnDefinition = "Date")
    private String creationDate;

    @Column(columnDefinition = "Bit(1) default 0")
    private Integer isDeleted;

    @OneToMany(mappedBy = "bill")
    private List<DishOrder> dishOrders;

    public Bill() {
    }

    public Bill(Integer id, String code, String creationDate, Integer isDeleted, List<DishOrder> dishOrders) {
        this.id = id;
        this.code = code;
        this.creationDate = creationDate;
        this.isDeleted = isDeleted;
        this.dishOrders = dishOrders;
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<DishOrder> getDishOrders() {
        return dishOrders;
    }

    public void setDishOrders(List<DishOrder> dishOrders) {
        this.dishOrders = dishOrders;
    }
}
