package hau.case_study_furama_resort.model.bookings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static final String COMMA = ",";
    private String bookingcode;
    private Date startDay;
    private Date endDate;
    private String customerCode;
    private String serviceName;
    private String typeOfService;
    private String serviceCode;

    public Booking(){
    }

    public Booking(String bookingcode, Date startDay, Date endDate, String customerCode, String serviceName,
                   String typeOfService,String serviceCode) {
        this.bookingcode = bookingcode;
        this.startDay = startDay;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
        this.serviceCode = serviceCode;
    }

    public String getBookingcode() {
        return bookingcode;
    }

    public void setBookingcode(String bookingcode) {
        this.bookingcode = bookingcode;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "bookingcode= " + bookingcode +
                ", startDay= " + simpleDateFormat.format(startDay) +
                ", endDate= " + simpleDateFormat.format(endDate) +
                ", customerCode= " + customerCode +
                ", serviceName= " + serviceName +
                ", typeOfService= " + typeOfService +
                ", serviceCode= "+ serviceCode;
    }

    public String getInFoBooking(){
        return this.getBookingcode() + COMMA + simpleDateFormat.format(this.getStartDay()) + COMMA +
                simpleDateFormat.format(this.getEndDate()) + COMMA + this.getCustomerCode() + COMMA +
                this.getServiceName() + COMMA + this.getTypeOfService() + COMMA + this.getServiceCode();
    }
}
