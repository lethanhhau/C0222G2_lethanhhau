package com.hau.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class PhongTro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPhong;
    private String maPhong;
    private Double dienTichPhong;
    private Integer giaThue;
    private String tinhTrang;

    @OneToMany(mappedBy = "phongTro")
    private List<HopDong> hopDongList;

    public PhongTro() {
    }

    public PhongTro(Integer idPhong, String maPhong, Double dienTichPhong, Integer giaThue, String tinhTrang,
                    List<HopDong> hopDongList) {
        this.idPhong = idPhong;
        this.maPhong = maPhong;
        this.dienTichPhong = dienTichPhong;
        this.giaThue = giaThue;
        this.tinhTrang = tinhTrang;
        this.hopDongList = hopDongList;
    }

    public Integer getIdPhong() {
        return idPhong;
    }

    public void setId(Integer idPhong) {
        this.idPhong = idPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public Double getDienTichPhong() {
        return dienTichPhong;
    }

    public void setDienTichPhong(Double dienTichPhong) {
        this.dienTichPhong = dienTichPhong;
    }

    public Integer getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(Integer giaThue) {
        this.giaThue = giaThue;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }
}
