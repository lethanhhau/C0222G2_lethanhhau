package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
//Tìm giá trị nhỏ nhất trong mảng.

import java.util.Arrays;
import java.util.Scanner;

public class Bai5SmallestValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chiều dài mảng size =");
        int size = sc.nextInt();
        int[]arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("giá trị nhỏ nhất trong mảng là "+ min);
    }
}
