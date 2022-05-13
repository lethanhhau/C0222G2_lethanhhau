package on_tap.ss2.service.impl;

import on_tap.ss2.common.CheckException;
import on_tap.ss2.common.Validate;
import on_tap.ss2.common.WriteReadFile;
import on_tap.ss2.model.MonHoc;
import on_tap.ss2.service.IMonHoc;

import java.util.*;

public class MonHocImpl implements IMonHoc {
    private Scanner scanner = new Scanner(System.in);
    private static List<MonHoc> monHocList = new ArrayList<>();

    static {
        monHocList.add(new MonHoc("BC-abcd", "Toán", "1.1", "khó", 12));
        monHocList.add(new MonHoc("BC-XYZC", "lý", "1.2", "vừa", 6));
        Collections.sort(monHocList, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getThoiGianHoc() - o2.getThoiGianHoc();
            }
        });

        WriteReadFile.writeMonHoc(monHocList, false);
    }

    @Override
    public void display() {
        monHocList = WriteReadFile.readFileMonHoc();
        for (MonHoc monHoc : monHocList) {
            System.out.println(monHoc);
        }
    }

    @Override
    public void add() {
        monHocList = WriteReadFile.readFileMonHoc();
        System.out.print("Nhập mã môn học: ");
        String maMonHoc = scanner.nextLine();

        while (!Validate.isMaMonHoc(maMonHoc)) {
            System.err.println("mã môn học không đúng định dạng!");
            System.out.println();
            System.out.print("nhập lại mã môn học: ");
            maMonHoc = scanner.nextLine();
        }

        System.out.print("Nhập Tên Môn học: ");
        String tenMonHoc = scanner.nextLine();
        while (!Validate.isTenMonHoc(tenMonHoc)) {
            System.err.println("Tên môn học không đúng định dạng!");
            System.out.println();
            System.out.print("nhập lại Tên môn học: ");
            tenMonHoc = scanner.nextLine();
        }
        System.out.print("Nhập Phiên bản: ");
        String phienBan = scanner.nextLine();
        while (!Validate.isPhienBan(phienBan)) {
            System.err.println("phiên bản không đúng định dạng!");
            System.out.println();
            System.out.print("nhập lại phiên bản: ");
            phienBan = scanner.nextLine();
        }

        System.out.println("chọn độ khó: " + "\n" +
                "1.dễ" + "\n" +
                "2.vừa" + "\n" +
                "3.Khó");
        String doKho = null;
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                doKho = "Dễ";
                break;
            case 2:
                doKho = "vừa";
                break;
            case 3:
                doKho = "khó";
                break;
        }

        System.out.print("Nhập thời gian: ");
        int thoiGian = Integer.parseInt(scanner.nextLine());
        MonHoc monHoc = new MonHoc(maMonHoc, tenMonHoc, phienBan, doKho, thoiGian);
        monHocList.add(monHoc);
        WriteReadFile.writeMonHoc(monHocList, false);
    }

    @Override
    public void edit() {
        monHocList = WriteReadFile.readFileMonHoc();
        boolean check = false;
        System.out.print("Nhập mã muôn học muốn sửa: ");
        String maMonHocEdit = scanner.nextLine();
        for (int i = 0; i < monHocList.size(); i++) {
            if (monHocList.get(i).getMaMonHoc().equals(maMonHocEdit)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < monHocList.size(); i++) {
                if (monHocList.get(i).getMaMonHoc().equals(maMonHocEdit)) {
                    System.out.print("Nhập tên Môn học: ");
                    MonHocImpl.monHocList.get(i).setTenMonHoc(scanner.nextLine());
                    System.out.print("Nhập phiên bản: ");
                    MonHocImpl.monHocList.get(i).setPhienBan(scanner.nextLine());
                    System.out.print("Nhập độ khó: ");
                    MonHocImpl.monHocList.get(i).setDoKho(scanner.nextLine());
                    System.out.print("Nhập thời gian học: ");
                    MonHocImpl.monHocList.get(i).setThoiGianHoc(Integer.parseInt(scanner.nextLine()));
                }
            }
        } else {
            System.out.println("không tìm thấy mã môn học muốn sửa!");
        }

    }

    @Override
    public void remove() throws CheckException {
        monHocList = WriteReadFile.readFileMonHoc();
        boolean check = false;
        System.out.print("Nhập mã môn học muốn xóa: ");
        String maMonHocremove = scanner.nextLine();
        for (int i = 0; i < monHocList.size(); i++) {
            if (monHocList.get(i).getMaMonHoc().equals(maMonHocremove)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < monHocList.size(); i++) {
                if (monHocList.get(i).getMaMonHoc().equals(maMonHocremove)) {
                    monHocList.remove(monHocList.get(i));
                    break;
                }
            }
        } else {
            throw new CheckException("Mã môn học không được tìm thấy!");
        }
        WriteReadFile.writeMonHoc(monHocList, false);
    }
}