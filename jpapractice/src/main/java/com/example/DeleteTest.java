package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteTest {
    
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Scanner sc1=new Scanner(System.in);
        int TrainNo=sc1.nextInt();
        Train t = em.find(Train.class, TrainNo);
        System.out.println("enter the id "+t.getId());
        Scanner sc2=new Scanner(System.in);
        System.out.println("enter the confirmation for deletion of recored");
         String a =sc2.nextLine();
         if(a.equalsIgnoreCase("y")||a.equalsIgnoreCase("yes")){
            em.remove(t);
            trans.commit();
         }

        
    }
}
