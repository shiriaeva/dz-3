package com.example.DI_constructor_and_same_interface;


import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
    public void drive()
    {
        System.out.println("car brr-brr");
    }
}
