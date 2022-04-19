package module2.ss2_loop.bai_tap;

import java.util.Scanner;
//Hiển thị các loại hình.

public class SS1ShowTypes {
    public static void main(String[] args) {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu chọn hình");
            System.out.println("1.Hình chữ nhật");
            System.out.println("2.Hình tam giác vuông,có cạnh góc vuông ở top-left");
            System.out.println("3.Hình tam giác vuông,có cạnh góc vuông ở top-right");
            System.out.println("4.Hình tam giác vuông,có cạnh góc vuông ở botton-left");
            System.out.println("5.Hình tam giác vuông,có cạnh góc vuông ở botton-right");
            System.out.println("6.Hình tam giác cân");
            System.out.println("0.Exit");
            System.out.print("Nhập sự lựa chọn:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i == 1 && j == 0
                                    || i == 2 && (j != 2 && j != 3 && j != 4)
                                    || i == 3 && (j != 3 && j != 4)
                                    || i == 4 && j != 4) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i == 0 && j != 4 || i == 1 && (j != 3 && j != 4)
                                    || i == 2 && (j != 2 && j != 3 && j != 4)
                                    || i == 3 && j == 0) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 9; j++) {
                            if (i == 0 && j != 4 || i == 1 && (j != 3 && j != 4 && j != 5)
                                    || i == 2 && (j != 2 && j != 3 && j != 4 && j != 5 && j != 6)
                                    || i == 3 && (j != 1 && j != 2 && j != 3 && j != 4 && j != 5 && j != 6 && j != 7)) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
            }
            while (choice != 0) ;
    }
}
