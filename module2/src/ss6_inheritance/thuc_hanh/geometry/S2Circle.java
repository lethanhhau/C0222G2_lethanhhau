package ss6_inheritance.thuc_hanh.geometry;

public class S2Circle extends S1Shape {
    public double radius = 1.0;
    public S2Circle(){

    }
    public S2Circle(Double radius){
        this.radius = radius;
    }
    public S2Circle(Double radius,String color,boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (this.radius*this.radius)*Math.PI;
    }
    public double getPerimeter(){
        return (2*this.radius)*Math.PI;
    }

    @Override
    public String toString() {
        return "S2Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", darius=" + radius +
                '}';
    }
}
