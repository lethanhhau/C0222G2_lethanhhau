package module2.ss3_array_and_method.bai_tap;

//Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông.

public class SS7SumOfDiagonals {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 9, 4},
                {3, 6, 8, 2},
                {6, 8, 4, 2},
                {9, 6, 4, 8}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        int j = 0;
        int sum2 = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum2 += arr[i][j];
            j++;
        }
        System.out.println("tổng đường chéo 1 = " + sum);
        System.out.println("tổng đường chéo 2 = " + sum2);
    }
}
