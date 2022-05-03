package hau.case_study_furama_resort.model.person_model;

public abstract class Person {
    private static final String COMMA = ",";
    private String fullName;
    private String dateOfBirth;
    private String sex;
    private Long idNumber;
    private Long phoneNumber;
    private String email ;

    public Person(){
    }

    public Person(String fullName, String dateOfBirth, String sex, Long idNumber, Long phoneNumber, String email) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "fullName= " + fullName +
                ", dateOfBirth= " + dateOfBirth +
                ", sex= " + sex +
                ", idNumber= " + idNumber +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email;
    }

    public String getInfoPerson(){
        return this.getFullName() + COMMA + this.getDateOfBirth() + COMMA + this.getSex() + COMMA + this.getIdNumber() +
               COMMA + this.getPhoneNumber() + COMMA + this.getEmail();
    }
}
