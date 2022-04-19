package module2.ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;
//Kiểm tra năm nhuận.

public class SS6CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm muốn kiểm tra: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không phải là năm nhuận");
                }
            } else {
                System.out.println(year + " là năm nhuận");
            }
        }else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}

