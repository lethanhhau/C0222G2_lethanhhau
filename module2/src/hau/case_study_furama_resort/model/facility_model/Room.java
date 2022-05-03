package hau.case_study_furama_resort.model.facility_model;

import java.util.Scanner;

public class Room extends Facility{
    private static final String COMMA = ",";
    private String freeServiceAttached;

    public Room() {
    }

    public Room(String freeServiceAttached) {
        this.freeServiceAttached = freeServiceAttached;
    }

    public Room(String serviceCode,String serviceName, String usableArea, Integer rentalCosts, Integer maximumPerson, String rentalType,
                String freeServiceAttached) {
        super(serviceCode,serviceName, usableArea, rentalCosts, maximumPerson, rentalType);
        this.freeServiceAttached = freeServiceAttached;
    }

    public String getFreeServiceAttached() {
        return freeServiceAttached;
    }

    public void setFreeServiceAttached(String freeServiceAttached) {
        this.freeServiceAttached = freeServiceAttached;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", freeServiceAttached=" + freeServiceAttached;
    }

    public String getInfoRoom(){
        return super.getInfoFacility() + COMMA + this.getFreeServiceAttached();
    }
}
