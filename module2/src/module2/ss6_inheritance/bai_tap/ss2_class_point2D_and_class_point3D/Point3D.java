package module2.ss6_inheritance.bai_tap.ss2_class_point2D_and_class_point3D;

public class Point3D extends Point2D{
    public float z;
    public Point3D(){

    }
    public Point3D(float x,float y,float z){
        super(x, y);
        this.z =z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.x  =x;
        this.y  =y;
        this.z  =z;
    }
    public float[] getXYZ(){
        float[] arr = {this.x,this.y,this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
