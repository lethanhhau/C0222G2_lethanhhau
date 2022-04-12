package ss6_inheritance.bai_tap.ss2_class_point2D_and_class_point3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(5.5f, 6.6f);
        System.out.println(point2D.toString());
        System.out.println("++++++++++++++++++++++++++++");

        Point3D point3D = new Point3D();
        point3D = new Point3D(3.2f,4.1f,5.2f);
        System.out.println(point3D.toString());
        for (float arr: point3D.getXYZ()) {
            System.out.println(arr);
        }
    }
}
