package extra_exercises.model;

import java.util.Scanner;

public abstract class Transport {
    private String seaOfControl;
    private String manufacturersName;
    private int yearOfManufacture;
    private String owner;

    public Transport() {

    }

    public Transport(String seaOfControl, String manufacturersName, int yearOfManufacture, String owner) {
        this.seaOfControl = seaOfControl;
        this.manufacturersName = manufacturersName;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }


    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacturersName() {
        return manufacturersName;
    }

    public void setManufacturersName(String manufacturersName) {
        this.manufacturersName = manufacturersName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sea control: ");
        this.seaOfControl = sc.nextLine();
        System.out.println("Enter manufacturers Name: ");
        this.manufacturersName = sc.nextLine();
        System.out.print("Enter manufacturer year: ");
        this.yearOfManufacture = Integer.parseInt(sc.nextLine());
        System.out.print("Enter owner: ");
        this.owner = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Transport{" +
                "seaOfControl='" + seaOfControl + '\'' +
                ", manufacturersName='" + manufacturersName + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }
}
