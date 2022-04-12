package crud;

public class Student extends Peson{
    private float poin;
    public Student(){

    }
    public Student(int id,String name,int age,float poin){
        super(id,name, age);
        this.poin = poin;
    }

    public float getPoin() {
        return poin;
    }

    public void setPoin(float poin) {
        this.poin = poin;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id ="+ getId() +
                ", name ="+getName() +
                ", age ="+getAge() +
                ", poin=" + poin +
                '}';
    }
}
