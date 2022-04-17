package extra_exercises.model;

import java.util.Scanner;

public class Truck extends Transport {
    private double tonnage;

    public Truck(){

    }

    public Truck(double tonnage){
        this.tonnage = tonnage;
    }

    public Truck(String seaOfControl, String manufacturersName, int yearOfManufacture, String owner, double tonnage) {
        super(seaOfControl, manufacturersName, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter seats number: ");
        this.tonnage = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "tonnage=" + tonnage +
                '}';
    }
}
