package com.example.airline.entity;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteTest {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");

        EntityManager em = emf.createEntityManager();

        EntityTransaction trans = em.getTransaction();
        trans.begin();

        System.out.println("Enter the id to delete ");
        Scanner sc1 = new Scanner(System.in);

        int deleteElement = sc1.nextInt();
        Flight f1 = em.find(Flight.class, deleteElement);

        System.out.println("Are you sure to delete ? ");
        Scanner s2 = new Scanner(System.in);
        String ans = s2.nextLine();
        if (ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")) {
            em.remove(f1);
            trans.commit();
            System.out.println(" Flight Record deleted...");
        }

        em.close();

    }
}
