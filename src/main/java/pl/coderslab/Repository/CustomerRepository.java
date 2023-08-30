package pl.coderslab.Repository;

import pl.coderslab.model.Customer;

import java.util.ArrayList;

public interface CustomerRepository {
    void addCustomer(Customer customer);

    void deleteCustomer(int id);

    ArrayList<Customer> AllCustomers();
}
