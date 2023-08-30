package pl.coderslab.Logger;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class SimpleCustomerLogger implements CustomerLogger {
    @Override
    public void log() {
        System.out.println(LocalDateTime.now() + ": Customer Operation;");
    }
}
