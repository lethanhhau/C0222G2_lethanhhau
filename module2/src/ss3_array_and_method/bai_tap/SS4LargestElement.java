package ss3_array_and_method.bai_tap;

//Tìm phần tử lớn nhất trong mảng hai chiều.


public class SS4LargestElement {
    public static void main(String[] args) {
        int[][] arr = {
                {6, 2, 7},
                {4, 6, 8, 5, 7},
                {2, 4, 9, 8, 10}
        };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là:" + max);
    }
}
