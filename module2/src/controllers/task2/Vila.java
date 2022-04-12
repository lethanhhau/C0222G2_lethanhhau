package controllers.task2;

public class Vila extends FacilityManagement {
    @Override
    public String serviceName(){
        return "Villa";
    }
    public String usableArea(){
        return "1200m";
    }
    public double rentalCosts(){
       return 10000000;
    }
    public int maximumPerson(){
        return 10;
    }
    public String rentalType(){
        return "date";
    }

    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloors;
    public Vila(){

    }
    public Vila(String roomStandard, double swimmingPoolArea, int numberOfFloors) {
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

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Vila{" +
                "serviceName = " + serviceName()+"\n"+
                "usableArea = " + usableArea()+"\n"+
                "rentalCosts = " + rentalCosts()+"\n"+
                "maximumPerson = " + maximumPerson()+"\n"+
                "rentalType = " + rentalType()+"\n"+
                "roomStandard= " + roomStandard + "\n" +
                "swimmingPoolArea=" + swimmingPoolArea + "\n" +
                "numberOfFloors=" + numberOfFloors + "\n" +
                '}';
    }
}
