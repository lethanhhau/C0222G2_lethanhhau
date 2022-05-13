package on_tap.ss2.model;
/*
 Xây dựng hệ thống quản lý các môn học ở trung tâm CodeGym, biết mỗi môn học bao gồm các thông tin sau:
         - Mã môn học (định dạng BC-YYYY, với Y là các kí tự chữ), mã không được trùng nhau.
         (ta có thể sử dụng set để lưu và equal hash code mã môn học để phân biệt trùng lặp
          hoặc ta có thể sử dụng list để lưu và set điều kiện if else cho mã môn học)
         - Tên môn học (có thể trùng nhau)
         - Phiên bản (theo định dạng X.X, với X là số nguyên dương)
         - Độ khó: chỉ có một trong 3 tuỳ chọn Dễ, Vừa, Khó.
         - Thời lượng học: là số nguyên, có đơn vị là giờ.
         Tạo các chức năng sau theo menu:
         1. Danh sách các môn học theo thời lượng lớn nhất đến nhỏ nhất.
         2. Cập nhật môn học (không được phép chỉnh sửa Mã môn học).
         3. Xoá môn học bất kì theo Mã môn học, nếu không có Mã môn học thì thực hiện throw Exception.
         4. Thoát.
         Bài tập nhỏ 3:
*/

public class MonHoc {
    private static final String COMMA = ",";
    private String maMonHoc;
    private String tenMonHoc;
    private String phienBan;
    private String doKho;
    private Integer thoiGianHoc;

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, String tenMonHoc, String phienBan, String doKho, Integer thoiGianHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.phienBan = phienBan;
        this.doKho = doKho;
        this.thoiGianHoc = thoiGianHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }

    public Integer getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(Integer thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    @Override
    public String toString() {
        return "MonHoc: " +
                "maMonHoc= " + maMonHoc +
                ", tenMonHoc= " + tenMonHoc +
                ", phienBan= " + phienBan +
                ", doKho= " + doKho +
                ", thoiGianHoc= " + thoiGianHoc;
    }

    public String getInFoMonHoc(){
        return this.getMaMonHoc() + COMMA + this.getTenMonHoc() + COMMA + this.getPhienBan() + COMMA +
                this.getDoKho() + COMMA + this.getThoiGianHoc();
    }
}
