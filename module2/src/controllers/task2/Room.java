package controllers.task2;

public class Room extends FacilityManagement {
    @Override
    public String serviceName(){
        return "Room";
    }
    public String usableArea(){
        return "200m";
    }
    public double rentalCosts(){
        return 800000;
    }
    public int maximumPerson(){
        return 2;
    }
    public String rentalType(){
        return "date";
    }

    public String FreeServiceIncluded;
    public Room(){

    }

    public Room(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return FreeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceName = " + serviceName()+"\n"+
                "usableArea = " + usableArea()+"\n"+
                "rentalCosts = " + rentalCosts()+"\n"+
                "maximumPerson = " + maximumPerson()+"\n"+
                "rentalType = " + rentalType()+"\n"+
                "FreeServiceIncluded='" + FreeServiceIncluded + "\n" +
                '}';
    }
}
