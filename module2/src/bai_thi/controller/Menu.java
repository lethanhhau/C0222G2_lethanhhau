package bai_thi.controller;

import bai_thi.service.IServiceDienThoai;
import bai_thi.service.impl.DienThoaiChinhHangImpl;
import bai_thi.service.impl.DienThoaiXachTayImpl;
import hau.case_study_furama_resort.common.exception.CheckException;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    public static IServiceDienThoai iServiceDienThoaiChinhHang = new DienThoaiChinhHangImpl();
    public static IServiceDienThoai iServiceDienThoaiXachTay = new DienThoaiXachTayImpl();

    public void displayMainMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("---Menu--- \n" +
                    "1.ADD \n" +
                    "2.Delete \n" +
                    "3.Display \n" +
                    "4.Search \n" +
                    "5.Exit \n" +
                    "Enter choice: ");
            int choice = 0;
            choice = CheckException.checkInt(choice);
            switch (choice) {
                case 1:
                    choiceAddDienThoai();
                    break;
                case 2:
                    choiceDeleteDienThoai();
                    break;
                case 3:
                    choiceDisplayDienThoai();
                    break;
                case 4:
                    choiceSearchDienThoai();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Enter Choice again!");
                    System.out.println();
                    break;
            }
        }
    }

    public void choiceAddDienThoai(){
        boolean check = true;
        while (check){
            System.out.print("---Nhập điện thoại muốn thêm--\n"+
                    "1.điện thoại chính hãng \n"+
                    "2.điện thoại xách tay \n"+
                    "3.exit \n" +
                    "Enter choice: ");
            int choice = 0;
            choice = CheckException.checkInt(choice);
            switch (choice){
                case 1:
                    iServiceDienThoaiChinhHang.add();
                    break;
                case 2:
                    iServiceDienThoaiXachTay.add();
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.err.println("Enter Choice again!");
                    System.out.println();
                    break;
            }
        }
    }
    public void choiceDeleteDienThoai(){
        boolean check = true;
        while (check){
            System.out.print("---Nhập điện thoại muốn xóa--\n"+
                    "1.điện thoại chính hãng \n"+
                    "2.điện thoại xách tay \n"+
                    "3.exit \n" +
                    "Enter choice: ");
            int choice = 0;
            choice = CheckException.checkInt(choice);
            switch (choice){
                case 1:
                    iServiceDienThoaiChinhHang.delete();
                    break;
                case 2:
                    iServiceDienThoaiXachTay.delete();
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.err.println("Enter Choice again!");
                    System.out.println();
                    break;
            }
        }
    }

    public void choiceDisplayDienThoai(){
        boolean check = true;
        while (check){
            System.out.print("---Nhập điện thoại muốn hiển thị--\n"+
                    "1.điện thoại chính hãng \n"+
                    "2.điện thoại xách tay \n"+
                    "3.exit \n" +
                    "Enter choice: ");
            int choice = 0;
            choice = CheckException.checkInt(choice);
            switch (choice){
                case 1:
                    iServiceDienThoaiChinhHang.display();
                    break;
                case 2:
                    iServiceDienThoaiXachTay.display();
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.err.println("Enter Choice again!");
                    System.out.println();
                    break;
            }
        }
    }

    public void choiceSearchDienThoai(){
        boolean check = true;
        while (check){
            System.out.print("---Nhập điện thoại muốn tìm kiếm--\n"+
                    "1.điện thoại chính hãng \n"+
                    "2.điện thoại xách tay \n"+
                    "3.exit \n" +
                    "Enter choice: ");
            int choice = 0;
            choice = CheckException.checkInt(choice);
            switch (choice){
                case 1:
                    iServiceDienThoaiChinhHang.search();
                    break;
                case 2:
                    iServiceDienThoaiXachTay.search();
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.err.println("Enter Choice again!");
                    System.out.println();
                    break;
            }
        }
    }
}
