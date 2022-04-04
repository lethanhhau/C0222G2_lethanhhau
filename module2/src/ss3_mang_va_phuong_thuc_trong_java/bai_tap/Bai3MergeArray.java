package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
// gộp mảng

import java.util.Scanner;

public class Bai3MergeArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = new int[2];
        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int j =0;j<arr1.length;j++){
            arr1[j] = sc.nextInt();
        }
        for (int i =0;i< arr.length;i++){
            arr2[i] = arr[i];
        }
        for (int i =0;i<arr1.length;i++){
            arr2[arr.length] = arr1[i];
            arr2[arr.length] ++;
        }
        System.out.print(arr2);
    }
}
