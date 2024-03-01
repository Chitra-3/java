package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertTest {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        Employee employee1=new Employee(1,"Raju","Sales");
        Employee employee2=new Employee(2,"Ramu","Training");
        Employee employee3=new Employee(3,"Ravi","Developing");
        em.persist(employee1);
        em.persist(employee2);
        em.persist(employee3);
        trans.commit();
    }
}
