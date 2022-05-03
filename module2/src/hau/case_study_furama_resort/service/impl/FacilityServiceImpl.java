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
import hau.case_study_furama_resort.common.write_read_file.WriteReadFile;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static List<Facility> maintenancefacilities = new ArrayList<>();
    private static List<Facility> facilityList = new ArrayList<>();
    private static List<Vila> vilaList = new ArrayList<>();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();


    {

        House house = new House("SVHO-1234 ", "house1", "200m", 600, 6,
                "theo năm", "3*", 2);
       Room room = new Room("SVRO-8934 ", "room", "100m", 200, 2, "theo giờ",
                "bữa sáng");
       Vila vila = new Vila("SVVL-7932 ", "villa", "600m", 1800, 12, "Theo tháng",
                "4*", 120d, 1);

        facilityMap.put(house,1);
        facilityMap.put(room,1);
        facilityMap.put(vila,1);

        vilaList.add(vila);
        WriteReadFile.writeVila(vilaList,false);
        roomList.add(room);
        WriteReadFile.writeRoom(roomList,false);
        houseList.add(house);
        WriteReadFile.writeHouse(houseList,false);
    }

    @Override
    public void display() {
        vilaList = WriteReadFile.readFileVila();
        houseList = WriteReadFile.readFileHouse();
        roomList = WriteReadFile.readFileRoom();
        facilityList.addAll(vilaList);
        facilityList.addAll(houseList);
        facilityList.addAll(roomList);
        for (Facility facility:facilityList) {
            System.out.println(facility);
        }
    }

    @Override
    public void add(Facility facility) {
        Set<Facility> facilitySet = facilityMap.keySet();
        if (facilityMap.isEmpty()) {
            facilityMap.put(facility, 1);
        } else {
            boolean check = true;
            for (Facility key : facilitySet) {
                if (facility.equals(key)) {
                    maintenanceCheck(key);
                    facilityMap.put(key, facilityMap.get(key) + 1);
                    check = false;
                    break;
                }
            }
            if (check) {
                facilityMap.put(facility, 1);
            }
        }
    }

    @Override
    public void addHouse() {
        System.out.print("Enter service Code:");
        String serviceCode = scanner.nextLine();
        while (!ValidateHouse.isMatchesServiceCodeHouse(serviceCode)) {
            System.err.println("service code malformed!");
            System.out.println();
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter serviceName: ");
        String serviceName = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(serviceName)) {
            System.err.println("service name malformed!");
            System.out.println();
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }
        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!ValidateFacility.isMatchesAcrege(usableArea)) {
            System.err.println("usable Area malformed!");
            System.out.println();
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }
        System.out.print("enter rental Costs: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        String string = String.valueOf(rentalCosts);
        while (!ValidateFacility.isMatchesRentalCosts(string)) {
            System.err.println("rental costs malformed!");
            System.out.println();
            System.out.print("retype rental costs: ");
            string = scanner.nextLine();
        }
        System.out.print("enter maximumPerson: ");
        int maximumPerson = Integer.parseInt(scanner.nextLine());
        String maximumPersons = String.valueOf(maximumPerson);
        while (!ValidateFacility.isMatchesMaximumPerson(maximumPersons)) {
            System.err.println("maximum Person malformed!");
            System.out.println();
            System.out.print("retype  maximum Person: ");
            maximumPersons = scanner.nextLine();
        }

        System.out.print("enter rentalType: ");
        String rentalType = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(rentalType)) {
            System.err.println("Rental type malformed!");
            System.out.println();
            System.out.print("retype rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter room Standard: ");
        String roomStandard = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(roomStandard)) {
            System.err.println("room standard malformed!");
            System.out.println();
            System.out.print("retype room standard: ");
            roomStandard = scanner.nextLine();
        }

        System.out.print("enter number Of Floors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        String numberOfFloor = String.valueOf(numberOfFloors);
        while (!ValidateFacility.isMatchesNumberOfFloors(numberOfFloor)) {
            System.err.println("number of floors malformed!");
            System.out.println();
            System.out.print("retype number of floors: ");
            numberOfFloor = scanner.nextLine();
        }
        House house = new House(serviceCode, serviceName, usableArea, rentalCosts, maximumPerson, rentalType, roomStandard,
                numberOfFloors);
        houseList.add(house);

        facilityMap.put(house,1);
        WriteReadFile.writeHouse(houseList,false);
    }

    @Override
    public void addRoom() {
        System.out.print("Enter service Code: ");
        String serviceCode = scanner.nextLine();
        while (!ValidateRoom.isMatchesServiceCodeRoom(serviceCode)) {
            System.err.println("service code malformed!");
            System.out.println();
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter service Name: ");
        String serviceName = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(serviceName)) {
            System.err.println("service code malformed!");
            System.out.println();
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }
        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!ValidateFacility.isMatchesAcrege(usableArea)) {
            System.err.println("usable Area malformed!");
            System.out.println();
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }
        System.out.print("enter rental Costs: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        String string = String.valueOf(rentalCosts);
        while (!ValidateFacility.isMatchesRentalCosts(string)) {
            System.err.println("rental Costs malformed!");
            System.out.println();
            System.out.print("retype rental costs: ");
            string = scanner.nextLine();
        }
        System.out.print("enter maximum Person: ");
        int maximumPerson = Integer.parseInt(scanner.nextLine());
        String maximumPersons = String.valueOf(maximumPerson);
        while (!ValidateFacility.isMatchesMaximumPerson(maximumPersons)) {
            System.err.println("maximum Person malformed!");
            System.out.println();
            System.out.print("retype  maximum Person: ");
            maximumPersons = scanner.nextLine();
        }

        System.out.print("enter rental Type: ");
        String rentalType = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(rentalType)) {
            System.err.println("Rental type malformed!");
            System.out.println();
            System.out.print("retype Rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter freeServiceAttached: ");
        String freeServiceAttached = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, usableArea, rentalCosts, maximumPerson, rentalType, freeServiceAttached);
       roomList.add(room);

       facilityMap.put(room,1);
        WriteReadFile.writeRoom(roomList,false);
    }

    @Override
    public void addVila() {
        System.out.print("Enter serviceCode: ");
        String serviceCode = scanner.nextLine();
        while (!ValidateVila.isMatchesServiceCodeVila(serviceCode)) {
            System.err.println("service code malformed!");
            System.out.println();
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter serviceName: ");
        String serviceName = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(serviceName)) {
            System.err.println("service name malformed!");
            System.out.println();
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }

        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!ValidateFacility.isMatchesAcrege(usableArea)) {
            System.err.println("usable Area malformed!");
            System.out.println();
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }
        System.out.print("enter rentalCosts: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        String string = String.valueOf(rentalCosts);
        while (!ValidateFacility.isMatchesRentalCosts(string)) {
            System.err.println("rental Costs malformed!");
            System.out.println();
            System.out.print("retype rental costs: ");
            string = scanner.nextLine();
        }
        System.out.print("enter maximumPerson: ");
        int maximumPerson = Integer.parseInt(scanner.nextLine());
        String maximumPersons = String.valueOf(maximumPerson);
        while (!ValidateFacility.isMatchesMaximumPerson(maximumPersons)) {
            System.err.println("maximum Person malformed!");
            System.out.println();
            System.out.print("retype  maximum Person: ");
            maximumPersons = scanner.nextLine();
        }

        System.out.print("enter rentalType: ");
        String rentalType = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(rentalType)) {
            System.err.println("Rental type malformed!");
            System.out.println();
            System.out.print("retype Rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter roomStandard: ");
        String roomStandard = scanner.nextLine();
        while (!ValidateFacility.isMatchesServiceName(roomStandard)) {
            System.err.println("room standard malformed!");
            System.out.println();
            System.out.print("retype room standard: ");
            roomStandard = scanner.nextLine();
        }
        System.out.print("enter swimmingPoolArea: ");
        Double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        String swimmingPoolAreas = String.valueOf(swimmingPoolArea);
        while (!ValidateFacility.isMatchesAcrege(swimmingPoolAreas)) {
            System.err.println("swimmingPool Area malformed!");
            System.out.println();
            System.out.print("retype swimmingPool Area: ");
            swimmingPoolAreas = scanner.nextLine();
        }

        System.out.print("enter numberOfFloors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        String numberOfFloor = String.valueOf(numberOfFloors);
        while (!ValidateFacility.isMatchesNumberOfFloors(numberOfFloor)) {
            System.err.println("room standard malformed!");
            System.out.println();
            System.out.print("retype number of floors: ");
            numberOfFloor = scanner.nextLine();
        }
        Vila vila = new Vila(serviceCode, serviceName, usableArea, rentalCosts, maximumPerson, rentalType, roomStandard, swimmingPoolArea,
                numberOfFloors);
        facilityMap.put(vila,1);
        vilaList.add(vila);
        WriteReadFile.writeVila(vilaList,false);
    }

    @Override
    public void displayListFacilityMaintenance() {
        if (!maintenancefacilities.isEmpty()) {
            for (Facility facility : maintenancefacilities) {
                System.out.println(facility);
            }
        }else {
            System.out.println("no maintenance facility!");
        }
    }

    @Override
    public void maintenanceCheck(Facility facility) {
        if (facilityMap.get(facility) >= 5) {
            System.out.println("Service is under maintenance!");
            maintenancefacilities.add(facility);
            facilityMap.put(facility, 0);
        }
    }


}
