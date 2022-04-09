package ss6_inheritance.bai_tap.SS1ClassCircleAndClassCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4,"red");
        System.out.println(circle);
        System.out.println("Acreage = "+circle.getAcreage());
        System.out.println("++++++++++++++++++++++++++++++++");

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3,"black",5);
        System.out.println(cylinder);
        System.out.println("Acreage = "+cylinder.getAcreage());
        System.out.println("Volume = "+cylinder.getVolume());
    }
}
