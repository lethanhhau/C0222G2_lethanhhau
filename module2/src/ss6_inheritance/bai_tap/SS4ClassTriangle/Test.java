package ss6_inheritance.bai_tap.SS4ClassTriangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Enter c: ");
        double c = Double.parseDouble(sc.nextLine());
        System.out.print("Enter color: ");
        String color = sc.nextLine();

        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > c && (a + c) > b && (b + c > a)) {
                triangle.setSide1(a);
                triangle.setSide2(b);
                triangle.setSide3(c);
                triangle.setColor(color);
                System.out.println(triangle.toString());
                triangle.getArea();
                triangle.getPerimeter();

            }
            else {
                System.out.println("is not triangle");
            }
        }
    }
}
