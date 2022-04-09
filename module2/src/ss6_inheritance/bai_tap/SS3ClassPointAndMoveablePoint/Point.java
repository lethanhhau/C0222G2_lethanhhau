package ss6_inheritance.bai_tap.SS3ClassPointAndMoveablePoint;

import java.util.Arrays;

public class Point {
    public float x;
    public float y;
    public Point(){

    }

    public Point(float x, float y) {
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
        this.y = y;
    }
    public float[] getXY(){
        float[] array = {this.x,this.y};
        return array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", array=" + Arrays.toString(getXY()) +
                '}';
    }
}
