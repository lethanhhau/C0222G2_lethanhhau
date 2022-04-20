package hau.quan_ly_phuong_tien.model;

import hau.quan_ly_phuong_tien.model.PhuongTien;

public class XeMay extends PhuongTien {
    //+ Xe máy có thêm thuộc tính: Công suất.

    private Integer congSuat;

    public XeMay(){

    }

    public XeMay(Integer congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public Integer getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Integer congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay: " +
                super.toString()+
                ", congSuat= " + congSuat;
    }
}
