package com.hau.exam_module_5.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class ConsignmentDto {

    private Integer id;

    @NotBlank
    @Pattern(regexp = "^(LH-)[0-9]{4}$")
    private String code;

    @NotBlank
    @Pattern(regexp = "^(([1-9]+)|([1-9][0-9]+))$")
    private Integer quantity;

    private Date dateIn;

    private Date dateCheckIn;

    private Date dateCheckOut;

    public ConsignmentDto() {
    }

    public ConsignmentDto(Integer id, String code, Integer quantity, Date dateIn, Date dateCheckIn, Date dateCheckOut) {
        this.id = id;
        this.code = code;
        this.quantity = quantity;
        this.dateIn = dateIn;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateCheckIn() {
        return dateCheckIn;
    }

    public void setDateCheckIn(Date dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public Date getDateCheckOut() {
        return dateCheckOut;
    }

    public void setDateCheckOut(Date dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }
}
