package com.hau.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String maLoHang;

    @ManyToOne
    @JoinColumn(name = "san_pham_id", referencedColumnName = "id")
    private SanPham sanPham;

    private Integer soLuong;

    @Column(columnDefinition = "Date")
    private String ngayNhapHang;

    @Column(columnDefinition = "Date")
    private String ngaySanXuat;

    @Column(columnDefinition = "Date")
    private String ngayHetHan;

    public LoHang() {
    }

    public LoHang(Integer id, String maLoHang, SanPham sanPham, Integer soLuong, String ngayNhapHang, String ngaySanXuat, String ngayHetHan) {
        this.id = id;
        this.maLoHang = maLoHang;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.ngayNhapHang = ngayNhapHang;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaLoHang() {
        return maLoHang;
    }

    public void setMaLoHang(String maLoHang) {
        this.maLoHang = maLoHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhapHang() {
        return ngayNhapHang;
    }

    public void setNgayNhapHang(String ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
}
