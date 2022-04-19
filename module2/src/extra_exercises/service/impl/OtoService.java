package extra_exercises.service.impl;

import extra_exercises.model.Oto;
import extra_exercises.service.IOto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOto {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Oto> otos = new ArrayList<>();
    static {
        otos.add(new Oto("36B1-12345","honda",2020,"hau",4,"xe nhà"));
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
        System.out.print("nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập kiểu xe: ");
        String kieuXe = scanner.nextLine();
        Oto oto = new Oto(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
        otos.add(oto);
    }

    @Override
    public void hienThi() {
        for (Oto oto:otos) {
            System.out.println(oto);
        }
    }

    @Override
    public void xoa() {
        System.out.print("nhập Biển Kiểm Soát Muốn xóa");
        String bienKiemSoat = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < otos.size(); i++) {
            if (bienKiemSoat.equalsIgnoreCase(otos.get(i).getBienKiemSoat())) {
                System.out.println("Do you want to delete transport with license plate: " + bienKiemSoat + "?");
                System.out.println("1. Yes" + "\n" +
                        "2. No");
                int chon = Integer.parseInt(scanner.nextLine());
                switch (chon){
                    case 1:
                        otos.remove(i);
                        System.out.println("bạn đã xóa xe có biển kiểm soát: "+ bienKiemSoat);
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
