package module2.ss12_java_collection_framework.thuc_hanh.ss3_sort_comparable_and_omparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("hau",20,"qn");
        Student student1 = new Student("phuong",16,"dn");
        Student student2 = new Student("hoan",12,"dn");
        Student student3 = new Student("luan",18,"dn");
        Student student4= new Student("tai",15,"dn");

        List<Student>students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        Collections.sort(students);
        for (Student st:students) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(students,ageComparator);
        System.out.println("so sanh theo tuoi");
        for (Student st:students) {
            System.out.println(st.toString());
        }
    }
}
