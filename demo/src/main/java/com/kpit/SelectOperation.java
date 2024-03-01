package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectOperation {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager manager = factory.createEntityManager();
        System.out.println("Enter the id to search: ");
        Scanner scanner1 = new Scanner(System.in);
        int searchElement = scanner1.nextInt();

        Flight f1 = manager.find(Flight.class, searchElement);

        if (f1 == null) {
            FlightNotFoundException e = new FlightNotFoundException(
                    "This flight id not exist !!! " + searchElement);
            throw e;
        }
        System.out.println("Flight Number : " + f1.getFlightNumber());
        System.out.println("Flight Name  : " + flight1.getFlightName());
        System.out.println("Flight Source : " + flight1.getSource());
        System.out.println("Flight Source : " + flight1.getDestination());
       

    }
}