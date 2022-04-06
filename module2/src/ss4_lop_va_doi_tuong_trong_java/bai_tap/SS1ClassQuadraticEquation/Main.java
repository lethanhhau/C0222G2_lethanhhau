package ss4_lop_va_doi_tuong_trong_java.bai_tap.SS1ClassQuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap c: ");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation qe = new QuadraticEquation(a,b,c);

        if (qe.getDiscriminant() > 0) {
            System.out.println(qe.getRoot1());
            System.out.println(qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println(qe.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
