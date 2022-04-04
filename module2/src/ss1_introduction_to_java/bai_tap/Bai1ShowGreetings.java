package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;
//Hiển thị lời chào.

public class Bai1ShowGreetings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("hello "+ name);
    }
}
