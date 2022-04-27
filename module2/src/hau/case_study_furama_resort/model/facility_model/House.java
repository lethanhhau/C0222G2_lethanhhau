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

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter serviceCode: ");
        String serviceCode = scanner.nextLine();
        System.out.print("enter serviceName: ");
        String serviceName = scanner.nextLine();
        System.out.print("enter usableArea: ");
        String usableArea = scanner.nextLine();
        System.out.print("enter rentalCosts: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.print("enter maximumPerson: ");
        int maximumPerson = Integer.parseInt(scanner.nextLine());
        System.out.print("enter rentalType: ");
        String rentalType = scanner.nextLine();
        System.out.print("enter roomStandard: ");
        String roomStandard = scanner.nextLine();
        System.out.print("enter numberOfFloors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
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
