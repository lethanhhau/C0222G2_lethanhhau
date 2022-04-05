package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
//Tính tổng các số ở một cột xác định.

import java.util.Scanner;

public class SS6SumNumbersInAColumn {
    public static void main(String[] args) {
        int[][]arr ={
                {2,4,5,6},
                {4,8,9,2},
                {6,9,2}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cột muốn tính tổng:");
        int j = sc.nextInt();
        int sum =0;
        for (int i = 0; i < arr[j].length; i++) {
            sum += arr[j][i];
        }
        System.out.println("tổng của cột "+ j +" = "+ sum);
    }
}
