package hau.quan_ly_phuong_tien.service.impl;

import hau.quan_ly_phuong_tien.model.PhuongTien;
import hau.quan_ly_phuong_tien.service.IPhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienService implements IPhuongTien {
    private static Scanner scanner = new Scanner(System.in);
    private static List<PhuongTien> phuongTiens = new ArrayList<>();

    static {
        phuongTiens.addAll(XeMayService.getXeMays());
        phuongTiens.addAll(OtoService.getOtos());
        phuongTiens.addAll(XeTaiService.getXeTai());

    }

    public static List<PhuongTien> getPhuongTiens() {
        return phuongTiens;
    }

    @Override
    public void themMoi() {

    }

    @Override
    public void hienThi() {
        for (PhuongTien phuongTien : phuongTiens
        ) {
            System.out.println(phuongTien);
        }
    }

    @Override
    public void xoa() {
        System.out.print("nhập Biển Kiểm Soát Muốn xóa: ");
        String bienKiemSoat = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < phuongTiens.size(); i++) {
            if (bienKiemSoat.equalsIgnoreCase(phuongTiens.get(i).getBienKiemSoat())) {
                System.out.println("Do you want to delete transport with license plate: " + bienKiemSoat + "?");
                System.out.println("1. Yes" + "\n" +
                        "2. No");
                int chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        phuongTiens.remove(i);
                        System.out.println("bạn đã xóa xe có biển kiểm soát: " + bienKiemSoat);
                        break;
                    default:
                        System.out.println("bạn đã không xóa");
                        break;
                }
            } else {
                System.out.println("không có xe có biển kiểm soát: " + bienKiemSoat);
                break;
            }
        }
    }


    @Override
    public void timKiemTheoBienKiemSoat() {
        System.out.print("nhập Biển Kiểm Soát Muốn Tìm: ");
        String bienKiemSoat = scanner.nextLine();
        boolean check = false;


        //   Tìm kiếm gần đúng dùng Phương thức contains
        for (int i = 0; i < phuongTiens.size(); i++) {
            if (phuongTiens.get(i).getBienKiemSoat().contains(bienKiemSoat)) {
                check = true;
            }
        }
        if (check) {
            for (int i = 0; i < phuongTiens.size(); i++) {
                if (phuongTiens.get(i).getBienKiemSoat().contains(bienKiemSoat)) {
                    System.out.println(phuongTiens.get(i));
                }
                }
            }else {
            System.out.println(bienKiemSoat + " không tìm thấy");
        }
    }
}

         // tìm kiếm đúng dùng phương thức equals.
//        for (int i = 0; i < phuongTiens.size(); i++) {
//            if (phuongTiens.get(i).getBienKiemSoat().equals(bienKiemSoat)){
//                check = true;
//            }
//        }
//        if (check) {
//            for (int i = 0; i < phuongTiens.size(); i++) {
//                if (phuongTiens.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
//                    System.out.println(phuongTiens.get(i));
//                }
//            }
//        }
//        else {
//            System.out.println(bienKiemSoat + " không tìm thấy");
//        }
//    }
//}
