package ss6_inheritance.bai_tap.SS2ClassPoint2DAndClassPoint3D;

import java.util.Arrays;

public class Point2D {
    public float x;
    public float y;
    public Point2D(){

    }
    public Point2D(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y =y;
    }
    public float[] getXY(){
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", arr " + Arrays.toString(this.getXY()) +
                '}';
    }
}
