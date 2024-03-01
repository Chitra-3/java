package com.kpit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class InsertOperation {
     public static void main( String[] args )
    {
        System.out.println( "Creating entity manager factory" );
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        System.out.println("Created entity manager factory");

        EntityManager em= emf.createEntityManager();
        System.out.println("Created entity manager: "+em);

        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Flight f1= new Flight(109,"INDIGO","PUNE","HYD",5000);
        Flight f2= new Flight(110,"INDIGO","HYD","PUNE",5300);
        Flight f3= new Flight(111,"INDIGO","PUNE","VIZAG",5900);
        em.persist(f1);
        em.persist(f2);
        em.persist(f3);
        trans.commit();
    }

}
