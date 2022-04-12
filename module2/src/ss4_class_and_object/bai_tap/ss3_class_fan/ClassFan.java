package ss4_class_and_object.bai_tap.ss3_class_fan;

public class ClassFan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blu";

    public ClassFan() {

    }

    public ClassFan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean geton() {
        return on;
    }

    public void seton(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

        @Override
    // tostring là 1 method (phương thức) dùng để in.
    public String toString() {
        String Fan = "";
        if (this.on) {
            Fan += "fan is on ";
            Fan += ("Speed: " + this.speed);
        } else {
            Fan += "fan is off ";
        }
        Fan += (" Color: " + this.color);
        Fan += (" Radius: " + this.radius);
        return Fan;
    }
}

