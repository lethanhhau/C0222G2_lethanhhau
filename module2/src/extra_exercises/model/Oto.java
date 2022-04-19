package extra_exercises.model;

public class Oto extends PhuongTien{
//+ Ôtô có thêm các thuộc tính : Số chỗ ngồi, kiểu xe (du lịch, xe khách).

    private Integer soChongoi;
    private String kieuXe;

    public Oto(){

    }

    public Oto(Integer soChongoi, String kieuXe) {
        this.soChongoi = soChongoi;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer soChongoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChongoi = soChongoi;
        this.kieuXe = kieuXe;
    }

    public Integer getSoChongoi() {
        return soChongoi;
    }

    public void setSoChongoi(Integer soChongoi) {
        this.soChongoi = soChongoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                super.toString() +
                "soChongoi=" + soChongoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
