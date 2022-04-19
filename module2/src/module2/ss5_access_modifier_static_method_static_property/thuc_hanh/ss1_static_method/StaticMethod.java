package module2.ss5_access_modifier_static_method_static_property.thuc_hanh.ss1_static_method;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
