package com.example.DI_constructor_and_same_interface;

public class Tyre {
    private String brand;

    public Tyre(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
