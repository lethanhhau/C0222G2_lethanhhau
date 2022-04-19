package extra_exercises.controller;

import extra_exercises.service.IOto;
import extra_exercises.service.IXeMay;
import extra_exercises.service.IXeTai;
import extra_exercises.service.impl.OtoService;
import extra_exercises.service.impl.XeMayService;
import extra_exercises.service.impl.XeTaiService;

import java.util.Scanner;

public class PhuongTienController {
    private static Scanner scanner = new Scanner(System.in);
    private static IOto iOto = new OtoService();
    private static IXeTai iXeTai = new XeTaiService();
    private static IXeMay iXeMay = new XeMayService();

    public void display() {
        while (true) {
            System.out.println("----Menu Quản Lý Phương Tiện----\n" +
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
                case 2:
                    hienThiPhuongTien();
                case 3:
                case 4:
                case 5:
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
        }
    }

    public void xoaPhuongTien(){

    }
}
