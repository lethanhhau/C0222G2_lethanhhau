package com.hau.dto;



import com.hau.model.PhongTro;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class HopDongDto implements Validator {


    @NotBlank
    @Pattern(regexp = "^(HD)-[0-9]{4}$")
    private String maHopDong;
    @NotNull
    @NotBlank
    private String tenNguoiThue;
    @NotNull
    private Integer chungMinhNhanDan;
    @NotNull
    private String ngayLamHopDong;
    @NotNull
    private String thoiGianThue;
    @NotNull
    private PhongTro phongTro;


    public HopDongDto() {
    }

    public HopDongDto(String maHopDong, String tenNguoiThue, Integer chungMinhNhanDan, String ngayLamHopDong,
                      String thoiGianThue, Double tongTien, PhongTro phongTro) {
        this.maHopDong = maHopDong;
        this.tenNguoiThue = tenNguoiThue;
        this.chungMinhNhanDan = chungMinhNhanDan;
        this.ngayLamHopDong = ngayLamHopDong;
        this.thoiGianThue = thoiGianThue;
        this.phongTro = phongTro;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
            HopDongDto hopDongDto = (HopDongDto) target;
    }
}
