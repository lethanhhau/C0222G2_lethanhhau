package ss10_list.bai_tap.linked_list;

public class TestLinkedList<E> {
    public static void main(String[] args) {
        class Student{
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"hau");
        Student student2 = new Student(2,"phuong");
        Student student3 = new Student(3,"hoan");
        Student student4 = new Student(4,"hoa");
        Student student5 = new Student(5,"tai");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(0,student4);
        myLinkedList.addFirst(student5);

//        myLinkedList.remove(2);//xóa tại vị trí
//        myLinkedList.remove(student2);//xóa đối tượng

        System.out.println(myLinkedList.constrains(student2));

        System.out.println(myLinkedList.indexOf(student1));

        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(((Student) myLinkedList.get(i)).getName());
        }
    }

}
