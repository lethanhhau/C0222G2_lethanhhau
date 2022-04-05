package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;
//Tìm phần tử lớn nhất trong mảng hai chiều.


public class SS4LargestElement {
    public static void main(String[] args) {
        float[][] arr = {
                {6, 2, 7},
                {4, 6, 8, 5, 7},
                {2,4,9,8,}
        };
        float max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là:" + max);
    }
}
