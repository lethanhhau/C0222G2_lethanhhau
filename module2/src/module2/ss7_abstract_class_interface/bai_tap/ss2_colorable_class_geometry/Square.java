package module2.ss7_abstract_class_interface.bai_tap.ss2_colorable_class_geometry;

public class Square extends Rectangle implements Colorable {
    public Square(){

    }
    public Square(double zide){
        super(zide,zide);
    }
    public Square(double zide, String color, boolean filled){
        super(zide,zide,color,filled);
    }
    public double getZide(){
        return this.getWidth();
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

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
