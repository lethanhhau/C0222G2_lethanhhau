package on_tap.ss2.controllor;

import hau.case_study_furama_resort.common.exception.CheckException;
import on_tap.ss2.service.IMonHoc;
import on_tap.ss2.service.impl.MonHocImpl;

public class MenuQuanLy {
    private static IMonHoc iMonHoc = new MonHocImpl();

    public void displayMenu() {
        while (true) {
            System.out.print("---hệ thống quản lý các môn học ở trung tâm CodeGym--- \n" +
                    "1.Danh sách các môn học theo thời lượng lớn nhất đến nhỏ nhất \n" +
                    "2.Thêm môn học\n" +
                    "3.Cập nhật môn học\n" +
                    "4.Xoá môn học bất kì theo Mã môn học\n" +
                    "5.Thoát\n" +
                    "Enter choice: ");
            int choice = 0;
            choice = CheckException.checkInt(choice);
            switch (choice) {
                case 1:
                    iMonHoc.display();
                    break;
                case 2:
                    iMonHoc.add();
                    break;
                case 3:
                    iMonHoc.edit();
                    break;
                case 4:
                    try {
                        iMonHoc.remove();
                    } catch (on_tap.ss2.common.CheckException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Enter Choice again!");
                    System.out.println();
                    break;
            }
        }
    }
}
