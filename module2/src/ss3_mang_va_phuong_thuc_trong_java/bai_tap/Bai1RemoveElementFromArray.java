package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;
//xóa phần tử khỏi mảng.

public class Bai1RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần xoá X:");
        int x = sc.nextInt();
        int viTriCanXoa = timViTri(arr, x);
        if (viTriCanXoa == -1) {
            System.out.print("Phần tử không có trong mảng");
        } else {
            arr = xoaMotPhanTu(arr, viTriCanXoa);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int timViTri(int[] arr, int number) {
        int viTri = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                viTri = i;
            }
        }
        return viTri;
    }

    static int[] xoaMotPhanTu(int[] arr, int viTri) {
        int[] daySoMoi = new int[arr.length - 1];
        for (int i = 0; i < viTri; i++) {
            daySoMoi[i] = arr[i];
        }
        for (int i = viTri + 1; i < arr.length; i++) {
            daySoMoi[i - 1] = arr[i];
        }
        return daySoMoi;
    }
}
