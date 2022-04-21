package module2.ss15_exception_handling_and_debug.bai_tap.ss1_i_llegal_triangle_exception;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        while (check) {
            System.out.println();
            System.out.print("Enter a : ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Enter b : ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.print("Enter c : ");
            int c = Integer.parseInt(sc.nextLine());
            try {
                Triangle triangle = new Triangle(a, b, c);
                System.out.println(triangle);
                check = false;
            } catch (IllegalTriangleException e) {
                check = true;
                e.printStackTrace();
            }
        }
    }
}
