package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Creating entity manager factory" );
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        System.out.println("Created entity manager factory");

        EntityManager em= emf.createEntityManager();
        System.out.println("Created entity manager: "+em);

        EntityTransaction trans=em.getTransaction();
        trans.begin();
        Account account=new Account();
        account.setAccountNumber(101);
        account.setAccountHolderName("Ram");
        account.setAccountBalance(25000);
        em.persist(account);
        trans.commit();
    }
}
