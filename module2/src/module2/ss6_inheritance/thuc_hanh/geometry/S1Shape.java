package module2.ss6_inheritance.thuc_hanh.geometry;

public abstract class S1Shape {
    public String color = "green";
    public boolean filled = true;
    public S1Shape(){

    }

    public S1Shape(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public S1Shape(String color, boolean filled){
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

}
