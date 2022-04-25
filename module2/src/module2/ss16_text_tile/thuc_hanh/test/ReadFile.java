package module2.ss16_text_tile.thuc_hanh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    /**
     *  Đọc dữ liệu từ file bt
     */
    private final static String FILE_NAME = "src/module2/ss16_text_tile/thuc_hanh/ss2_find_the_maximum_value/numbers.csv";
//
//    public static void main(String[] args) {
//        Student student1 = new Student("nguyễn văn A", 20, 7.5d);
//        Student student2 = new Student("nguyễn văn B", 21, 9.5d);
//        Student student3 = new Student("nguyễn văn C", 22, 5.5d);
//        Student student4 = new Student("nguyễn văn D", 23, 7d);
//        List<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//
//        try {
//            FileReader fileReader = new FileReader(FILE_NAME);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = ",";
//            while (true) {
//                line = bufferedReader.readLine();
//                if (line == null) {
//                    break;
//                }
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//
//        }
//    }


    /**
     *  Đọc dữ liệu từ file và add vào list student
     * @return
     */



    public static void main(String[] args) {
        Student student1 = new Student("nguyễn văn A", 20, 7.5d);
        Student student2 = new Student("nguyễn văn B", 21, 9.5d);
        Student student3 = new Student("nguyễn văn C", 22, 5.5d);
        Student student4 = new Student("nguyễn văn D", 23, 7d);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }
}
