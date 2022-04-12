package crud;

import java.util.Scanner;

public class Peson {
    private int id;
    private String name;
    private int age;
    public Peson(){

    }

    public Peson(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void goToBy(){
        System.out.println("đi bộ");
    }
    public void inPut(){

        System.out.print("Enter name: ");
        this.name = (new Scanner(System.in).nextLine());
        System.out.print("Enter age: ");
        this.age = Integer.parseInt(new Scanner(System.in).nextLine());
    }

    @Override
    public String toString() {
        return "Peson{" +
                "id= '" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
