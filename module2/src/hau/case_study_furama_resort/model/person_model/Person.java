package hau.case_study_furama_resort.model.person_model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static final String COMMA = ",";
    private String fullName;
    private Date dateOfBirth;
    private String sex;
    private Long idNumber;
    private Long phoneNumber;
    private String email ;

    public Person(){
    }

    public Person(String fullName, Date dateOfBirth, String sex, Long idNumber, Long phoneNumber, String email) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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
                ", dateOfBirth= " + simpleDateFormat.format(dateOfBirth) +
                ", sex= " + sex +
                ", idNumber= " + idNumber +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email;
    }

    public String getInfoPerson(){
        return this.getFullName() + COMMA + simpleDateFormat.format(this.getDateOfBirth()) + COMMA + this.getSex() + COMMA + this.getIdNumber() +
               COMMA + this.getPhoneNumber() + COMMA + this.getEmail();
    }
}
