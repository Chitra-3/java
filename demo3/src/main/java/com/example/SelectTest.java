package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectTest {

    public static void main( String[] args )
        {
        
    
            System.out.println( "Hello World!" );
            EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyJPA");
            EntityManager em=emf.createEntityManager();
            EntityTransaction trans=em.getTransaction();
            trans.begin();
            System.out.println("Enter the id to find: ");
             Scanner sc1=new Scanner(System.in);
             int idToFind=sc1.nextInt();
            
             Employee emp1=em.find(Employee.class,idToFind);
            
            if(emp1==null)
            {

                DetailsNotFoundException e=new DetailsNotFoundException("Details not found");
                throw e;
             }
             System.out.println("Current Emp_id: "+emp1.getEmpId());
             System.out.println("Current Emp_name: "+emp1.getEmpName());
             System.out.println("Current role: "+emp1.getEmpRole());
    
        
    
    }

}
