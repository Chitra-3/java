package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class InsertTest 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Train train=new Train();
        train.setId(1);
        train.setName("LTT EXPRESS");
        train.setPrice(2000);
        train.setSource("Pune");
        train.setDestination("Vizag");
        em.persist(train);
        trans.commit();
    }
}
