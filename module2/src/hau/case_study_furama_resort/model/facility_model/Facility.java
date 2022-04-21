package hau.case_study_furama_resort.model.facility_model;

import java.util.Scanner;

public abstract class Facility {
    private String serviceName;
    private String usableArea;
    private Double rentalCosts;
    private Integer maximumPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, String usableArea, Double rentalCosts, Integer maximumPerson, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPerson = maximumPerson;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public Double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getMaximumPerson() {
        return maximumPerson;
    }

    public void setMaximumPerson(Integer maximumPerson) {
        this.maximumPerson = maximumPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

  public void input(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("enter serviceName: ");
      String serviceName = scanner.nextLine();
      System.out.print("enter usableArea: ");
      String usableArea = scanner.nextLine();
      System.out.print("enter rentalCosts: ");
      Double rentalCosts = Double.parseDouble(scanner.nextLine());
      System.out.print("enter maximumPerson: ");
      int maximumPerson = Integer.parseInt(scanner.nextLine());
      System.out.print("enter rentalType: ");
      String rentalType = scanner.nextLine();

  }

    @Override
    public String toString() {
        return "serviceName= " + serviceName +
                ", usableArea= " + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumPerson= " + maximumPerson +
                ", rentalType= " + rentalType;
    }
}
