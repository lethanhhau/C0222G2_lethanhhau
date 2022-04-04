package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;
//Tìm giá trị trong mảng.

public class Bai2FindValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên sinh viên muốn tìm:");
        String sinhVien = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(sinhVien)) {
                System.out.print("sinh viên " + sinhVien + " ở vị trí thứ " + i);
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.print("không tìm thấy");
        }
    }
}
