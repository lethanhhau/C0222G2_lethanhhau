package ss5_access_modifier_static_method_static_property.bai_tap.ss1_access_modifier;

 public class Circle {
    private double radius =1;
    private String color = "red";
    final double PI =3.14;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
   private double getRadius(){
        return this.radius;
   }
   public double getArea(){
        return (radius*radius)*PI;
   }
}
