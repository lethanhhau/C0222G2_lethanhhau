package extra_exercises.model;

import java.util.ArrayList;
import java.util.Scanner;

public class TransportManager {

   public class ArrayCar{
   private ArrayList<Car> cars = new ArrayList<>();

   public ArrayList<Car> addCar(Scanner scanner) {
      System.out.print("Enter seaOfControl: ");
      String seaOfControl = scanner.nextLine();

      System.out.print("Enter manufacturersName: ");
      String manufacturersName = scanner.nextLine();

      System.out.print("Enter yearOfManufacture: ");
      int yearOfManufacture = Integer.parseInt(scanner.nextLine());

      System.out.print("Enter owner: ");
      String owner = scanner.nextLine();

      System.out.print("Enter numberOfSeats: ");
      int numberOfSeats = Integer.parseInt(scanner.nextLine());

      System.out.print("Enter vehicleType: ");
      int vehicleType = Integer.parseInt(scanner.nextLine());

      Car car = new Car(seaOfControl,manufacturersName,yearOfManufacture,owner,numberOfSeats,vehicleType);
     cars.add(car);
     return cars;
   }
   }

   public class ArrayTruck{
   public void addTruck(Scanner scanner) {
      System.out.print("Enter seaOfControl: ");
      String seaOfControl = scanner.nextLine();

      System.out.print("Enter manufacturersName: ");
      String manufacturersName = scanner.nextLine();

      System.out.print("Enter yearOfManufacture: ");
      int yearOfManufacture = Integer.parseInt(scanner.nextLine());

      System.out.print("Enter owner: ");
      String owner = scanner.nextLine();

      System.out.print("Enter tonnage: ");
      double tonnage = Double.parseDouble(scanner.nextLine());

   }
   }

   public Motorcycle addMotorcycle(Scanner scanner) {
      System.out.print("Enter seaOfControl: ");
      String seaOfControl = scanner.nextLine();

      System.out.print("Enter manufacturersName: ");
      String manufacturersName = scanner.nextLine();

      System.out.print("Enter yearOfManufacture: ");
      int yearOfManufacture = Integer.parseInt(scanner.nextLine());

      System.out.print("Enter owner: ");
      String owner = scanner.nextLine();

      System.out.print("Enter wattage: ");
      double wattage = Double.parseDouble(scanner.nextLine());

      return new Motorcycle(seaOfControl,manufacturersName,yearOfManufacture,owner,wattage);
   }


   }
