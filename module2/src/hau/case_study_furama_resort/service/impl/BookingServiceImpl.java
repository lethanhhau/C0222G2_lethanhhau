package hau.case_study_furama_resort.service.impl;

import hau.case_study_furama_resort.common.write_read_file.WriteReadFile;
import hau.case_study_furama_resort.model.bookings.Booking;
import hau.case_study_furama_resort.model.person_model.Customer;
import hau.case_study_furama_resort.service.IBookingService;
import hau.case_study_furama_resort.service.IFacilityService;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    public static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> bookingSet = new TreeSet<>();

    @Override
    public void display() {

    }

    @Override
    public void add() {

    }

}
