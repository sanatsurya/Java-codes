package com.SpringPractice.Tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle vehicle = (Vehicle) context.getBean("bike");
//        vehicle.status();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Tyre tyre = (Tyre)context.getBean("tyre");
//        System.out.println(tyre);
        Car car = (Car)context.getBean("car");
        System.out.println(car);
        
    }
}
