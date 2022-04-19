package extra_exercises.model;

public class Manufacturer {
    private int manufacturerCode;
    private String manufacturerName;
    private String nation;

    public Manufacturer(){

    }

    public Manufacturer(int manufacturerCode, String manufacturerName, String nation) {
        this.manufacturerCode = manufacturerCode;
        this.manufacturerName = manufacturerName;
        this.nation = nation;
    }

    public int getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(int manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturerCode=" + manufacturerCode +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
