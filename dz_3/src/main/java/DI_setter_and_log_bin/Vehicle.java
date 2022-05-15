package DI_setter_and_log_bin;

public class Vehicle {
    private String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void init() {
        System.out.println("bean is created");
    }

    public void destroy() {
        System.out.println("bean is destroyed");
    }
}
