package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.print("Nhập tiền usd muốn chuyển :");
        float usd = money.nextInt();
        float vnd = usd * 23000;
        System.out.println(usd +"usd" + " = " + vnd + "vnd");
    }
}
