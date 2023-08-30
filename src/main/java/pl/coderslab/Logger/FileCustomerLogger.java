package pl.coderslab.Logger;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

@Component
@Primary
public class FileCustomerLogger implements CustomerLogger{
    @Override
    public void log() {
      Path path = Paths.get("/home/krzysztof/Pulpit/Kurs/jee-spring/Homework_01/src/main/java/pl/coderslab/Logger/Log");
      try {
          Files.writeString(path, LocalDateTime.now().toString() + "Customer Operation");
      }catch (IOException e){
          e.printStackTrace();
          System.out.println("IO Error");
      }

    }
}
