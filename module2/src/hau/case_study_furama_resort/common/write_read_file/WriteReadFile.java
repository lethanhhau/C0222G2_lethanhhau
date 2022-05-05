package hau.case_study_furama_resort.common.write_read_file;

import hau.case_study_furama_resort.model.bookings.Booking;
import hau.case_study_furama_resort.model.bookings.Contract;
import hau.case_study_furama_resort.model.facility_model.House;
import hau.case_study_furama_resort.model.facility_model.Room;
import hau.case_study_furama_resort.model.facility_model.Vila;
import hau.case_study_furama_resort.model.person_model.Customer;
import hau.case_study_furama_resort.model.person_model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {
    private static final String FILE_EMPLOYEE = "src/hau/case_study_furama_resort/common/data/employee.csv";
    private static final String FILE_CUSTOMER = "src/hau/case_study_furama_resort/common/data/customer.csv";
    private static final String FILE_VILA = "src/hau/case_study_furama_resort/common/data/villa.csv";
    private static final String FILE_HOUSE = "src/hau/case_study_furama_resort/common/data/house.csv";
    private static final String FILE_ROOM = "src/hau/case_study_furama_resort/common/data/room.csv";
    private static final String FILE_BOOKING = "src/hau/case_study_furama_resort/common/data/booking.csv";
    private static final String FILE_CONTRACT = "src/hau/case_study_furama_resort/common/data/contract.csv";

    /**
     * ghi File
     * Hàm dùng chung
     */
    private static void writeFile(List<String> stringList, String pathFile, Boolean flag) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Hàm riêng Employee
     */
    public static void writeEmployee(List<Employee> employeeList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfoEmployee());
        }
        writeFile(stringList, FILE_EMPLOYEE, flag);
    }

    /**
     * hàm riêng Customer
     */
    public static void writeCustomer(List<Customer> customerList,Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList){
            stringList.add(customer.getInfoCustormer());
        }
        writeFile(stringList,FILE_CUSTOMER,flag);
    }

    /**
     * hàm riêng Vila
     */
    public static void writeVila(List<Vila> vilaList, Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Vila vila:vilaList) {
            stringList.add(vila.getInfoVila());
        }
        writeFile(stringList,FILE_VILA,flag);
    }

    /**
     * hàm riêng House
     */
    public static void writeHouse(List<House> houseList, Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (House house:houseList) {
            stringList.add(house.getInfoHouse());
        }
        writeFile(stringList,FILE_HOUSE,flag);
    }

    /**
     * hàm riêng Room
     */
    public static void writeRoom(List<Room> roomList, Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Room room:roomList) {
            stringList.add(room.getInfoRoom());
        }
        writeFile(stringList,FILE_ROOM,flag);
    }

    /**
     * hàm riêng Booking
     */
    public static void writeBooking(List<Booking> bookingList,Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Booking booking:bookingList){
            stringList.add(booking.getInFoBooking());
        }
        writeFile(stringList,FILE_BOOKING,flag);
    }

    /**
     * hàm riêng Contract
     */
    public static void writeContract(List<Contract> contractList, Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Contract contract:contractList){
            stringList.add(contract.getInFoContract());
        }
        writeFile(stringList,FILE_CONTRACT,flag);
    }

    /**
     * đọc File
     * Hàm dùng chung
     */
    private static List<String> readFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    /**
     * Đọc file
     * hàm riêng Employee
     */
    public static List<Employee> readFileEmployee() {
        List<String> stringList = readFile(FILE_EMPLOYEE);
        List<Employee> employeeList = new ArrayList<>();
        String[] array = null;
        Employee employee = null;
        // chuyển listSTring => listEmployee
        for (String str: stringList) {
            array = str.split(",");
            employee = new Employee(array[0], array[1], array[2], Long.parseLong(array[3]),Long.parseLong(array[4])
                    ,array[5],array[6],array[7],array[8],Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    /**
     * hàm riêng Customer
     */
    public static List<Customer> readFileCustomer(){
        List<String> stringList = readFile(FILE_CUSTOMER);
        List<Customer> customerList = new ArrayList<>();
        String[] array = null;
        Customer customer  = null;
        for (String str:stringList) {
            array = str.split(",");
            customer = new Customer(array[0], array[1], array[2], Long.parseLong(array[3]),Long.parseLong(array[4]),
                    array[5],array[6],array[7],array[8] );
            customerList.add(customer);
        }
        return customerList;
    }

    public static List<Vila> readFileVila() {
        List<String> stringList = readFile(FILE_VILA);
        List<Vila> vilaList = new ArrayList<>();
        String[] array = null;
        Vila vila = null;
        for (String str : stringList) {
            array = str.split(",");
            vila = new Vila(array[0], array[1], array[2], Integer.parseInt(array[3]), Integer.parseInt(array[4]),
                    array[5], array[6], Double.parseDouble(array[7]), Integer.parseInt(array[8]));
            vilaList.add(vila);
        }
        return vilaList;
    }

    public static List<House> readFileHouse() {
        List<String> stringList = readFile(FILE_HOUSE);
        List<House> houseList = new ArrayList<>();
        String[] array = null;
        House house = null;
        for (String str : stringList) {
            array = str.split(",");
            house = new House(array[0], array[1], array[2], Integer.parseInt(array[3]), Integer.parseInt(array[4]),
                    array[5], array[6], Integer.parseInt(array[7]));
            houseList.add(house);
        }
        return houseList;
    }

    public static List<Room> readFileRoom() {
        List<String> stringList = readFile(FILE_ROOM);
        List<Room> roomList = new ArrayList<>();
        String[] array = null;
        Room room = null;
        for (String str : stringList) {
            array = str.split(",");
            room = new Room(array[0], array[1], array[2], Integer.parseInt(array[3]), Integer.parseInt(array[4]),
                    array[5], array[6]);
            roomList.add(room);
        }
        return roomList;
    }

    public static List<Booking> readFileBooking(){
        List<String> stringList = readFile(FILE_BOOKING);
        List<Booking> bookingList = new ArrayList<>();
        String[] array = null;
        Booking booking = null;
        for (String str : stringList){
            array = str.split(",");
            booking = new Booking(array[0],array[1],array[2],array[3],array[4],array[5],array[6]);
            bookingList.add(booking);
        }
        return bookingList;
    }

    public static List<Contract> readFileContract(){
        List<String> stringList = readFile(FILE_CONTRACT);
        List<Contract> contractList = new ArrayList<>();
        String[] array = null;
        Contract contract = null;
        for (String str:stringList){
            array = str.split("'");
            contract = new Contract(Long.parseLong(array[0]),array[1],Double.parseDouble(array[2]),
                    Double.parseDouble(array[3]),array[4]);
            contractList.add(contract);
        }
        return contractList;
    }
}