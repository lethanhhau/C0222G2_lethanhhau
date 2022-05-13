package bai_thi.service.impl;

import bai_thi.common.WriteReadFile;
import bai_thi.model.DienThoaiXachTay;
import bai_thi.service.IServiceDienThoai;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayImpl implements IServiceDienThoai {
    public static Scanner scanner = new Scanner(System.in);
    List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();

    @Override
    public void add() {
        dienThoaiXachTayList = WriteReadFile.readFileDienThoaiXaxhTay();
        System.out.print("Nhập Id:");
        String id = scanner.nextLine();

        System.out.print("Nhập tenDienThoai:");
        String tenDienThoai = scanner.nextLine();

        System.out.print("Nhập gia ban:");
        Double giaBan = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập so luong:");
        Long soLuong = Long.parseLong(scanner.nextLine());

        System.out.print("Nhập nha san xuat:");
        String nhaSanXuat =scanner.nextLine();

        System.out.print("Nhập quoc gia xach tay:");
        String quocGiaXachTay =scanner.nextLine();
        while (quocGiaXachTay.equals("Viet Nam")) {
            System.err.println("quốc gia xách tay không được là việt nam!");
            System.out.println();
            System.out.print("nhập lại quốc gia xách tay:");
            quocGiaXachTay = scanner.nextLine();
        }
        System.out.println("chọn Trạng thái sửa chữa: " + "\n" +
                "1.Đã sửa chữa" + "\n" +
                "2.Chưa sửa chữa");
        String trangThai = null;
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                trangThai = "Đã sửa chữa";
                break;
            case 2:
                trangThai = "chưa sửa chữa";
                break;
        }

        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id,tenDienThoai,giaBan,soLuong,nhaSanXuat,
                quocGiaXachTay,trangThai);
        dienThoaiXachTayList.add(dienThoaiXachTay);

        WriteReadFile.writeDienThoaiXachTay(dienThoaiXachTayList,false);
    }

    @Override
    public void delete() {
        dienThoaiXachTayList = WriteReadFile.readFileDienThoaiXaxhTay();
        boolean check = false;
        System.out.print("Nhập id Muốn xóa: ");
        String idDelete = scanner.nextLine();
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if (dienThoaiXachTayList.get(i).getId().equals(idDelete)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
                if (dienThoaiXachTayList.get(i).getId().equals(idDelete)) {
                    System.out.println(
                            "1.Yes: " + "\n" +
                            "2.No"  + "\n" +
                            "Nhập lựa chọn: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            dienThoaiXachTayList.remove(dienThoaiXachTayList.get(i));
                            System.out.println("bạn đã xóa Điện thoai: "+ idDelete);
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
            WriteReadFile.writeDienThoaiXachTay(dienThoaiXachTayList,false);

        }else {
            System.out.println("Không có điện thoại muốn xóa: "+ idDelete);
        }
    }

    @Override
    public void display() {
        dienThoaiXachTayList = WriteReadFile.readFileDienThoaiXaxhTay();
        if (dienThoaiXachTayList.isEmpty()) {
            System.out.println("không có điện thoại  nào!");
        } else {
            for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
                System.out.println(dienThoaiXachTay);
            }
        }

    }

    @Override
    public void search() {
        dienThoaiXachTayList = WriteReadFile.readFileDienThoaiXaxhTay();
        boolean check = false;
        System.out.print("Nhập id Muốn tìm kiếm: ");
        String idSearch = scanner.nextLine();
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if (dienThoaiXachTayList.get(i).getId().contains(idSearch)) {
                check = true;
                break;
            }
        }if (check){
            for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
                if (dienThoaiXachTayList.get(i).getId().contains(idSearch)) {
                    System.out.println(dienThoaiXachTayList.get(i));
                }
            }
        }
        else {
            System.out.println("không thấy điện thoại muốn tìm !");
        }

    }

    @Override
    public void edit() {
        dienThoaiXachTayList = WriteReadFile.readFileDienThoaiXaxhTay();
        boolean check = false;
        System.out.print("Nhập id điện thoại muốn sửa: ");
        String idEdit = scanner.nextLine();
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if (dienThoaiXachTayList.get(i).getId().equals(idEdit)){
                check = true;
                break;
            }
        }
        if (check){
            for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
                if (dienThoaiXachTayList.get(i).getId().equals(idEdit)){
                    System.out.println("nhập tên điện thoại: ");
                    dienThoaiXachTayList.get(i).setTenDienThoai(scanner.nextLine());
                    System.out.println("nhập tên giá bán: ");
                    dienThoaiXachTayList.get(i).setGiaBan(Double.parseDouble(scanner.nextLine()));
                    System.out.println("nhâp số lương: ");
                    dienThoaiXachTayList.get(i).setSoLuong(Long.parseLong(scanner.nextLine()));
                    System.out.println("nhâp nhà sản xuất: ");
                    dienThoaiXachTayList.get(i).setNhaSanXuat(scanner.nextLine());
                    System.out.println("nhâp quốc gia xách tay: ");
                    dienThoaiXachTayList.get(i).setQuocGiaXachTay(scanner.nextLine());
                    System.out.println("nhâp trạng thái: ");
                    dienThoaiXachTayList.get(i).setTrangThai(scanner.nextLine());
                }
            }
        }else {
            System.out.println("không tìm thấy điện thoại muốn sửa!");
        }
    }
}
