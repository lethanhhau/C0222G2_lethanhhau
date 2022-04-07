package ss6_inheritance.thuc_hanh.geometry;

public class S2Circle extends S1Shape {
    public double darius = 1.0;
    public S2Circle(){

    }
    public S2Circle(Double darius){
        this.darius = darius;
    }
    public S2Circle(Double darius,String color,boolean filled){
        super(color, filled);
        this.darius = darius;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }
    public double getarea(){
        return (this.darius*this.darius)*Math.PI;
    }
    public double getPerimeter(){
        return (2*this.darius)*Math.PI;
    }

    @Override
    public String toString() {
        return "S2Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", darius=" + darius +
                '}';
    }
}
