package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double widht, hieght;

    public Rectangle() {
    }

    public Rectangle(double widht, double hieght) {
        this.widht = widht;
        this.hieght = hieght;
    }

    public double getArea() {
        return this.widht * this.hieght;
    }

    public double getPerimeter() {
        return (this.widht + this.hieght) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + widht + ", height=" + hieght + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chiều dài widht:");
        double width = sc.nextDouble();
        System.out.print("nhập chiều cao hieght:");
        double hieght = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,hieght);
        System.out.println("Your Rectangle"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());

    }
}

