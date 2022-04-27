package hau.case_study_furama_resort.util;

import hau.case_study_furama_resort.model.person_model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_EMPLOYEE = "src/hau/case_study_furama_resort/data/employee.csv";
    private static final String FILE_CUSTOMER = "src/hau/case_study_furama_resort/data/customer.csv";
    private static final String FILE_VILA = "src/hau/case_study_furama_resort/data/villa.csv";
    private static final String FILE_HOUSE = "src/hau/case_study_furama_resort/data/villa.csv";
    private static final String FILE_ROOM = "src/hau/case_study_furama_resort/data/villa.csv";
    private static List<String> readFileCsvToListStrinng(String pathFile) {
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

    public static List<Employee> readFileEmployee() {
        List<String> stringList = readFileCsvToListStrinng(FILE_EMPLOYEE);
        List<Employee> employeeList = new ArrayList<>();
        String[] array = null;
        Employee employee = null;
        // chuyển listSTring => listEmployee
        for (String str: stringList) {
            array = str.split(",");
            employee = new Employee(array[0], array[1], array[2], Integer.parseInt(array[3]),Integer.parseInt(array[4]),
                    array[5],array[6],array[7],array[8],Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }
}
