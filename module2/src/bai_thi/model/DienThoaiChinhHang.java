package bai_thi.model;

public class DienThoaiChinhHang extends DienThoai{
    private static final String COMMA = ",";
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(String id, String tenDienThoai, Double giaBan, Long soLuong, String nhaSanXuat,
                              String thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang: " +
                super.toString() +
                "thoiGianBaoHanh= " + thoiGianBaoHanh +
                ", phamViBaoHanh= " + phamViBaoHanh;
    }
    public String getInfoDienThoaiChinhHang(){
        return super.getInfoDienThoai() + COMMA + this.getThoiGianBaoHanh() + COMMA + this.getPhamViBaoHanh();
    }
}
