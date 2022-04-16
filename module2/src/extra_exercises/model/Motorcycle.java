package extra_exercises.model;

import extra_exercises.service.Transport;

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
    public String toString() {
        return "Motorcycle{" +
                "wattage=" + wattage +
                '}';
    }

    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
