package on_tap.ss1.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 Xây dựng hệ thống quản lý suất chiếu phim tại rạp ABC, biết mỗi suất chiếu có các thông tin sau:
 - Mã suất chiếu (định dạng CI-XXXX, với X là số nguyên dương), mã không được trùng nhau.
 - Tên phim (mỗi suất chiếu chỉ xem được 1 phim, một phim sẽ có nhiều suất chiếu khác nhau)
 - Ngày chiếu (phải sau ngày hiện tại)
 - Số lượng vé (là số nguyên dương)Tạo các chức năng sau theo menu:
 1. Danh sách toàn bộ suất chiếu của rạp.
 2. Thêm mới một suất chiếu
 3. Xoá suất chiếu bất kì theo Mã suất chiếu, trước khi xoá thì cần hiển thị confirm.
 4. ThoátLưu ý:
 - Cần validate khi thêm mới thông tin.
 - Dữ liệu sẽ được lưu trữ ở file CSV
 */


public class SuatChieu {
    private static final String COMMA = ",";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static Date now = new Date();
    private String maChieuPhim;
    private String tenPhim;
    private Date ngayChieu;
    private Integer soLuongve;

    public SuatChieu() {
    }

    public SuatChieu(String maChieuPhim, String tenPhim, Date ngayChieu, Integer soLuongve) {
        this.maChieuPhim = maChieuPhim;
        this.tenPhim = tenPhim;
        this.ngayChieu = ngayChieu;
        this.soLuongve = soLuongve;
    }

    public String getMaChieuPhim() {
        return maChieuPhim;
    }

    public void setMaChieuPhim(String maChieuPhim) {
        this.maChieuPhim = maChieuPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public Integer getSoLuongve() {
        return soLuongve;
    }

    public void setSoLuongve(Integer soLuongve) {
        this.soLuongve = soLuongve;
    }

    @Override
    public String toString() {
        return "SuatChieu= " +
                "maChieuPhim= " + maChieuPhim +
                ", tenPhim= " + tenPhim +
                ", ngayChieu= " + simpleDateFormat.format(ngayChieu) +
                ", soLuongve= " + soLuongve;
    }

    public String getInFoSuatChieu(){
        return this.getMaChieuPhim() + COMMA + this.getTenPhim() + COMMA + simpleDateFormat.format(this.getNgayChieu()) + COMMA +
                this.getSoLuongve();
    }
}
