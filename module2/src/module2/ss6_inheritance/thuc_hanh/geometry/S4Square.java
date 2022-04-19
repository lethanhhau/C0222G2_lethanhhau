package module2.ss6_inheritance.thuc_hanh.geometry;

public class S4Square extends S3Rectangle {
    public S4Square(){

    }
    public S4Square(double zide){
        super(zide,zide);
    }
    public S4Square(double zide,String color,boolean filled){
        super(zide,zide,color,filled);
    }
    public double getZide(){
        return this.width;
    }
    public void setZide(double zide){
        setWidth(zide);
        setLength(zide);
    }
    @Override
    public void setWidth(double width) {
        setZide(width);
    }

    @Override
    public void setLength(double length) {
        setZide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getZide()
                + ", which is a subclass of "
                + super.toString();
    }
}
