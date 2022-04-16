package extra_exercises.model;

import extra_exercises.service.Transport;

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
    public String toString() {
        return "Truck{" +
                "tonnage=" + tonnage +
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
