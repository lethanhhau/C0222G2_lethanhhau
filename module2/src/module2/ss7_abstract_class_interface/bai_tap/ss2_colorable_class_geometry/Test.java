package module2.ss7_abstract_class_interface.bai_tap.ss2_colorable_class_geometry;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] =  new Square();
        for (Shape shap:shapes){
            System.out.println(shap);
            System.out.println(shap.howToColor());
        }
    }
}
