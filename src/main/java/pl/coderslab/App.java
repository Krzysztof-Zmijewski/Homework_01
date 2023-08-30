package pl.coderslab;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.Config.AppConfig;
import pl.coderslab.Logger.SimpleCustomerLogger;
import pl.coderslab.Repository.MemoryCustomerRepository;
import pl.coderslab.model.Customer;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleCustomerLogger simpleCustomerLogger = context.getBean("simpleCustomerLogger", SimpleCustomerLogger.class);
        simpleCustomerLogger.log();

        MemoryCustomerRepository memoryCustomerRepository = context.getBean("memoryCustomerRepository", MemoryCustomerRepository.class);

        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstname("Krzysztof");
        customer.setLastname("Żmijewski");
        memoryCustomerRepository.addCustomer(customer);










        context.close();
    }
}
