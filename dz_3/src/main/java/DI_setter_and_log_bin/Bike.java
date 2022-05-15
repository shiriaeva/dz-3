package DI_setter_and_log_bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {

    private Vehicle vehicle;

    public String getVehicleName() {
        return vehicle.getName();
    }

    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

}
