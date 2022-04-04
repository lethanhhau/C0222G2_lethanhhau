package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;
//Ứng dụng tính tiền lãi cho vay

public class Bai2CalculateLoanInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tiền gửi: ");
        int deposits = sc.nextInt();
        System.out.print("nhập tỷ lệ lãi suất: ");
        float interestRate = sc.nextFloat();
        System.out.print("nhập số tháng gửi: ");
        byte month = sc.nextByte();
        double profitAmount = 0;
        for (int i = 0; i < month; i++) {
            profitAmount +=  deposits * interestRate/12 * month;
        }
        System.out.println("số tiền lãi = " + profitAmount);
    }
}
