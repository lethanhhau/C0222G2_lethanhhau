package hau.case_study_furama_resort.model.facility_model;

import java.util.Scanner;

public class Vila extends Facility{
    private static final String COMMA = ",";
    private String roomStandard;
    private Double swimmingPoolArea;
    private Integer numberOfFloors;

    public Vila() {
    }

    public Vila(String roomStandard, Double swimmingPoolArea, Integer numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Vila(String servicceCode,String serviceName, String usableArea, Integer rentalCosts, Integer maximumPerson, String rentalType,
                String roomStandard, Double swimmingPoolArea, Integer numberOfFloors) {
        super(servicceCode,serviceName, usableArea, rentalCosts, maximumPerson, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(Double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
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
                ", swimmingPoolArea= " + swimmingPoolArea +
                ", numberOfFloors= " + numberOfFloors ;
    }
    public String getInfoVila(){
        return super.getInfoFacility() + COMMA + this.getRoomStandard() + COMMA + this.getSwimmingPoolArea() + COMMA +
                this.getNumberOfFloors();
    }
}
