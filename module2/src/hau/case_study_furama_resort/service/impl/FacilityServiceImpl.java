package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.model.facility_model.Facility;
import hau.case_study_furama_resort.model.facility_model.House;
import hau.case_study_furama_resort.model.facility_model.Room;
import hau.case_study_furama_resort.model.facility_model.Vila;
import hau.case_study_furama_resort.service.IFacilityService;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilities = new LinkedHashMap<Facility, Integer>();


    {

        facilities.put(new House("house1", "200m", 600d, 6,
                "theo năm", "3*", 2), 1);
        facilities.put(new House("house2", "300m", 800d, 8,
                "theo năm", "3*", 2), 2);
        facilities.put(new Room("room", "100m", 200d, 2, "theo giờ",
                "bữa sáng"), 4);
        facilities.put(new Room("rom1", "120m", 300d, 2, "theo giờ",
                "ăn sáng"), 5);
        facilities.put(new Vila("villa", "600m", 1800d, 12, "theo tháng",
                "4*", 120d, 1), 5);
        facilities.put(new Vila("vila1", "800m", 2000d, 15, "theo tháng",
                "5*", 200d, 1), 6);
    }

    @Override
    public void display() {
        Set<Facility> facilitySet = facilities.keySet();
        for (Facility i : facilitySet) {
            System.out.println(i);
        }
    }

    @Override
    public void add() {

    }



    @Override
    public void addHouse() {
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
        Vila vila = new Vila(serviceName, usableArea, rentalCosts, maximumPerson, rentalType, roomStandard,
                swimmingPoolArea, numberOfFloors);
        facilities.put(vila, 7);

    }

    @Override
    public void addRoom() {
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
        Room room = new Room(serviceName, usableArea, rentalCosts, maximumPerson, rentalType, freeServiceAttached);
        facilities.put(room, 0);
    }

    @Override
    public void addVila() {

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

        Vila vila = new Vila(serviceName, usableArea, rentalCosts, maximumPerson, rentalType, roomStandard, swimmingPoolArea,
                numberOfFloors);
        facilities.put(vila, 0);
    }

    @Override
    public void displayListFacilityMaintenance() {


    }


    @Override
    public void edit() {

    }

}
