package module2.ss7_abstract_class_interface.thuc_hanh.ss3_interface_comparator;

import module2.ss6_inheritance.thuc_hanh.geometry.S2Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<S2Circle> {

    @Override
    public int compare(S2Circle c1, S2Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
