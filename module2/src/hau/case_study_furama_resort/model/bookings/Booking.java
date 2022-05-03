package hau.case_study_furama_resort.model.bookings;

public class Booking {
    private String bookingcode;
    private String startDay;
    private String endDate;
    private String customerCode;
    private String serviceName;
    private String typeOfService;

    public Booking(){
    }

    public Booking(String bookingcode, String startDay, String endDate, String customerCode, String serviceName,
                   String typeOfService) {
        this.bookingcode = bookingcode;
        this.startDay = startDay;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public String getBookingcode() {
        return bookingcode;
    }

    public void setBookingcode(String bookingcode) {
        this.bookingcode = bookingcode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingcode='" + bookingcode + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
