package module2.ss7_abstract_class_interface.bai_tap.ss1_resizeable_class_geometry;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new S2Circle();
        shapes[1] = new S3Rectangle();
        System.out.println("before: \n " + Arrays.toString(shapes));
        for (Shape shap : shapes) {
            if (shap != null) {
                shap.resize((int) (Math.random() * 100));
            }
        }
        System.out.println("After: \n" + Arrays.toString(shapes));
    }
}
