package pl.coderslab.Repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.coderslab.Logger.CustomerLogger;
import pl.coderslab.model.Customer;

import java.util.ArrayList;
@Component
@AllArgsConstructor
public class MemoryCustomerRepository implements CustomerRepository{
    private ArrayList<Customer> customers;
    private CustomerLogger logger;
    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
        logger.log();
    }

    @Override
    public void deleteCustomer(int id) {
        customers.remove(id);
        logger.log();
    }

    @Override
    public ArrayList<Customer> AllCustomers() {
        logger.log();
        return this.customers;
    }
}
