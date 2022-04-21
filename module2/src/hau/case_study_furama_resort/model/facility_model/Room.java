package hau.case_study_furama_resort.model.facility_model;

import java.util.Scanner;

public class Room extends Facility{
    private String freeServiceAttached;

    public Room() {
    }

    public Room(String freeServiceAttached) {
        this.freeServiceAttached = freeServiceAttached;
    }

    public Room(String serviceName, String usableArea, Double rentalCosts, Integer maximumPerson, String rentalType,
                String freeServiceAttached) {
        super(serviceName, usableArea, rentalCosts, maximumPerson, rentalType);
        this.freeServiceAttached = freeServiceAttached;
    }

    public String getFreeServiceAttached() {
        return freeServiceAttached;
    }

    public void setFreeServiceAttached(String freeServiceAttached) {
        this.freeServiceAttached = freeServiceAttached;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
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
        System.out.print("enter freeServiceAttached: ");
        String freeServiceAttached = scanner.nextLine();
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", freeServiceAttached=" + freeServiceAttached;
    }
}
