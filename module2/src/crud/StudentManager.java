package crud;

import java.util.Scanner;

public class StudentManager {
    Student[] students = new Student[100];

    public void add() {
        Student student = new Student();
        student.inPut();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                student.setId(i);
                students[i] = student;
                break;
            }
        }
    }

    public void display() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            } else {
                break;
            }
        }
    }

    public void edit() {
        boolean flag = false;
        System.out.print("Enter id  edit: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && (students[i].getId() == id)) {
                students[i].inPut();
                flag = true;
                break;

            }
        }
        if (!flag) {
            System.out.println("ID " + " not found!" + id);
        }
    }

    public void delete() {
        System.out.print("Enter id delete: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        int index = -1;
        boolean check = false;
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i].getId() == id) {
                index = i;
                check = true;
                break;

            }
        }
        if (check){
            for (int i = index; i < students.length-1; i++) {
                students[i] = students[i+1];
            }
        }else {
            System.out.println(id + "not found!");
        }
    }

    public void search() {
        boolean flag = false;
        System.out.print("Enter name Search: ");
        String nameSearch = new Scanner(System.in).nextLine();
        Student[] sea = new Student[100];
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equalsIgnoreCase(nameSearch)) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            for (int i = 0; i < students.length; i++) {
                if (students != null) {
                    if (students[i].getName().equalsIgnoreCase(nameSearch)) {
                        if (sea[i] == null){
                            sea[i]= students[i];
                        }
                    }
                }
            }
            for (int i = 0; i < sea.length; i++) {
                if (sea[i]!= null){
                    System.out.println(sea.toString());
                }
            }
        }else {
            System.out.println(nameSearch + "not found!");
        }
    }
}
