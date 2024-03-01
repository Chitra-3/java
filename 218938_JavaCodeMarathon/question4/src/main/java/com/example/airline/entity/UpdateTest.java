package com.example.airline.entity;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTest {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");

        EntityManager em = emf.createEntityManager();

        EntityTransaction trans = em.getTransaction();
        trans.begin();

        System.out.println("Enter the id to modify ");
        Scanner s1 = new Scanner(System.in);
        int searchElement = s1.nextInt();

        Flight f1 = em.find(Flight.class, searchElement);

        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        System.out.println("Enter new source: ");
        String newSource = s2.nextLine();
        System.out.println("Enter new destination: ");
        String newDest = s3.nextLine();

        f1.setSource(newSource);
        f1.setDestination(newDest);

        em.merge(f1);

        trans.commit();

        em.close();

    }

}
