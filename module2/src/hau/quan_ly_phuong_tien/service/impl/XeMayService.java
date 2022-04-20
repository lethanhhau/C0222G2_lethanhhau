package hau.quan_ly_phuong_tien.service.impl;
import hau.quan_ly_phuong_tien.model.PhuongTien;
import hau.quan_ly_phuong_tien.model.XeMay;
import hau.quan_ly_phuong_tien.service.IXeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeMay {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeMay> xeMays = new ArrayList<>();

    public static List<XeMay> getXeMays() {
        return xeMays;
    }
    {
        XeMay xeMay1 = new XeMay("43A3-68241","VinFast",2021,"hoan",135);
        XeMay xeMay2 = new XeMay("43N1-92640","HonDa",2018,"tai",150);
        xeMays.add(xeMay1);
        xeMays.add(xeMay2);
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
        System.out.print("nhập công suất: ");
        int congSuat = Integer.parseInt(scanner.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,congSuat);
        xeMays.add(xeMay);

        // add xe máy vài list phuongTienS
        PhuongTienService.getPhuongTiens().add(xeMay);

    }

    @Override
    public void hienThi() {
        for (XeMay xeMay:xeMays) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void xoa() {
    }

    @Override
    public void timKiemTheoBienKiemSoat() {

    }


}
