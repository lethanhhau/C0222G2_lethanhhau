package hau.case_study_furama_resort.model.facility_model;

import java.util.Scanner;

public class Vila extends Facility{
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

    public Vila(String servicceCode,String serviceName, String usableArea, Double rentalCosts, Integer maximumPerson, String rentalType,
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

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter serviceCode: ");
        String serviceCode = scanner.nextLine();
        System.out.print("enter serviceName: ");
        String serviceName = scanner.nextLine();
        System.out.print("enter usableArea: ");
        String usableArea = scanner.nextLine();
        System.out.print("enter rentalCosts: ");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.print("enter maximumPerson: ");
        int maximumPerson = Integer.parseInt(scanner.nextLine());
        System.out.print("enter rentalType: ");
        String rentalType = scanner.nextLine();
        System.out.print("enter roomStandard: ");
        String roomStandard = scanner.nextLine();
        System.out.print("enter swimmingPoolArea: ");
        Double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        System.out.print("enter numberOfFloors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", roomStandard= " + roomStandard +
                ", swimmingPoolArea= " + swimmingPoolArea +
                ", numberOfFloors= " + numberOfFloors ;
    }
}
