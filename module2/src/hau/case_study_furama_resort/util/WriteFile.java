package hau.case_study_furama_resort.util;

import hau.case_study_furama_resort.model.facility_model.Facility;
import hau.case_study_furama_resort.model.facility_model.House;
import hau.case_study_furama_resort.model.facility_model.Room;
import hau.case_study_furama_resort.model.facility_model.Vila;
import hau.case_study_furama_resort.model.person_model.Customer;
import hau.case_study_furama_resort.model.person_model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static final String FILE_EMPLOYEE = "src/hau/case_study_furama_resort/data/employee.csv";
    private static final String FILE_CUSTOMER = "src/hau/case_study_furama_resort/data/customer.csv";
    private static final String FILE_VILA = "src/hau/case_study_furama_resort/data/villa.csv";
    private static final String FILE_HOUSE = "src/hau/case_study_furama_resort/data/villa.csv";
    private static final String FILE_ROOM = "src/hau/case_study_furama_resort/data/villa.csv";

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

    public static void writeEmployee(List<Employee> employeeList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfoEmployee());
        }
        writeFile(stringList, FILE_EMPLOYEE, flag);
    }

    public static void writeCustomer(List<Customer> customerList,Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList){
            stringList.add(customer.getInfoCustormer());
        }
        writeFile(stringList,FILE_CUSTOMER,flag);
    }

    public static void writeVila(List<Vila> vilaList, Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Vila vila:vilaList) {
            stringList.add(vila.getInfoVila());
        }
        writeFile(stringList,FILE_VILA,flag);
    }

    public static void writeHouse(List<House> houseList, Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (House house:houseList) {
            stringList.add(house.getInfoHouse());
        }
        writeFile(stringList,FILE_HOUSE,flag);
    }

    public static void writeRoom(List<Room> roomList, Boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Room room:roomList) {
            stringList.add(room.getInfoRoom());
        }
        writeFile(stringList,FILE_ROOM,flag);
    }


}