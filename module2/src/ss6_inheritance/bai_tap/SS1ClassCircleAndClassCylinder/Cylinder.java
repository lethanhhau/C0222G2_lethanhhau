package ss6_inheritance.bai_tap.SS1ClassCircleAndClassCylinder;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(){

    }
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*Math.pow(radius,2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
