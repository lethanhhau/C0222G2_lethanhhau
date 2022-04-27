package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.validate.ValidateFacility;
import hau.case_study_furama_resort.common.validate.ValidateHouse;
import hau.case_study_furama_resort.common.validate.ValidateRoom;
import hau.case_study_furama_resort.common.validate.ValidateVila;
import hau.case_study_furama_resort.model.facility_model.Facility;
import hau.case_study_furama_resort.model.facility_model.House;
import hau.case_study_furama_resort.model.facility_model.Room;
import hau.case_study_furama_resort.model.facility_model.Vila;
import hau.case_study_furama_resort.service.IFacilityService;
import hau.case_study_furama_resort.util.WriteFile;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilities = new LinkedHashMap<Facility, Integer>();
    private static List<Facility> maintenancefacilities = new ArrayList<>();


    {

        facilities.put(new House("SVHO-1234 ", "house1", "200m", 600, 6,
                "theo năm", "3*", 2), 1);
        facilities.put(new Room("SVRO-8934 ", "room", "100m", 200, 2, "theo giờ",
                "bữa sáng"), 4);
        facilities.put(new Vila("SVVL-7932 ", "villa", "600m", 1800, 12, "theo tháng",
                "4*", 120d, 1), 5);

    }

    @Override
    public void display() {
        Set<Facility> facilitySet = facilities.keySet();
        for (Facility i : facilitySet) {
            System.out.println(i);
        }
    }

    @Override
    public void add(Facility facility) {
        Set<Facility> facilitySet = facilities.keySet();
        if (facilities.isEmpty()) {
            facilities.put(facility, 1);
        } else {
            boolean check = true;
            for (Facility key : facilitySet) {
                if (facility.equals(key)) {
                    maintenanceCheck(key);
                    facilities.put(key, facilities.get(key) + 1);
                    check = false;
                    break;
                }
            }
            if (check) {
                facilities.put(facility, 1);
            }
        }
    }

    @Override
    public void addHouse() {
        System.out.print("Enter service Code:");
        String serviceCode = scanner.nextLine();
        while (!ValidateHouse.isMatchesServiceCodeHouse(serviceCode)) {
            System.out.println("service code malformed!");
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter serviceName: ");
        String serviceName = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(serviceName)) {
            System.out.println("service name malformed!");
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }
        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!ValidateFacility.isMatchesAcrege(usableArea)) {
            System.out.println("usable Area malformed!");
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }
        System.out.print("enter rental Costs: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        String string = String.valueOf(rentalCosts);
        while (!ValidateFacility.isMatchesRentalCosts(string)) {
            System.out.println("rental costs malformed!");
            System.out.print("retype rental costs: ");
            string = scanner.nextLine();
        }
        System.out.print("enter maximumPerson: ");
        int maximumPerson = Integer.parseInt(scanner.nextLine());
        String maximumPersons = String.valueOf(maximumPerson);
        while (!ValidateFacility.isMatchesMaximumPerson(maximumPersons)) {
            System.out.println("maximum Person malformed!");
            System.out.print("retype  maximum Person: ");
            maximumPersons = scanner.nextLine();
        }

        System.out.print("enter rentalType: ");
        String rentalType = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(rentalType)) {
            System.out.println("Rental type malformed!");
            System.out.print("retype rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter room Standard: ");
        String roomStandard = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(roomStandard)) {
            System.out.println("room standard malformed!");
            System.out.print("retype room standard: ");
            roomStandard = scanner.nextLine();
        }

        System.out.print("enter number Of Floors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        String numberOfFloor = String.valueOf(numberOfFloors);
        while (!ValidateFacility.isMatchesNumberOfFloors(numberOfFloor)) {
            System.out.println("number of floors malformed!");
            System.out.print("retype number of floors: ");
            numberOfFloor = scanner.nextLine();
        }
        House house = new House(serviceCode, serviceName, usableArea, rentalCosts, maximumPerson, rentalType, roomStandard,
                numberOfFloors);
        facilities.put(house, null);

    }

    @Override
    public void addRoom() {
        System.out.print("Enter service Code: ");
        String serviceCode = scanner.nextLine();
        while (!ValidateRoom.isMatchesServiceCodeRoom(serviceCode)) {
            System.out.println("service code malformed!");
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter service Name: ");
        String serviceName = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(serviceName)) {
            System.out.println("service code malformed!");
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }
        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!ValidateFacility.isMatchesAcrege(usableArea)) {
            System.out.println("usable Area malformed!");
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }
        System.out.print("enter rental Costs: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        String string = String.valueOf(rentalCosts);
        while (!ValidateFacility.isMatchesRentalCosts(string)) {
            System.out.println("rental Costs malformed!");
            System.out.print("retype rental costs: ");
            string = scanner.nextLine();
        }
        System.out.print("enter maximum Person: ");
        int maximumPerson = Integer.parseInt(scanner.nextLine());
        String maximumPersons = String.valueOf(maximumPerson);
        while (!ValidateFacility.isMatchesMaximumPerson(maximumPersons)) {
            System.out.println("maximum Person malformed!");
            System.out.print("retype  maximum Person: ");
            maximumPersons = scanner.nextLine();
        }

        System.out.print("enter rental Type: ");
        String rentalType = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(rentalType)) {
            System.out.println("Rental type malformed!");
            System.out.print("retype Rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter freeServiceAttached: ");
        String freeServiceAttached = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, usableArea, rentalCosts, maximumPerson, rentalType, freeServiceAttached);
        facilities.put(room, null);
    }

    @Override
    public void addVila() {
        System.out.print("Enter serviceCode: ");
        String serviceCode = scanner.nextLine();
        while (!ValidateVila.isMatchesServiceCodeVila(serviceCode)) {
            System.out.println("service code malformed!");
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter serviceName: ");
        String serviceName = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(serviceName)) {
            System.out.println("service name malformed!");
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }

        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!ValidateFacility.isMatchesAcrege(usableArea)) {
            System.out.println("usable Area malformed!");
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }
        System.out.print("enter rentalCosts: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        String string = String.valueOf(rentalCosts);
        while (!ValidateFacility.isMatchesRentalCosts(string)) {
            System.out.println("rental Costs malformed!");
            System.out.print("retype rental costs: ");
            string = scanner.nextLine();
        }
        System.out.print("enter maximumPerson: ");
        int maximumPerson = Integer.parseInt(scanner.nextLine());
        String maximumPersons = String.valueOf(maximumPerson);
        while (!ValidateFacility.isMatchesMaximumPerson(maximumPersons)) {
            System.out.println("maximum Person malformed!");
            System.out.print("retype  maximum Person: ");
            maximumPersons = scanner.nextLine();
        }

        System.out.print("enter rentalType: ");
        String rentalType = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(rentalType)) {
            System.out.println("Rental type malformed!");
            System.out.print("retype Rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter roomStandard: ");
        String roomStandard = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(roomStandard)) {
            System.out.println("room standard malformed!");
            System.out.print("retype room standard: ");
            roomStandard = scanner.nextLine();
        }
        System.out.print("enter swimmingPoolArea: ");
        Double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        String swimmingPoolAreas = String.valueOf(swimmingPoolArea);
        while (!ValidateFacility.isMatchesAcrege(swimmingPoolAreas)) {
            System.out.println("swimmingPool Area malformed!");
            System.out.print("retype swimmingPool Area: ");
            swimmingPoolAreas = scanner.nextLine();
        }

        System.out.print("enter numberOfFloors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        String numberOfFloor = String.valueOf(numberOfFloors);
        while (!ValidateFacility.isMatchesNumberOfFloors(numberOfFloor)) {
            System.out.println("room standard malformed!");
            System.out.print("retype number of floors: ");
            numberOfFloor = scanner.nextLine();
        }
        Vila vila = new Vila(serviceCode, serviceName, usableArea, rentalCosts, maximumPerson, rentalType, roomStandard, swimmingPoolArea,
                numberOfFloors);
        facilities.put(vila, null);
    }

    @Override
    public void displayListFacilityMaintenance() {
        for (Facility facility : maintenancefacilities) {
            System.out.println(facility);
        }

    }

    @Override
    public void maintenanceCheck(Facility facility) {
        if (facilities.get(facility) >= 5) {
            System.out.println("Service is under maintenance!");
            maintenancefacilities.add(facility);
            facilities.put(facility, 0);
        }
    }

}
