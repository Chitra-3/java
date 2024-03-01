package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {
    




    public static void main(String[] args) {
        
        System.out.println("=> Creating application context...");
       
        ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
        System.out.println("=> Context is created.."+context);

       
        Car theCar = (Car) context.getBean("myCar");

        theCar.drive();

        

    }
}







