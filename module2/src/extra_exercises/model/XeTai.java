package extra_exercises.model;

public class XeTai extends PhuongTien{
    //+ Xe tải  có thêm thuộc tính: Trọng tải.

    private Double trongTai;

    public XeTai(){

    }

    public XeTai(Double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Double trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public Double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(Double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                super.toString() +
                "trongTai=" + trongTai +
                '}';
    }
}
