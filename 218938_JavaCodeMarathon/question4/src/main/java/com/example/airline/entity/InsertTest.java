package com.example.airline.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        Flight f1 = new Flight(1, "INDIGO", "PUNE", "HYD");
        Flight f2 = new Flight(2, "INDIGO", "HYD", "PUNE");
        Flight f3 = new Flight(3, "INDIGO", "PUNE", "VIZAG");
        em.persist(f1);
        em.persist(f2);
        em.persist(f3);
        trans.commit();
    }
}
