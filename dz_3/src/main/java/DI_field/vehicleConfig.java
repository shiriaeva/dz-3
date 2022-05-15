package DI_field;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("DI_field")
public class vehicleConfig {

    @Bean
    public Vehicle vehicle(){
        return new Vehicle("vehicle name is supposed to be here");
    }

}