package module2.ss6_inheritance.bai_tap.ss3_class_point_and_moveable_point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(3.4f,6.2f);
        System.out.println(point.toString());

        MoveablePoint moveablePoint = new MoveablePoint(2.3f,5.4f,6.2f,6.8f);
        System.out.println(moveablePoint.toString());


        System.out.println(moveablePoint.Move());
    }
}
