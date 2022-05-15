package com.example.DI_constructor_and_same_interface;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class Dz3Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle car = (Vehicle)context.getBean("car");
        car.drive();

        Vehicle bike = (Vehicle)context.getBean("bike");
        bike.drive();

        Tyre t = (Tyre)context.getBean("tyre");
        System.out.println(t);
    }

}
