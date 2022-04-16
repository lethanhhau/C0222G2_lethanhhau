package extra_exercises.model;

import extra_exercises.service.Transport;
import ss10_list.bai_tap.array_list.MyArrayList;

public class Car extends Transport {
    private int numberOfSeats;
    private String vehicleType;

    public Car(String seaOfControl, String manufacturersName, int yearOfManufacture, String owner, int numberOfSeats, int vehicleType){

    }
    public Car(int numberOfSeats,String vehicleType){
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public Car(String seaOfControl,String manufacturersName,int yearOfManufacture,String owner,int numberOfSeats
            ,String vehicleType){
        super(seaOfControl,manufacturersName,yearOfManufacture,owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + getNumberOfSeats() +
                ", vehicleType='" + getVehicleType() + '\'' +
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
