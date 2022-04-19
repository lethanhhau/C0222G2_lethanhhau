package module2.ss3_array_and_method.bai_tap;
//Đếm số lần xuất hiện của ký tự trong chuỗi.

import java.util.Scanner;

public class SS8CountOccurrences {
    public static void main(String[] args) {
        String str = "abcabdbesbf";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập ký tự muốn đếm:");
        char characters = sc.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (characters == str.charAt(i)){
                count++;
            }
        }
        System.out.println("số lần xuất hiện của "+ characters +" trong chuỗi là "+ count);
    }
}
