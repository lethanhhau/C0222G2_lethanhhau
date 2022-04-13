package ss6_inheritance.thuc_hanh.geometry;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        S1Shape shape = new S1Shape() {
        };
        System.out.println(shape.toString());
        shape = new S1Shape("blue", true) {
        };
        System.out.println(shape.toString());
        System.out.println("============================================");

        S2Circle circle = new S2Circle();
        System.out.println(circle.toString());
        circle = new S2Circle(4.0,"red",false);
        System.out.println(circle.toString());
        System.out.println("Area = "+circle.getArea());
        System.out.println("Perimeter = "+circle.getPerimeter());
        System.out.println("============================================");

        S3Rectangle rectangle = new S3Rectangle();
        System.out.println(rectangle.toString());
        rectangle = new S3Rectangle(3.0,4.0,"black",true);
        System.out.println(rectangle.toString());
        System.out.println("Area = "+rectangle.getArea());
        System.out.println("Perimeter = "+rectangle.getPerimeter());
        System.out.println("============================================");

        S4Square square = new S4Square();
        System.out.println(square.toString());
        square = new S4Square(2.3);
        System.out.println(square.toString());
        System.out.println("Area = "+square.getArea());
        System.out.println("Perimeter = "+square.getPerimeter());
        square = new S4Square(5.5,"yellow",true);
        System.out.println(square.toString());
        System.out.println("Area = "+square.getArea());
        System.out.println("Perimeter = "+square.getPerimeter());
    }
}
