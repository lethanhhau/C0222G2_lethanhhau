package extra_exercises.model;

import java.util.Scanner;

public class Motorcycle extends Transport {
    private double wattage;

    public Motorcycle(){

    }

    public Motorcycle(double wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(String seaOfControl, String manufacturersName, int yearOfManufacture, String owner, double wattage) {
        super(seaOfControl, manufacturersName, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter seats number: ");
        this.wattage = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                super.toString() +
                "wattage=" + wattage +
                '}';
    }

}
