package module2.ss15_exception_handling_and_debug.bai_tap.ss1_i_llegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
    Scanner scanner = new Scanner(System.in);
    private Integer a;
    private Integer b;
    private Integer c;

    public Triangle(){
    }

    public Triangle(Integer a, Integer b, Integer c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("a||b||c < 0");
        } else if (a + b <= c) {
            throw new IllegalTriangleException("a + b < c");
        } else if (b + c <= a) {
            throw new IllegalTriangleException("b + c < a");
        } else if (a + c <= b) {
            throw new IllegalTriangleException("a + c < b");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "scanner=" + scanner +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
