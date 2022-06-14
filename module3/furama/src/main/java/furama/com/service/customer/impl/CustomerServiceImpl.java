package furama.com.service.customer.impl;

import furama.com.model.Customer;
import furama.com.model.CustomerType;
import furama.com.repository.customer.ICustomerRepository;
import furama.com.repository.customer.impl.CustomerRepositoryImpl;
import furama.com.service.customer.ICustomerService;
import furama.com.validate.Validate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> selectAllCustomer() {
        return iCustomerRepository.getAllCustomer();
    }

    @Override
    public List<CustomerType> getAllCustomerType() {
        return iCustomerRepository.getAllCustomerType();
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void deleteCustomer(int idDelete) {
        iCustomerRepository.deleteCustomer(idDelete);
    }

    @Override
    public List<Customer> searchCustomerByName(String customerSearchName) {
        return iCustomerRepository.searchCustomerByName(customerSearchName);
    }

    @Override
    public List<Customer> sortByName() {
        return iCustomerRepository.sortByName();
    }

    @Override
    public Map<String, String> addCustomer(Customer customer) {
        String pattern = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate birthday = LocalDate.parse("2021-01-01", formatter);
        LocalDate now = LocalDate.now();
        int age = Period.between(birthday, now).getYears();

        Map<String, String> errors = new HashMap<>();
        if(customer.getCustomerTypeId().equals("") || customer.getCustomerTypeId() == null) {
            errors.put("customerTypeId","customer Type Id not null!.");
        }
        if (customer.getCustomerPhone().equals("") || customer.getCustomerPhone() == null){
            errors.put("customerPhone", "Customer Phone not null!.");
        }else if (Validate.isPhone(customer.getCustomerPhone())){
            errors.put("customerPhone","Customer Phone invalid format!");
        }
        if (customer.getCustomerIdCard().equals("") || customer.getCustomerIdCard() == null){
            errors.put("customerIdCard","Customer Id Card not null!.");
        }else if (Validate.isCmnd(customer.getCustomerIdCard())){
            errors.put("customerIdCard","Customer Id Card invalid format!." );
        }
        if (customer.getCustomerName().equals("") || customer.getCustomerName() == null){
            errors.put("customerName","Customer Name not null!.");
        }else if (Validate.isName(customer.getCustomerName())){
            errors.put("customerName","Customer Name invalid format!.");
        }
        if (customer.getCustomerEmail().equals("") || customer.getCustomerEmail() == null){
            errors.put("customerEmail","Customer Email not null!.");
        }else if (Validate.isEmail(customer.getCustomerEmail())){
            errors.put("customerEmail","Customer Email invalid format!.");
        }
        if (customer.getCustomerAddress().equals("") || customer.getCustomerAddress() == null){
            errors.put("customerAddress","Customer Address not Null!.");
        }
        if (customer.getCustomerBirthday().equals("") ||customer.getCustomerBirthday() == null){
            errors.put("customerBirthday","Customer Birthday not null");
        }else if (age<18){
            errors.put("customerBirthday","customer Birthday Chua du tuoi");
        }

        if (customer.getCustomerTypeId().equals("") || customer.getCustomerTypeId() == null){
            errors.put("customerTypeId","Customer Type Id not null!.");
        }
        if (errors.isEmpty()){
            iCustomerRepository.addCustomer(customer);
        }
        return errors;
    }

    @Override
    public Map<String, String> editCustomer(Customer customer) {

        String pattern = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate birthday = LocalDate.parse("2021-01-01", formatter);
        LocalDate now = LocalDate.now();
        int age = Period.between(birthday, now).getYears();

        Map<String, String> errors = new HashMap<>();
        if(customer.getCustomerTypeId().equals("") || customer.getCustomerTypeId() == null) {
            errors.put("customerTypeId","customer Type Id not null!.");
        }
        if (customer.getCustomerPhone().equals("") || customer.getCustomerPhone() == null){
            errors.put("customerPhone", "Customer Phone not null!.");
        }else if (Validate.isPhone(customer.getCustomerPhone())){
            errors.put("customerPhone","Customer Phone invalid format!");
        }
        if (customer.getCustomerIdCard().equals("") || customer.getCustomerIdCard() == null){
            errors.put("customerIdCard","Customer Id Card not null!.");
        }else if (Validate.isCmnd(customer.getCustomerIdCard())){
            errors.put("customerIdCard","Customer Id Card invalid format!." );
        }
        if (customer.getCustomerName().equals("") || customer.getCustomerName() == null){
            errors.put("customerName","Customer Name not null!.");
        }else if (Validate.isName(customer.getCustomerName())){
            errors.put("customerName","Customer Name invalid format!.");
        }
        if (customer.getCustomerEmail().equals("") || customer.getCustomerEmail() == null){
            errors.put("customerEmail","Customer Email not null!.");
        }else if (Validate.isEmail(customer.getCustomerEmail())){
            errors.put("customerEmail","Customer Email invalid format!.");
        }
        if (customer.getCustomerAddress().equals("") || customer.getCustomerAddress() == null){
            errors.put("customerAddress","Customer Address not Null!.");
        }else if (Validate.isName(customer.getCustomerAddress())){
            errors.put("customerAddress","Customer Address invalid format!.");
        }
        if (customer.getCustomerBirthday().equals("") ||customer.getCustomerBirthday() == null){
            errors.put("customerBirthday","Customer Birthday not null");
        }else if (age<18){
            errors.put("customerBirthday","customer Birthday Chua du tuoi");
        }

        if (customer.getCustomerTypeId().equals("") || customer.getCustomerTypeId() == null){
            errors.put("customerTypeId","Customer Type Id not null!.");
        }
        if (errors.isEmpty()){
            iCustomerRepository.editCustomer(customer);
        }
        return errors;
    }

}
