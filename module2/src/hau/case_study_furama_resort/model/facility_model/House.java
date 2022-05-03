package hau.case_study_furama_resort.model.facility_model;

import java.util.Scanner;

public class House extends Facility{
    private static final String COMMA = ",";
    private String roomStandard;
    private Integer numberOfFloors;

    public House() {
    }

    public House(String roomStandard, Integer numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceCode,String serviceName, String usableArea, Integer rentalCosts, Integer maximumPerson, String rentalType,
                 String roomStandard, Integer numberOfFloors) {
        super(serviceCode,serviceName, usableArea, rentalCosts, maximumPerson, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", roomStandard= " + roomStandard +
                ", numberOfFloors=" + numberOfFloors;
    }

    public String getInfoHouse(){
        return super.getInfoFacility() + COMMA + this.getRoomStandard() + COMMA + this.getNumberOfFloors();
    }
}
