package bai_thi.model;

public abstract class DienThoai {
    private static final String COMMA = ",";
    private String id;
    private String tenDienThoai;
    private Double giaBan;
    private Long soLuong;
    private String nhaSanXuat;

    public DienThoai() {
    }

    public DienThoai(String id, String tenDienThoai, Double giaBan, Long soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Long soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "DienThoai: " +
                "id= " + id +
                ", tenDienThoai= " + tenDienThoai +
                ", giaBan= " + giaBan +
                ", soLuong= " + soLuong +
                ", nhaSanXuat= " + nhaSanXuat;
    }

    public String getInfoDienThoai(){
        return this.getId() + COMMA + this.getTenDienThoai() + COMMA + this.getGiaBan() + COMMA +
                this.getSoLuong() + COMMA + this.getNhaSanXuat();
    }
}
