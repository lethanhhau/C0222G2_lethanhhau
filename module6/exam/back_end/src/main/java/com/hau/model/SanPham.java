package com.hau.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSanPham;
    @Column(unique = true)
    private String maSanPham;
    private String tenSanPham;
    private Double donGia;
    private String tinhTrang;
    private Date ngayNhapHang;
    private String xuatXu;
    private String loaiDoUong;
    private String loaiDoAn;
    private String tenTacGia;
    private String theLoai;
    private Date ngayXuatBan;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don",referencedColumnName ="idHoaDon")
    @JsonBackReference
    private HoaDon hoaDon;

    public SanPham() {
    }

    public SanPham(Integer idSanPham, String maSanPham, String tenSanPham, Double donGia, String tinhTrang,
                   Date ngayNhapHang, String xuatXu, String loaiDoUong, String loaiDoAn, String tenTacGia, String theLoai, Date ngayXuatBan, HoaDon hoaDon) {
        this.idSanPham = idSanPham;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.tinhTrang = tinhTrang;
        this.ngayNhapHang = ngayNhapHang;
        this.xuatXu = xuatXu;
        this.loaiDoUong = loaiDoUong;
        this.loaiDoAn = loaiDoAn;
        this.tenTacGia = tenTacGia;
        this.theLoai = theLoai;
        this.ngayXuatBan = ngayXuatBan;
        this.hoaDon = hoaDon;
    }

    public Integer getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Date getNgayNhapHang() {
        return ngayNhapHang;
    }

    public void setNgayNhapHang(Date ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getLoaiDoUong() {
        return loaiDoUong;
    }

    public void setLoaiDoUong(String loaiDoUong) {
        this.loaiDoUong = loaiDoUong;
    }

    public String getLoaiDoAn() {
        return loaiDoAn;
    }

    public void setLoaiDoAn(String loaiDoAn) {
        this.loaiDoAn = loaiDoAn;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }
}
