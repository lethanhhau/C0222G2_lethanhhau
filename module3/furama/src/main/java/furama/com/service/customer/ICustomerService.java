package furama.com.service.customer;

import furama.com.model.Customer;
import furama.com.model.CustomerType;

import java.util.List;
import java.util.Map;

public interface ICustomerService {
    List<Customer> selectAllCustomer();

    List<CustomerType> getAllCustomerType();

    Map<String, String> addCustomer(Customer customer);

    Map<String, String> editCustomer(Customer customer);

    Customer findById(int id);

    void deleteCustomer(int idDelete);

    List<Customer> searchCustomerByName(String customerSearchName);

    List<Customer> sortByName();

}

