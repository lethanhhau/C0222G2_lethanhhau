package ss2_loop.thuc_hanh;

import java.util.Scanner;
//Kiểm tra số nguyên tố.

public class SS1CheckingForPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần kiểm tra: ");
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print(number + " là số nguyên tố");
        } else {
            System.out.print(number + " không phải số nguyên tố");
        }
    }
}
