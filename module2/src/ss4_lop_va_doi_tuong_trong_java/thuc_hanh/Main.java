package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chiều dài widht:");
        double width = sc.nextDouble();
        System.out.print("nhập chiều cao hieght:");
        double hieght = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,hieght);
        System.out.println("Your Rectangle"+ rectangle.display());

    }
}
