package com.hau.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class ViTri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idViTri;
    private String tenViTri;

    @OneToMany(mappedBy = "viTri")
    @JsonBackReference
    private List<NhanVien> nhanViens;

    public ViTri() {
    }

    public ViTri(Integer id, String tenViTri, List<NhanVien> nhanViens) {
        this.idViTri = id;
        this.tenViTri = tenViTri;
        this.nhanViens = nhanViens;
    }

    public Integer getId() {
        return idViTri;
    }

    public void setId(Integer id) {
        this.idViTri = id;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public List<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }
}
