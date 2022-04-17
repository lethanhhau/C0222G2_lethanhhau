package extra_exercises.service;

import extra_exercises.model.Car;
import extra_exercises.model.Motorcycle;
import extra_exercises.model.Truck;
import extra_exercises.model.Transport;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TransportManager implements IService {
    private ArrayList<Transport> transports = new ArrayList<>();
    {
        Transport car1 = new Car("36b1-10805", "vinfat", 2022, "le thanh hau", 4, "du lich");
        Transport car2 = new Car("36M2-19001", "toyota", 1995, "hoang", 16, "xe khách");
        Transport car3 = new Car("30N1-18469", "mercedes", 2000, "le thanh", 4, "xe cá nhân");
        Transport truck1 = new Truck("29G5-18464", "howo", 2003, "hoan", 2500);
        Transport truck2 = new Truck("43F1-11862", "huyndai", 2010, "phuong", 5000);
        Transport motorcycle1 = new Motorcycle("43F1-11862", "honda", 2010, "tai", 135);
        Transport motorcycle2 = new Motorcycle("43F1-11862", "yamaha", 2010, "tri", 150);

        transports.add(car1);
        transports.add(car2);
        transports.add(car3);
        transports.add(truck1);
        transports.add(truck2);
        transports.add(motorcycle1);
        transports.add(motorcycle2);
    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean check = true;
        do {
            System.out.println(
                    "1. Add car" + "\n" +
                    "2. Add truck" + "\n" +
                    "3. Add motorcycle" + "\n" +
                    "0. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Transport newCar = new Car();
                    newCar.input();
                    transports.add(newCar);
                    break;
                case 2:
                    Transport newTruck = new Truck();
                    newTruck.input();
                    transports.add(newTruck);
                    break;
                case 3:
                    Transport newMotorcycle = new Motorcycle();
                    newMotorcycle.input();
                    transports.add(newMotorcycle);
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    break;
            }
        } while (check);

    }

    @Override
    public void display() {

        Scanner sc = new Scanner(System.in);
        int choice;
        boolean check = true;
        do {
            System.out.println(
                    "1. Display car" + "\n" +
                    "2. Display truck" + "\n" +
                    "3. Display motorcycle" + "\n" +
                    "0. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (Transport transport : transports) {
                        if (transport instanceof Car) {
                            System.out.println(transport);
                        }
                    }
                    break;
                case 2:
                    for (Transport transport : transports) {
                        if (transport instanceof Truck) {
                            System.out.println(transport);
                        }
                    }
                    break;
                case 3:
                    for (Transport transport : transports) {
                        if (transport instanceof Motorcycle) {
                            System.out.println(transport);
                        }
                    }
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    break;
            }
        } while (check);
    }
    @Override
    public void delete() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sea Of Control: ");
        String seaOfControl = sc.nextLine();
        boolean check = false;
        int choice;
        for (int i = 0; i < transports.size(); i++) {
            if (seaOfControl.equalsIgnoreCase(transports.get(i).getSeaOfControl())) {
                check = true;
                break;
            }
        }
        if (check) {
            do {
                System.out.println("Do you want to delete transport with license plate: " + seaOfControl + "?");
                System.out.println("1. Yes" + "\n" +
                        "2. No");
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        for (int i = 0; i < transports.size(); i++) {
                            if (seaOfControl.equalsIgnoreCase(transports.get(i).getSeaOfControl())) {
                                transports.remove(i);
                                break;
                            }
                        }
                        System.out.println("Delete Success");
                        check = false;
                        break;
                    case 2:
                        System.out.println("Cancel");
                        check = false;
                        break;
                    default:
                        System.out.println("Choice Again");
                        break;
                }
            } while (check);
        } else {
            System.out.println("Sea Of Control " + seaOfControl + " is NOT found!");
        }
    }

    @Override
    public void search() {

        Scanner sc = new Scanner(System.in);
        boolean check = false;

        System.out.print("Enter license plate: ");
        String seaOfConTrol = sc.nextLine();

        for (int i = 0; i < transports.size(); i++) {
            if (transports.get(i).getSeaOfControl().contains(seaOfConTrol)) {
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < transports.size(); i++) {
                if (transports.get(i).getSeaOfControl().contains(seaOfConTrol)) {
                    System.out.println(transports.get(i));
                }
            }
        } else {
            System.out.println("Transports with license plate " + seaOfConTrol + " is NOT found!");
        }

    }
}

