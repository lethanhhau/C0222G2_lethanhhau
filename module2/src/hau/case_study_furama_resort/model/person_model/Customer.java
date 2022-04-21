package hau.case_study_furama_resort.model.person_model;

public class Customer extends Person{
    private String customerCode;
    private String typeOfGuest;
    private String address;

    public Customer(){
    }

    public Customer(String customerCode, String typeOfGuest, String address) {
        this.customerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String fullName, String dateOfBirth, String sex, Integer idNumber, Integer phoneNumber, String email, String customerCode, String typeOfGuest, String address) {
        super(fullName, dateOfBirth, sex, idNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: " +
                super.toString() +
                "customerCode= " + customerCode +
                ", typeOfGuest= " + typeOfGuest +
                ", address= " + address;
    }
}
