package ss10_list.bai_tap.array_list;

import java.util.ArrayList;
import java.util.List;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student(){

        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1,"nam");
        Student b = new Student(2,"hau");
        Student c = new Student(3,"hoan");
        Student d = new Student(4,"phong");
        Student e = new Student(5,"phuong");
        Student f = new Student(6,"tai");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>(); // khai báo 1 arrayList mới

        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(3,f);
        studentMyArrayList.size();
        System.out.println(studentMyArrayList.size()); //in ra size
        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println(studentMyArrayList.indexOf(b));
        System.out.println(studentMyArrayList.contains(c));

        newMyArrayList  =studentMyArrayList.clone();
        newMyArrayList.remove(2);// xóa phần tử

        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());

        }


//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student student =(Student) studentMyArrayList.elements[i];
//            System.out.print(student.getId());
//            System.out.println(student.getName());
//        }
    }
}
