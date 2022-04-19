package module2.ss7_abstract_class_interface.bai_tap.ss1_resizeable_class_geometry;

public class S3Rectangle extends Shape {
    public double width =1.0;
    public double length =1.0;
    public S3Rectangle(){

    }
   public S3Rectangle(double width, double length){
        this.width = width;
        this.length = length;
   }
   public S3Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
   }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "S3Rectangle{" +
                "width=" + width +
                ", length=" + length + "\n" +
                super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width *= percent;
        this.length *= percent;
    }

}
