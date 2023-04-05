package com.hau.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idKhachHang;
    private String tenKhachHang;

    @OneToMany(mappedBy = "khachHang")
    @JsonBackReference
    private List<HoaDon> hoaDons;

    public KhachHang() {
    }

    public KhachHang(Integer id, String tenKhachHang, List<HoaDon> hoaDons) {
        this.idKhachHang = id;
        this.tenKhachHang = tenKhachHang;
        this.hoaDons = hoaDons;
    }

    public Integer getId() {
        return idKhachHang;
    }

    public void setId(Integer id) {
        this.idKhachHang = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public List<HoaDon> getOrders() {
        return hoaDons;
    }

    public void setOrders(List<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }
}
