package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.write_read_file.WriteReadFile;
import hau.case_study_furama_resort.model.bookings.Booking;
import hau.case_study_furama_resort.model.person_model.Customer;
import hau.case_study_furama_resort.service.IBookingService;
import hau.case_study_furama_resort.service.ICustomerService;
import hau.case_study_furama_resort.service.IEmployeeService;
import hau.case_study_furama_resort.service.IFacilityService;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityService iFacilityService = new FacilityServiceImpl();
    private static ICustomerService iCustomerService = new CustomerServiceImpl();
    private static List<Booking> bookingList = new ArrayList<>();
    private static Set<Booking> bookingSet = new TreeSet<>();


    static {
        Booking booking = new Booking("123","10/5/2022","20/5/2022","A12","Hauas","amhf","ahn");
        Booking booking1 = new Booking("456","12/5/2022","18/5/2022","B3","ASD","MIM","LKO");
        Booking booking2 = new Booking("789","08/5/2022","19/5/2022","KS0","MJ","LP","POP");

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
        String startDay = scanner.nextLine();

        System.out.print("Enter End Day: ");
        String endDay = scanner.nextLine();

        System.out.print("Enter service Name: ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter type Of Service: ");
        String typeOfService = scanner.nextLine();

        Booking booking = new Booking(bookingCode,startDay,endDay,customerCode,serviceName,typeOfService,serviceCode);
        bookingList.add(booking);
        WriteReadFile.writeBooking(bookingList,false);
    }

}
