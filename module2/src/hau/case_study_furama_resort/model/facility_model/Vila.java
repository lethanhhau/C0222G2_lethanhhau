package hau.case_study_furama_resort.model.facility_model;

public class Vila extends Facility{
    private String roomStandard;
    private Double swimmingPoolArea;
    private Integer numberOfFloors;

    public Vila() {
    }

    public Vila(String roomStandard, Double swimmingPoolArea, Integer numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Vila(String serviceName, String usableArea, Double rentalCosts, Integer maximumPerson, String rentalType,
                String roomStandard, Double swimmingPoolArea, Integer numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumPerson, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(Double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Vila{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
