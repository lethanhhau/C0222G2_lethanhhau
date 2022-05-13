package on_tap.ss1.controllor;

import hau.case_study_furama_resort.common.exception.CheckException;
import on_tap.ss1.service.ISuatChieuPhim;
import on_tap.ss1.service.impl.SuatChieuImpl;

import java.util.Scanner;

public class Menu {
    private static ISuatChieuPhim iSuatChieuPhim = new SuatChieuImpl();

    public void displayMenu() {
        while (true) {
            System.out.print("---Hệ Thống Quản Lý Rạp Chiếu Phim Tại Rạp ABC--- \n" +
                    "1.Danh Sách Toàn bộ suất chiếu tại rạp \n" +
                    "2.Thêm mới một suất chiếu\n" +
                    "3.sửa một suất chiếu\n" +
                    "4.Xóa xuất chiếu\n" +
                    "5.Thoát\n" +
                    "Enter choice: ");
            int choice = 0;
            choice = CheckException.checkInt(choice);
            switch (choice) {
                case 1:
                    iSuatChieuPhim.display();
                    break;
                case 2:
                    iSuatChieuPhim.add();;
                    break;
                case 3:
                    iSuatChieuPhim.edit();
                    break;
                case 4:
                    iSuatChieuPhim.delete();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Enter Choice again!");
                    System.out.println();
                    break;
            }
        }
    }
}