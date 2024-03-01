package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TigerApp {
    public static void main(String[] args) {
        
        System.out.println("=> Creating application context...");
       
        ApplicationContext context = new ClassPathXmlApplicationContext("myspringAnno.xml");
        System.out.println("=> Context is created.."+context);

      

        Tiger tiger=(Tiger) context.getBean("myTiger");
        BengalTiger bengalTiger=(BengalTiger) context.getBean("myBengal");
        Bear bear=(Bear) context.getBean(Bear.class);
        bear.fetchHoney("Jill");
    }
}









