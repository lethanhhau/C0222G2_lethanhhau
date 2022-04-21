package module2.ss15_exception_handling_and_debug.thuc_hanh.ss2_class_exception;

import java.util.Random;

public class Main {

        public Integer[] createRandom() {
            Random rd = new Random();
            Integer[] arr = new Integer[100];
            System.out.println("Danh sách phần tử của mảng: " );
            for (int i = 0; i < 100; i++) {
                arr[i] = rd.nextInt(100);
                System.out.print(arr[i]+ " ");
            }
            return arr;
    }
}
