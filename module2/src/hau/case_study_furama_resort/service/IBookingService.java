package hau.case_study_furama_resort.service;

import hau.case_study_furama_resort.model.bookings.Booking;

public interface IBookingService extends IService<Booking>{
    void add();
    void display();
    void createNewConstracts();
    void displayListContracts();
    void editContracts ();
}
