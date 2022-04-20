package hau.quan_ly_phuong_tien.controller;

import hau.quan_ly_phuong_tien.model.PhuongTien;
import hau.quan_ly_phuong_tien.service.IOto;
import hau.quan_ly_phuong_tien.service.IPhuongTien;
import hau.quan_ly_phuong_tien.service.IXeMay;
import hau.quan_ly_phuong_tien.service.IXeTai;
import hau.quan_ly_phuong_tien.service.impl.OtoService;
import hau.quan_ly_phuong_tien.service.impl.PhuongTienService;
import hau.quan_ly_phuong_tien.service.impl.XeMayService;
import hau.quan_ly_phuong_tien.service.impl.XeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienController {
    private static Scanner scanner = new Scanner(System.in);
    private static IOto iOto = new OtoService();
    private static IXeTai iXeTai = new XeTaiService();
    private static IXeMay iXeMay = new XeMayService();
    private static IPhuongTien iPhuongTien = new PhuongTienService();
    private static List<PhuongTien> phuongTiens = new ArrayList<>();

    public void display() {
        while (true) {
            System.out.print("----Menu Quản Lý Phương Tiện----\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n" +
                    "Chọn Chức Năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    chonLoaiXe();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    iPhuongTien.xoa();
                    break;
                case 4:
                    iPhuongTien.timKiemTheoBienKiemSoat();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    public void chonLoaiXe() {
        System.out.print(
                "1.Thêm Xe Tải \n" +
                "2.Thêm Oto \n" +
                "3.Thêm Xe Máy \n" +
                "Mời Người Dùng Chọn Xe: ");
        int loaiXe = Integer.parseInt(scanner.nextLine());
        switch (loaiXe){
            case 1:
                iXeTai.themMoi();
                break;
            case 2:
                iOto.themMoi();
                break;
            case 3:
                iXeMay.themMoi();
                break;
        }
    }

    public void hienThiPhuongTien() {
        System.out.print(
                        "1.Xe tải \n" +
                        "2.Oto \n" +
                        "3.Xe máy \n" + 
                        "4.hiển thị tất cả phương tiện \n"+
                        "Mời người Dùng chọn: ");
        int loaiXe = Integer.parseInt(scanner.nextLine());
        switch (loaiXe) {
            case 1:
                iXeTai.hienThi();
                break;
            case 2:
                iOto.hienThi();
                break;
            case 3:
                iXeMay.hienThi();
                break;
            case 4:
                iPhuongTien.hienThi();
                break;
        }
    }


}
