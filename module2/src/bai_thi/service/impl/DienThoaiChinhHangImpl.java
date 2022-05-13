package bai_thi.service.impl;

import bai_thi.common.CheckException;
import bai_thi.common.WriteReadFile;
import bai_thi.model.DienThoaiChinhHang;
import bai_thi.service.IServiceDienThoai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangImpl implements IServiceDienThoai {
   public static Scanner scanner = new Scanner(System.in);
    List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();


    @Override
    public void add() {
        dienThoaiChinhHangList = WriteReadFile.readFileDienThoaiChinhHang();
        System.out.print("Nhập Id:");
        String id = scanner.nextLine();

        System.out.print("Nhập tenDienThoai:");
        String tenDienThoai = scanner.nextLine();

        System.out.print("Nhập gia ban:");
        Double giaBan = 0.0d;
        giaBan = CheckException.checkDouble(giaBan);

        System.out.print("Nhập so luong:");
        Long soLuong = 0L;
        soLuong = CheckException.checkLong(soLuong);

        System.out.print("Nhập nha san xuat:");
        String nhaSanXuat =scanner.nextLine();

        System.out.print("Nhập thoi gian bao hanh:");
        String thoiGianBaoHanh =scanner.nextLine();

        System.out.println("chọn phạm vi bảo hành: " + "\n" +
                "1.Toàn quốc" + "\n" +
                "2.Quốc tế");
        String phamViBaoHanh = null;
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                phamViBaoHanh = "Toàn quốc";
                break;
            case 2:
                phamViBaoHanh = "Quốc tế";
                break;
        }


        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id,tenDienThoai,giaBan,soLuong,
                nhaSanXuat, thoiGianBaoHanh,phamViBaoHanh);
        dienThoaiChinhHangList.add(dienThoaiChinhHang);

        WriteReadFile.writeDienThoaiChanhHang(dienThoaiChinhHangList,false);
    }

    @Override
    public void delete() {
        dienThoaiChinhHangList = WriteReadFile.readFileDienThoaiChinhHang();
        boolean check = false;
        System.out.print("Nhập id Muốn xóa: ");
        String idDelete = scanner.nextLine();
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if (dienThoaiChinhHangList.get(i).getId().equals(idDelete)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
                if (dienThoaiChinhHangList.get(i).getId().equals(idDelete)) {
                    System.out.print("1.Yes: " + "\n" +
                            "2.No" + "\n" +
                            "lựa chọn của bạn: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            dienThoaiChinhHangList.remove(dienThoaiChinhHangList.get(i));
                            System.out.println("bạn đã xóa Điện thoại: "+idDelete);
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
            WriteReadFile.writeDienThoaiChanhHang(dienThoaiChinhHangList,false);
        }else {
            System.out.println("Không có điện thoại muốn xóa: "+ idDelete);
        }
    }


    @Override
    public void display() {
        dienThoaiChinhHangList = WriteReadFile.readFileDienThoaiChinhHang();
        if (dienThoaiChinhHangList.isEmpty()) {
            System.out.println("không có điện thoại nào!");
        } else {
            for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
                System.out.println(dienThoaiChinhHang);
            }
        }

    }

    @Override
    public void search() {
        dienThoaiChinhHangList = WriteReadFile.readFileDienThoaiChinhHang();
        boolean check = false;
        System.out.print("Nhập id Muốn tìm kiếm: ");
        String idSearch = scanner.nextLine();
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if (dienThoaiChinhHangList.get(i).getId().contains(idSearch)) {
                check = true;
                break;
            }
        }if (check){
            for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
                if (dienThoaiChinhHangList.get(i).getId().contains(idSearch)) {
                    System.out.println(dienThoaiChinhHangList.get(i));
                }
                }
        }
        else {
            System.out.println("không thấy điện thoại muốn tìm !");
        }

    }

    @Override
    public void edit() {
        dienThoaiChinhHangList = WriteReadFile.readFileDienThoaiChinhHang();
        boolean check = false;
        System.out.print("Nhập id điện thoại muốn sửa: ");
        String idEdit = scanner.nextLine();
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if (dienThoaiChinhHangList.get(i).getId().equals(idEdit)){
                check = true;
                break;
            }
        }
        if (check){
            for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
                if (dienThoaiChinhHangList.get(i).getId().equals(idEdit)){
                    System.out.println("nhập tên điện thoại: ");
                    dienThoaiChinhHangList.get(i).setTenDienThoai(scanner.nextLine());
                    System.out.println("nhập tên giá bán: ");
                    dienThoaiChinhHangList.get(i).setGiaBan(Double.parseDouble(scanner.nextLine()));
                    System.out.println("nhâp số lương: ");
                    dienThoaiChinhHangList.get(i).setSoLuong(Long.parseLong(scanner.nextLine()));
                    System.out.println("nhâp nhà sản xuất: ");
                    dienThoaiChinhHangList.get(i).setNhaSanXuat(scanner.nextLine());
                    System.out.println("nhâp thời gian bảo hành: ");
                    dienThoaiChinhHangList.get(i).setThoiGianBaoHanh(scanner.nextLine());
                    System.out.println("nhâp phạm vi bảo hành: ");
                    dienThoaiChinhHangList.get(i).setPhamViBaoHanh(scanner.nextLine());

                }
            }
        } else {
            System.out.println("không tìm thấy điện thoại muốn sửa!");
        }
    }
}