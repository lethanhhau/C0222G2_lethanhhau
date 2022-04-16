package extra_exercises.service;

public abstract class Transport implements IService {
    public String seaOfControl;
    public String manufacturersName;
    public int yearOfManufacture;
    public String owner;

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
