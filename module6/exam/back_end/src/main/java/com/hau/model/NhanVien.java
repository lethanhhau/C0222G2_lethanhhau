package com.hau.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNhanVien;
    private String maNhanVien;
    private String tenNhanVien;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "id_vi_tri", referencedColumnName = "idViTri")
    private ViTri viTri;

    public NhanVien() {
    }

    public NhanVien(Integer id, String maNhanVien, String tenNhanVien, ViTri viTri) {
        this.idNhanVien = id;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.viTri = viTri;
    }

    public Integer getId() {
        return idNhanVien;
    }

    public void setId(Integer id) {
        this.idNhanVien = id;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }
}
