package DI_field;

import DI_setter_and_log_bin.Bike;
import DI_setter_and_log_bin.Config;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class fieldApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(vehicleConfig.class);
        var car = context.getBean(Car.class);
        System.out.println(car.getVehicleName());
    }
}