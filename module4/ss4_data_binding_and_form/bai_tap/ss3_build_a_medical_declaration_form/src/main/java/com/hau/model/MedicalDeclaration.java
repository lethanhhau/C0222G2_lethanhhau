package com.hau.model;

public class MedicalDeclaration {
    private String fullName;
    private String birthday;
    private String gender;
    private String nationality;
    private String idCard;
    private String travelInformation;
    private String vehicleNumber;
    private Integer seats;
    private String dateStart;
    private String dateEnd;
    private String moveInfo;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String fullName, String birthday, String gender, String nationality, String idCard,
                              String travelInformation, String vehicleNumber, Integer seats, String dateStart,
                              String dateEnd, String moveInfo) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.travelInformation = travelInformation;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.moveInfo = moveInfo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getMoveInfo() {
        return moveInfo;
    }

    public void setMoveInfo(String moveInfo) {
        this.moveInfo = moveInfo;
    }
}

