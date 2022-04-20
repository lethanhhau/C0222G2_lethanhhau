package hau.case_study_furama_resort.model.facility_model;

public class House extends Facility{
    private String roomStandard;
    private Integer numberOfFloors;

    public House() {
    }

    public House(String roomStandard, Integer numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, String usableArea, Double rentalCosts, Integer maximumPerson, String rentalType,
                 String roomStandard, Integer numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumPerson, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
