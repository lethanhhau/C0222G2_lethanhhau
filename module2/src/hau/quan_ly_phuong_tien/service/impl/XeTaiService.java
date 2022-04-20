package hau.quan_ly_phuong_tien.service.impl;

import hau.quan_ly_phuong_tien.model.XeTai;
import hau.quan_ly_phuong_tien.service.IXeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTai {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeTai> xeTais = new ArrayList<>();

    public static List<XeTai> getXeTai() {
        return xeTais;
    }
    {
        XeTai xeTai1 = new XeTai("43F1-82496","HuynDai",2020,"hau",5000d);
        XeTai xeTai2 = new XeTai("92H-20446","Thaco",2008,"phuong",3000d);
        xeTais.add(xeTai1);
        xeTais.add(xeTai2);
    }

    @Override
    public void themMoi() {
        System.out.print("nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập chử sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        System.out.print("nhập trọng tải: ");
        double trongTai = Double.parseDouble(scanner.nextLine());

        XeTai xeTai = new XeTai(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,trongTai);
        xeTais.add(xeTai);

        // add xe tải vài list phuongTienS
        PhuongTienService.getPhuongTiens().add(xeTai);

    }

    @Override
    public void hienThi() {
        for (XeTai xeTai: xeTais) {
            System.out.println(xeTai);
        }

    }

    @Override
    public void xoa() {
        System.out.print("nhập Biển Kiểm Soát Muốn xóa: ");
        String bienKiemSoat = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < xeTais.size(); i++) {
            if (bienKiemSoat.equalsIgnoreCase(xeTais.get(i).getBienKiemSoat())) {
                System.out.println("Do you want to delete transport with license plate: " + bienKiemSoat + "?");
                System.out.println("1. Yes" + "\n" +
                        "2. No");
                int chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        xeTais.remove(i);
                        System.out.println("bạn đã xóa xe có biển kiểm soát: " + bienKiemSoat);
                        break;
                    default:
                        System.out.println("bạn đã không xóa");
                }
            }
        }
    }

    @Override
    public void timKiemTheoBienKiemSoat() {

    }
}
