package com.example.airline.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAllTest {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Flight> typedQuery = em.createQuery("from Flight", Flight.class);

        List<Flight> flightsList = typedQuery.getResultList();

        for (Flight flight : flightsList) {
            System.out.println("Flight Number   : " + flight.getFlightNumber());
            System.out.println("Flight Name : " + flight.getSource());
            System.out.println("Flight Src  : " + flight.getSource());
            System.out.println("Flight Dest : " + flight.getDestination());

        }

    }
}
