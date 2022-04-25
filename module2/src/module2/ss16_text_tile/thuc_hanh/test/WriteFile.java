package module2.ss16_text_tile.thuc_hanh.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private final static String FILE_NAME = "src/module2/ss16_text_tile/thuc_hanh/test/data.csv";
    public static void main(String[] args) {
        // ghi 1 Sting vào file
//        String txt = "lê thanh hậu";
//        try {
//            FileWriter fileWriter = new FileWriter(FILE_NAME, false);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(txt);
//
//
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {

//        }

        //Ghi 1 Array vào file
//
//        String arr[] = {"le hau","tran phuong","van hoan"};
//        try {
//            FileWriter fileWriter = new FileWriter(FILE_NAME);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (String a:arr) {
//                bufferedWriter.write(a);
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            fileWriter.close();
//        }catch (Exception e){
//
//        }

        // ghi 1 đối tượng vài file

//        Student student = new Student("nguyễn văn A",20,7.5d);
//        try {
//            FileWriter  fileWriter = new FileWriter(FILE_NAME);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(student.toString());
//            bufferedWriter.close();
//            fileWriter.close();
//
//        }catch (Exception e){
//
//        }

        // ghi 1 mảng đối tượng vào file
        Student student1 = new Student("nguyễn văn A",20,7.5d);
        Student student2 = new Student("nguyễn văn B",21,9.5d);
        Student student3 = new Student("nguyễn văn C",22,5.5d);
        Student student4 = new Student("nguyễn văn D",23,7d);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        try {
            FileWriter  fileWriter = new FileWriter(FILE_NAME,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student a:students) {
                bufferedWriter.write(a.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        }catch (Exception e){

        }

    }
}
