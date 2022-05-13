package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.write_read_file.WriteReadFile;
import hau.case_study_furama_resort.model.bookings.Booking;
import hau.case_study_furama_resort.service.IBookingService;
import hau.case_study_furama_resort.service.ICustomerService;
import hau.case_study_furama_resort.service.IFacilityService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookingServiceImpl implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityService iFacilityService = new FacilityServiceImpl();
    private static ICustomerService iCustomerService = new CustomerServiceImpl();
    private static List<Booking> bookingList = new ArrayList<>();
    private static Set<Booking> bookingSet = new TreeSet<>();
    private static  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    static {
        Date starDay1 = null;
        Date starDay2 = null;
        Date starDay3 = null;
        Date endDay1 = null;
        Date endDay2 = null;
        Date endDay3 = null;
        try {
            starDay1 = simpleDateFormat.parse("06/05/2022");
            starDay2 = simpleDateFormat.parse("12/05/2022");
            starDay3 = simpleDateFormat.parse("08/05/2022");
            endDay1 = simpleDateFormat.parse("20/5/2022");
            endDay2 = simpleDateFormat.parse("18/5/2022");
            endDay3 = simpleDateFormat.parse("19/5/2022");

        } catch (ParseException e) {
            e.printStackTrace();
        }

        Booking booking = new Booking("123",starDay1,endDay1,"A12","Hauas","amhf","ahn");
        Booking booking1 = new Booking("456",starDay2,endDay2,"B3","ASD","MIM","LKO");
        Booking booking2 = new Booking("789",starDay3,endDay3,"KS0","MJ","LP","POP");

        bookingList.add(booking);
        bookingList.add(booking1);
        bookingList.add(booking2);
        WriteReadFile.writeBooking(bookingList,false);
    }

    @Override
    public void display() {
        bookingList = WriteReadFile.readFileBooking();
        for (Booking booking:bookingList){
            System.out.println(booking);
        }

    }

    @Override
    public void add() {
        iCustomerService.display();
        System.out.print("Enter customer code: ");
        String customerCode = scanner.nextLine();

        iFacilityService.display();
        System.out.print("Enter service code: ");
        String serviceCode = scanner.nextLine();

        System.out.print("Enter booking code: ");
        String bookingCode = scanner.nextLine();

        System.out.print("Enter Start Day: ");
        String startDayStr = scanner.nextLine();
        Date startDay = null;
        try {
            startDay = simpleDateFormat.parse(startDayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Enter End Day: ");
        String endDayStr = scanner.nextLine();
        Date endDay = null;
        try {
            endDay = simpleDateFormat.parse(endDayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Enter service Name: ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter type Of Service: ");
        String typeOfService = scanner.nextLine();

        Booking booking = new Booking(bookingCode,startDay,endDay,customerCode,serviceName,typeOfService,serviceCode);
        bookingList.add(booking);
        WriteReadFile.writeBooking(bookingList,false);
    }

    @Override
    public void createNewConstracts() {


    }

    @Override
    public void displayListContracts() {


    }

    @Override
    public void editContracts() {


    }

}
