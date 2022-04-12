package controllers.task2;

public class House extends FacilityManagement{
    @Override
    public String serviceName(){
        return "House";
    }
    public String usableArea(){
        return "800m";
    }
    public double rentalCosts(){
        return 2000000;
    }
    public int maximumPerson(){
        return 6;
    }
    public String rentalType(){
        return "date";
    }

    private String roomStandard;
    private int numberOfFloors;
    public House(){

    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "serviceName = " + serviceName()+"\n"+
                "usableArea = " + usableArea()+"\n"+
                "rentalCosts = " + rentalCosts()+"\n"+
                "maximumPerson = " + maximumPerson()+"\n"+
                "rentalType = " + rentalType()+"\n"+
                "roomStandard='" + roomStandard + "\n" +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
