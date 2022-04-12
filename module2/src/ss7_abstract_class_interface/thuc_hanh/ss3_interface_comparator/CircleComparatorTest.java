package ss7_abstract_class_interface.thuc_hanh.ss3_interface_comparator;

import ss6_inheritance.thuc_hanh.geometry.S2Circle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        S2Circle[] S2Circle = new S2Circle[3];
        S2Circle[0] = new S2Circle(3.6);
        S2Circle[1] = new S2Circle();
        S2Circle[2] = new S2Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (S2Circle circle : S2Circle) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(S2Circle, circleComparator);

        System.out.println("After-sorted:");
        for (S2Circle circle : S2Circle) {
            System.out.println(circle);
        }
    }
}
