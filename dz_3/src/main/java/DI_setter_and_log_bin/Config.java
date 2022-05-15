package DI_setter_and_log_bin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("DI_setter_and_log_bin")
public class Config {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Vehicle vehicle() {
        return new Vehicle("here is vehicle name supposed to be");
    }

}