package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertTest 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        Student student1=new Student(1,"ramu",20,"CSE");
        Student student2=new Student(2,"raju",21,"EcE");
        Student student3=new Student(3,"rani",20,"EEE");
        em.persist(student1);
        em.persist(student2);
        em.persist(student3);
        trans.commit();

    }
}
