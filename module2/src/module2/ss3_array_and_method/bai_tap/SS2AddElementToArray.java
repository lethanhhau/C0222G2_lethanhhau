package module2.ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
//thêm phần tử vào mảng

public class SS2AddElementToArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập só cần chèn X:");
        int x = sc.nextInt();
        System.out.print("nhập vị trí muốn trèn index:");
        int viTri = sc.nextInt();
        if (viTri < 0 || viTri > arr.length - 1) {
            System.out.print("không chèn được phần tử vào mảng");
        } else {
            for (int i = arr.length-1; i>viTri; i--) {
                arr[i]= arr[i-1];
                }
            arr[viTri] = x;
            System.out.println(Arrays.toString(arr));
            }
    }
}
