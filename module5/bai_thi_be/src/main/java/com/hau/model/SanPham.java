package com.hau.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tenSanPham;
    private String xuatXu;
    private Integer giaTien;
    private String donVi;

    @OneToMany(mappedBy = "sanPham")
    @JsonBackReference
    private List<LoHang> loHangs;

    public SanPham() {
    }

    public SanPham(Integer id, String tenSanPham, String xuatXu, Integer giaTien, String donVi, List<LoHang> loHangs) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.xuatXu = xuatXu;
        this.giaTien = giaTien;
        this.donVi = donVi;
        this.loHangs = loHangs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public Integer getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Integer giaTien) {
        this.giaTien = giaTien;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public List<LoHang> getLoHangs() {
        return loHangs;
    }

    public void setLoHangs(List<LoHang> loHangs) {
        this.loHangs = loHangs;
    }
}

