package com.hau.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHoaDon;
    private String maDichVu;
    private Integer soLuong;
    private Date ngayDatDichVu;

    @OneToMany(mappedBy = "hoaDon")
    @JsonIgnore
    private List<SanPham> sanPhams;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang", referencedColumnName = "idKhachHang")
    private KhachHang khachHang;

    public HoaDon() {
    }

    public HoaDon(Integer idHoaDon, String maDichVu, Integer soLuong, Date ngayDatDichVu, List<SanPham> sanPhams, KhachHang khachHang) {
        this.idHoaDon = idHoaDon;
        this.maDichVu = maDichVu;
        this.soLuong = soLuong;
        this.ngayDatDichVu = ngayDatDichVu;
        this.sanPhams = sanPhams;
        this.khachHang = khachHang;
    }

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayDatDichVu() {
        return ngayDatDichVu;
    }

    public void setNgayDatDichVu(Date ngayDatDichVu) {
        this.ngayDatDichVu = ngayDatDichVu;
    }

    public List<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(List<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}
