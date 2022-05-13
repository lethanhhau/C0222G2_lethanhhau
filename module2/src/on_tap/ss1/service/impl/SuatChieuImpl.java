package on_tap.ss1.service.impl;

import on_tap.ss1.common.CheckException;
import on_tap.ss1.common.Validate;
import on_tap.ss1.common.WriteReadFile;
import on_tap.ss1.model.SuatChieu;
import on_tap.ss1.service.ISuatChieuPhim;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SuatChieuImpl implements ISuatChieuPhim {
    private Scanner scanner = new Scanner(System.in);
    private static Date now = new Date();
    private static List<SuatChieu> suatChieuList = new ArrayList<>();
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    static {
        Date date1 = new Date();
        suatChieuList.add(new SuatChieu("CI-1234", "Bố già", date1, 50));
        suatChieuList.add(new SuatChieu("CI-6789", "hài", date1, 40));
        WriteReadFile.writeSuatChieu(suatChieuList,false);

    }

    @Override
    public void display() {
        suatChieuList = WriteReadFile.readFileSuatChieu();
        if (suatChieuList.isEmpty()) {
            System.out.println("không có xuất chiếu nào!");
        } else {
            for (SuatChieu suatChieu : suatChieuList) {
                System.out.println(suatChieu);
            }
        }
    }

    @Override
    public void add() {
        suatChieuList = WriteReadFile.readFileSuatChieu();
        System.out.print("Nhập mã chiếu phim: ");
        String maChieuPhim = scanner.nextLine();
        while (!Validate.isMaChieuPhim(maChieuPhim)){
            System.err.println("mã chiếu phim không đúng định dạng!");
            System.out.println();
            System.out.print("nhập lại mã chiếu phim: ");
            maChieuPhim = scanner.nextLine();
        }

        System.out.print("Nhập tên phim: ");
        String tenPhim = scanner.nextLine();

        System.out.print("nhập ngày chiếu phim: ");
        Date ngayChieu = new Date();

        System.out.print("Nhập số lượng vé: ");
        int soLuongVe = 0;
        soLuongVe = CheckException.checkInt(soLuongVe);

        SuatChieu suatChieu = new SuatChieu(maChieuPhim, tenPhim, ngayChieu, soLuongVe);
        suatChieuList.add(suatChieu);

        WriteReadFile.writeSuatChieu(suatChieuList,false);
    }

    @Override
    public void edit() {
        suatChieuList = WriteReadFile.readFileSuatChieu();
        boolean check = false;
        System.out.print("nhập mã chiếu phim muốn sửa: ");
        String maChieuPhimedit = scanner.nextLine();
        for (int i = 0; i < suatChieuList.size(); i++) {
            if (suatChieuList.get(i).getMaChieuPhim().equals(maChieuPhimedit)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < suatChieuList.size(); i++) {
                if (suatChieuList.get(i).getMaChieuPhim().equals(maChieuPhimedit)) {
                    System.out.print("Nhập Tên phim: ");
                    SuatChieuImpl.suatChieuList.get(i).setTenPhim(scanner.nextLine());
                    System.out.print("Nhập số lượng vé: ");
                    SuatChieuImpl.suatChieuList.get(i).setSoLuongve(Integer.parseInt(scanner.nextLine()));
                    break;
                }
            }
            WriteReadFile.writeSuatChieu(suatChieuList,false);
        } else {
            System.out.println("Không có mã chiếu phim muốn edit!" + maChieuPhimedit);
        }
    }

    @Override
    public void delete() {
        suatChieuList = WriteReadFile.readFileSuatChieu();
        boolean check = false;
        System.out.print("Nhập mã chiếu phim Muốn xóa: ");
        String maChieuPhimDelete = scanner.nextLine();
        for (int i = 0; i < suatChieuList.size(); i++) {
            if (suatChieuList.get(i).getMaChieuPhim().equals(maChieuPhimDelete)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < suatChieuList.size(); i++) {
                if (suatChieuList.get(i).getMaChieuPhim().equals(maChieuPhimDelete)) {
                    System.out.println("lựa chọn của bạn" + "\n" +
                            "1.xóa mã chiếu phim: "+maChieuPhimDelete + "\n" +
                            "2.không xóa");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            suatChieuList.remove(suatChieuList.get(i));
                            System.out.println("bạn đã xóa mã chiếu phim: "+maChieuPhimDelete);
                            break;
                        case 2:
                            System.out.println("bạn đã không xóa!");
                            break;
                        default:
                            System.err.println("Enter Choice again!");
                            System.out.println();
                            break;
                    }

                }
            }

            WriteReadFile.writeSuatChieu(suatChieuList,false);
        }else {
            System.out.println("Không có mã chiếu phim muốn xóa: "+ maChieuPhimDelete);
        }
    }
}