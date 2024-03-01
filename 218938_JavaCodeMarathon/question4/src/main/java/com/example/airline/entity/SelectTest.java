package com.example.airline.entity;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SelectTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em = emf.createEntityManager();
        System.out.println("Enter the id to search ");
        Scanner sc1 = new Scanner(System.in);
        int searchElement = sc1.nextInt();

        Flight f1 = em.find(Flight.class, searchElement);

        System.out.println("Flight Number : " + f1.getFlightNumber());
        System.out.println("Flight Name : " + f1.getFlightName());
        System.out.println("Flight Source : " + f1.getSource());
        System.out.println("Flight Destination : " + f1.getDestination());

    }
}
