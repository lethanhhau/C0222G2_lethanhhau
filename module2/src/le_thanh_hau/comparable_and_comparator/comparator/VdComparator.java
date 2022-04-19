package le_thanh_hau.comparable_and_comparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VdComparator {
        public static void main(String[] args) {
            // tạo danh sách sinh viên
            List<Student> listStudents = new ArrayList<Student>();
            // thêm sinh viên vào danh sách
            listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
            listStudents.add(new Student(2, "Hoa", 24, "Hanoi"));
            listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
            listStudents.add(new Student(4, "Quy", 22, "Hanoi"));

            // sắp xếp danh sách sinh viên theo tên
            System.out.println("sort list student by it's name ASC: ");
            Collections.sort(listStudents, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            //hiển thị danh sách sinh viên
            for (Student student : listStudents) {
                System.out.println(student.toString());
            }

            // sắp xếp danh sách sinh viên theo độ tuổi
            System.out.println("sort list student by it's age ASC: ");
            Collections.sort(listStudents, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getAge() > o2.getAge() ? 1 : -1;
                }
            });
            // hiển thị danh sách sinh viên
            for (Student student : listStudents) {
                System.out.println(student.toString());
            }
        }
    }

