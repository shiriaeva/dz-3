package DI_field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Vehicle vehicle;

    public String getVehicleName() {
        return vehicle.getName();
    }
}
