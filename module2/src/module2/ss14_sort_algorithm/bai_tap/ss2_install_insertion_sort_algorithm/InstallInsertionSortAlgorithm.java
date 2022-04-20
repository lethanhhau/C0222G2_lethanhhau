package module2.ss14_sort_algorithm.bai_tap.ss2_install_insertion_sort_algorithm;

import java.util.Arrays;

public class InstallInsertionSortAlgorithm {
    public static void main(String[] args) {
        int[]arr = {2,6,9,8,4,6,0,8,1};
        insertionSort(arr);
    }

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;

        }
        System.out.println(Arrays.toString(array));
    }
}
