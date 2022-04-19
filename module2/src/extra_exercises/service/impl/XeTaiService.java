package extra_exercises.service.impl;

import extra_exercises.model.Oto;
import extra_exercises.model.XeMay;
import extra_exercises.model.XeTai;
import extra_exercises.service.IXeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTai {
    private static Scanner scanner = new Scanner(System.in);
    private static List<XeTai> xeTais = new ArrayList<>();

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
        System.out.print("nhập trọng tai: ");
        double trongTai = Double.parseDouble(scanner.nextLine());

        XeTai xeTai = new XeTai(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,trongTai);
        xeTais.add(xeTai);

    }

    @Override
    public void hienThi() {
        for (XeTai xeTai: xeTais) {
            System.out.println(xeTai);
        }

    }

    @Override
    public void xoa() {

    }

    @Override
    public void timKiemTheoBienKiemSoat() {

    }
}
