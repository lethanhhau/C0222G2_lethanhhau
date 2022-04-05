package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
// gộp mảng

import java.util.Arrays;
import java.util.Scanner;

public class SS3MergeArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = new int[2];
        int[] arr2 = new int[arr.length + arr1.length];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("mảng arr =" + Arrays.toString(arr));
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = sc.nextInt();
        }
        System.out.println("mảng arr1 =" + Arrays.toString(arr1));
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            count++;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[count] = arr1[i];
            count++;
        }
        System.out.println("mảng arr + arr1 = " + Arrays.toString(arr2));
    }
}
