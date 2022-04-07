package ss5_access_modifier_static_method_static_property.thuc_hanh.SS1StaticMethod;

public class main {

    public static final StaticMethod S1 = new StaticMethod(111, "Hoang");

    public static void main(String args[]) {
        StaticMethod.change();

        StaticMethod S1 = new StaticMethod(111, "Khanh");
        StaticMethod s2 = new StaticMethod(222, "Khanh");
        StaticMethod s3 = new StaticMethod(333, "Nam");
        S1.display();
        s2.display();
        s3.display();
    }
}
