package demo_has_a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Address address1 = new Address("10","hoang dieu");
        Address address2 = new Address("11","hoang");
        Address address3 = new Address("12","dieu");

        List<Address> addressList = new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);
        addressList.add(address3);
        while (true) {
            for (int i = 0; i < addressList.size(); i++) {
                System.out.println((i+1) + ": " + addressList.get(i));
            }

            System.out.print("Chon di: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    student.setAddress(addressList.get(choice-1));
                    System.out.println(student);
                    break;
                case 2:
                    student.setAddress(addressList.get(choice-1));
                    System.out.println(student);
                    break;
                case 3:
                    student.setAddress(addressList.get(choice-1));
                    System.out.println(student);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon lai");
                    break;
            }
        }
    }
}
