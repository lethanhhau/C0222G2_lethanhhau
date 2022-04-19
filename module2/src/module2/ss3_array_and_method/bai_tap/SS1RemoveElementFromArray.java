package module2.ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
//xóa phần tử khỏi mảng.

public class SS1RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 5;
        arr[3] = 9;
        arr[4] = 2;
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập X là số cần xóa:");
        int X = sc.nextInt();
        int index = -1;
        boolean check = false;
        for (int i =0;i< arr.length;i++){
            if (arr[i] == X){
                index = i;
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println(Arrays.toString(arr));
        }
        else {
            System.out.println(X + " không có trong mảng");
        }
    }
}

//cách 2: xóa phần tử khỏi mảng và trả về mảng mới có chiều dài = length -1;
   /* public static void main(String[] args) {
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
}*/
