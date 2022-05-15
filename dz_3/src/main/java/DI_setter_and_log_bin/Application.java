package DI_setter_and_log_bin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var bike = context.getBean(Bike.class);
        System.out.println(bike.getVehicleName());
        context.close();
    }
}