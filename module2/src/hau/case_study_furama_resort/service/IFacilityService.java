package hau.case_study_furama_resort.service;

import hau.case_study_furama_resort.model.facility_model.Facility;

public interface IFacilityService {

    void add(Facility facility);
    void addHouse();
    void addRoom();
    void addVila();
    void displayListFacilityMaintenance();
    void display();
    void maintenanceCheck(Facility facility);
}
