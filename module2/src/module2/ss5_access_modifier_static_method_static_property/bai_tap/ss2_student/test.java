package module2.ss5_access_modifier_static_method_static_property.bai_tap.ss2_student;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("hau");
        student.setClas("C0222G2");
        System.out.println(student.getName() + student.getClas());
    }

}
