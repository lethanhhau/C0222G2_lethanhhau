package com.hau.model;

import javax.persistence.*;

@Entity
public class HopDong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String maHopDong;
    private String tenNguoiThue;
    private Integer chungMinhNhanDan;
    private String ngayLamHopDong;
    private String thoiGianThue;

    @ManyToOne
    @JoinColumn(name = "id_phong", referencedColumnName = "idPhong")
    private PhongTro phongTro;

    public HopDong() {
    }

    public HopDong(Integer id, String maHopDong, String tenNguoiThue, Integer chungMinhNhanDan, String ngayLamHopDong,
                   String thoiGianThue, PhongTro phongTro) {
        this.id = id;
        this.maHopDong = maHopDong;
        this.tenNguoiThue = tenNguoiThue;
        this.chungMinhNhanDan = chungMinhNhanDan;
        this.ngayLamHopDong = ngayLamHopDong;
        this.thoiGianThue = thoiGianThue;
        this.phongTro = phongTro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getTenNguoiThue() {
        return tenNguoiThue;
    }

    public void setTenNguoiThue(String tenNguoiThue) {
        this.tenNguoiThue = tenNguoiThue;
    }

    public Integer getChungMinhNhanDan() {
        return chungMinhNhanDan;
    }

    public void setChungMinhNhanDan(Integer chungMinhNhanDan) {
        this.chungMinhNhanDan = chungMinhNhanDan;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(String thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }


    public PhongTro getPhongTro() {
        return phongTro;
    }

    public void setPhongTro(PhongTro phongTro) {
        this.phongTro = phongTro;
    }
}
