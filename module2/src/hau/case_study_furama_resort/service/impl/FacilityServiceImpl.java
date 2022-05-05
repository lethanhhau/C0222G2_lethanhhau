package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.exception.CheckException;
import hau.case_study_furama_resort.common.validate.Validate;
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


   static  {

        House house = new House("SVHO-1234", "house1", "200m", 600, 6,
                "theo năm", "3*", 2);
       Room room = new Room("SVRO-8934", "room", "100m", 200, 2, "theo giờ",
                "bữa sáng");
       Vila vila = new Vila("SVVL-7932", "villa", "600m", 1800, 12, "Theo tháng",
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
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility facility:facilitySet) {
            System.out.println(facility + "\n" + facilityMap.get(facility));
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
                if (key.equals(facility)) {
                    maintenanceCheck(key);
                    facilityMap.put(facility, facilityMap.get(facility) + 1);
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
        houseList = WriteReadFile.readFileHouse();

        System.out.print("Enter service Code:");
        String serviceCode = scanner.nextLine();
        while (!Validate.isMatchesServiceCodeHouse(serviceCode)) {
            System.err.println("service code malformed!");
            System.out.println();
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter serviceName: ");
        String serviceName = scanner.nextLine();
        while (!Validate.isMatchesServiceName(serviceName)) {
            System.err.println("service name malformed!");
            System.out.println();
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }
        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!Validate.isMatchesAcrege(usableArea)) {
            System.err.println("usable Area malformed!");
            System.out.println();
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }

        System.out.print("enter rentalCosts: ");
        int rentalCost = 0;
        rentalCost = CheckException.checkInt(rentalCost);
        while (!Validate.isMatchesRentalCosts(String.valueOf(rentalCost))) {
            System.err.println("rental Costs malformed!");
            System.out.println();
            System.out.print("retype rental costs: ");
            rentalCost = CheckException.checkInt(rentalCost);
        }

        System.out.print("enter maximumPerson: ");
        int maximumPerson = 0;
        maximumPerson = CheckException.checkInt(maximumPerson);
        while (!Validate.isMatchesMaximumPerson(String.valueOf(maximumPerson))) {
            System.err.println("maximum Person malformed!");
            System.out.println();
            System.out.print("retype  maximum Person: ");
            maximumPerson = CheckException.checkInt(maximumPerson);
        }

        System.out.print("enter rentalType: ");
        String rentalType = scanner.nextLine();
        while (!Validate.isMatchesServiceName(rentalType)) {
            System.err.println("Rental type malformed!");
            System.out.println();
            System.out.print("retype rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter room Standard: ");
        String roomStandard = scanner.nextLine();
        while (!Validate.isMatchesServiceName(roomStandard)) {
            System.err.println("room standard malformed!");
            System.out.println();
            System.out.print("retype room standard: ");
            roomStandard = scanner.nextLine();
        }

        System.out.print("enter number Of Floors: ");
        int numberOfFloors = 0;
        numberOfFloors = CheckException.checkInt(numberOfFloors);
        while (!Validate.isMatchesNumberOfFloors(String.valueOf(numberOfFloors))) {
            System.err.println("number of floors malformed!");
            System.out.println();
            System.out.print("retype number of floors: ");
            numberOfFloors = CheckException.checkInt(numberOfFloors);
        }
        House house = new House(serviceCode, serviceName, usableArea, rentalCost, maximumPerson, rentalType, roomStandard,
                numberOfFloors);
        this.add(house);

        houseList.add(house);
        WriteReadFile.writeHouse(houseList,false);
    }

    @Override
    public void addRoom() {
        roomList = WriteReadFile.readFileRoom();
        System.out.print("Enter service Code: ");
        String serviceCode = scanner.nextLine();
        while (!Validate.isMatchesServiceCodeRoom(serviceCode)) {
            System.err.println("service code malformed!");
            System.out.println();
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter service Name: ");
        String serviceName = scanner.nextLine();
        while (!Validate.isMatchesServiceName(serviceName)) {
            System.err.println("service code malformed!");
            System.out.println();
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }
        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!Validate.isMatchesAcrege(usableArea)) {
            System.err.println("usable Area malformed!");
            System.out.println();
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }
        System.out.print("enter rentalCosts: ");
        int rentalCost = 0;
        rentalCost = CheckException.checkInt(rentalCost);
        while (!Validate.isMatchesRentalCosts(String.valueOf(rentalCost))) {
            System.err.println("rental Costs malformed!");
            System.out.println();
            System.out.print("retype rental costs: ");
            rentalCost = CheckException.checkInt(rentalCost);
        }

        System.out.print("enter maximum Person: ");
        int maximumPerson = 0;
        maximumPerson = CheckException.checkInt(maximumPerson);
        while (!Validate.isMatchesMaximumPerson(String.valueOf(maximumPerson))) {
            System.err.println("maximum Person malformed!");
            System.out.println();
            System.out.print("retype  maximum Person: ");
            maximumPerson = CheckException.checkInt(maximumPerson);
        }

        System.out.print("enter rental Type: ");
        String rentalType = scanner.nextLine();
        while (!Validate.isMatchesServiceName(rentalType)) {
            System.err.println("Rental type malformed!");
            System.out.println();
            System.out.print("retype Rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter freeServiceAttached: ");
        String freeServiceAttached = scanner.nextLine();
        Room room = new Room(serviceCode, serviceName, usableArea, rentalCost, maximumPerson, rentalType, freeServiceAttached);
       this.add(room);

       roomList.add(room);
        WriteReadFile.writeRoom(roomList,false);
    }

    @Override
    public void addVila() {
        vilaList = WriteReadFile.readFileVila();
        System.out.print("Enter serviceCode: ");
        String serviceCode = scanner.nextLine();
        while (!Validate.isMatchesServiceCodeVila(serviceCode)) {
            System.err.println("service code malformed!");
            System.out.println();
            System.out.print("retype service code: ");
            serviceCode = scanner.nextLine();
        }
        System.out.print("enter serviceName: ");
        String serviceName = scanner.nextLine();
        while (!Validate.isMatchesServiceName(serviceName)) {
            System.err.println("service name malformed!");
            System.out.println();
            System.out.print("retype service name: ");
            serviceName = scanner.nextLine();
        }

        System.out.print("enter usable Area: ");
        String usableArea = scanner.nextLine();
        while (!Validate.isMatchesAcrege(usableArea)) {
            System.err.println("usable Area malformed!");
            System.out.println();
            System.out.print("retype usable Area: ");
            usableArea = scanner.nextLine();
        }
        System.out.print("enter rentalCosts: ");
        int rentalCost = 0;
        rentalCost = CheckException.checkInt(rentalCost);
        while (!Validate.isMatchesRentalCosts(String.valueOf(rentalCost))) {
            System.err.println("rental Costs malformed!");
            System.out.println();
            System.out.print("retype rental costs: ");
            rentalCost = CheckException.checkInt(rentalCost);
        }
        System.out.print("enter maximumPerson: ");
        int maximumPerson = 0;
        maximumPerson = CheckException.checkInt(maximumPerson);
        while (!Validate.isMatchesMaximumPerson(String.valueOf(maximumPerson))) {
            System.err.println("maximum Person malformed!");
            System.out.println();
            System.out.print("retype  maximum Person: ");
            maximumPerson = CheckException.checkInt(maximumPerson);
        }

        System.out.print("enter rentalType: ");
        String rentalType = scanner.nextLine();
        while (!Validate.isMatchesServiceName(rentalType)) {
            System.err.println("Rental type malformed!");
            System.out.println();
            System.out.print("retype Rental type: ");
            rentalType = scanner.nextLine();
        }
        System.out.print("enter roomStandard: ");
        String roomStandard = scanner.nextLine();
        while (!Validate.isMatchesServiceName(roomStandard)) {
            System.err.println("room standard malformed!");
            System.out.println();
            System.out.print("retype room standard: ");
            roomStandard = scanner.nextLine();
        }
        System.out.print("enter swimmingPoolArea: ");
        Double swimmingPoolArea = 0.0;
        swimmingPoolArea = CheckException.checkDouble(swimmingPoolArea);
        while (!Validate.isMatchesAcrege(String.valueOf(swimmingPoolArea))) {
            System.err.println("swimmingPool Area malformed!");
            System.out.println();
            System.out.print("retype swimmingPool Area: ");
            swimmingPoolArea = CheckException.checkDouble(swimmingPoolArea);
        }

        System.out.print("enter numberOfFloors: ");
        int numberOfFloors = 0;
        numberOfFloors = CheckException.checkInt(numberOfFloors);
        while (!Validate.isMatchesNumberOfFloors(String.valueOf(numberOfFloors))) {
            System.err.println("room standard malformed!");
            System.out.println();
            System.out.print("retype number of floors: ");
            numberOfFloors = CheckException.checkInt(numberOfFloors);
        }
        Vila vila = new Vila(serviceCode, serviceName, usableArea, rentalCost, maximumPerson, rentalType, roomStandard, swimmingPoolArea,
                numberOfFloors);
        this.add(vila);
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
