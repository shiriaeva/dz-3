package com.example.DI_constructor_and_same_interface;


import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
    public void drive()
    {
        System.out.println("bike bi-bip");
    }
}
