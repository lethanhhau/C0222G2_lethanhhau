package hau.case_study_furama_resort.model.facility_model;

public class Room extends Facility{
    private String freeServiceAttached;

    public Room() {
    }

    public Room(String freeServiceAttached) {
        this.freeServiceAttached = freeServiceAttached;
    }

    public Room(String serviceName, String usableArea, Double rentalCosts, Integer maximumPerson, String rentalType,
                String freeServiceAttached) {
        super(serviceName, usableArea, rentalCosts, maximumPerson, rentalType);
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
        return "Room{" +
                super.toString() +
                "freeServiceAttached='" + freeServiceAttached + '\'' +
                '}';
    }
}
