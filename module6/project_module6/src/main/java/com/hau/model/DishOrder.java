package com.hau.model;

import javax.persistence.*;

@Entity
public class DishOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Bill bill;


    public DishOrder() {
    }

    public DishOrder(Integer id, Bill bill) {
        this.id = id;
        this.bill = bill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}


