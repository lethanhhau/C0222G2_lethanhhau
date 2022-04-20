package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.model.facility_model.Facility;
import hau.case_study_furama_resort.model.facility_model.House;
import hau.case_study_furama_resort.model.facility_model.Room;
import hau.case_study_furama_resort.model.facility_model.Vila;
import hau.case_study_furama_resort.model.person_model.Employee;
import hau.case_study_furama_resort.service.IFacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Facility> facilities = new ArrayList<>();

    {
        Facility house1 = new House("house1","200m",600d,6,
                "theo năm","3*",2);
        Facility house2 = new House("house2","300m",800d,8,
                "theo năm","3*",2);
        Facility room = new Room("room","100m",200d,2,"theo giờ",
                "bữa sáng");
        Facility room1 = new Room("rom1","120m",300d,2,"theo giờ",
                "ăn sáng");
        Facility vila = new Vila("villa","600m",1800d,12,"theo tháng",
                "4*",120d,1);
        Facility vila1 = new Vila("vila1","800m",2000d,15,"theo tháng",
                "5*",200d,1);

        facilities.add(house1);
        facilities.add(house2);
        facilities.add(room);
        facilities.add(house2);
    }

    @Override
    public void display() {


    }

    @Override
    public void add() {

    }


    @Override
    public void edit() {

    }

}
