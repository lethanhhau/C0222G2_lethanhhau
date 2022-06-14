package furama.com.repository.customer;

import furama.com.model.Customer;
import furama.com.model.CustomerType;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAllCustomer();

    List<CustomerType> getAllCustomerType();

    void addCustomer(Customer customer);

    void editCustomer(Customer customer);

    Customer findById(int id);

    void deleteCustomer(int idDelete);


    List<Customer> searchCustomerByName(String customerSearchName);

    List<Customer> sortByName();

}
