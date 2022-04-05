package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;
//Tìm ước số chung lớn nhấtAssignment;

public class SS3FindGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số a: ");
        int a = sc.nextInt();
        System.out.print("nhập số b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("Không có UCLN");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN là " + a);
    }
}
