package module2.ss4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chiều dài widht:");
        double width = sc.nextDouble();
        System.out.print("nhập chiều cao hieght:");
        double hieght = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,hieght);
        System.out.println("Your S3Rectangle"+ rectangle.display());

    }
}
