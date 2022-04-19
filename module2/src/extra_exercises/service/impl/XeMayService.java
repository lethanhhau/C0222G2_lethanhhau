package extra_exercises.service.impl;

import extra_exercises.model.Oto;
import extra_exercises.model.XeMay;
import extra_exercises.service.IXeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeMay {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeMay> xeMays = new ArrayList<>();

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
