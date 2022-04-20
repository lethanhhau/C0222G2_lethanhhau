package module2.ss14_sort_algorithm.bai_tap.ss1_insertion_sort_algorithm;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] array = {2, 8, 6, 3, 9,1,5};
        insertionSort(array);
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            System.out.println("lần thứ "+ i + Arrays.toString(array));
        }
    }
}

