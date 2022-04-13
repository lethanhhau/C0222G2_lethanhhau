package ss7_abstract_class_interface.bai_tap.ss1_resizeable_class_geometry;

public abstract class Shape implements Resizeable  {
    public String color = "green";
    public boolean filled = true;
    public Shape(){

    }

    public Shape(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    @Override
    public void resize(double percent) {

    }
}
