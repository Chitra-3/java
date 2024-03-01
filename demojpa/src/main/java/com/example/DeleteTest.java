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

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the id to delete:");
    int deleteElement= sc.nextInt();

    Employee employee=em.find(Employee.class,deleteElement);

    Scanner sc2=new Scanner(System.in);
    System.out.println("Are you sure you want to delete?");
    String confirm= sc2.nextLine();

    
    if(confirm.equalsIgnoreCase("yes")||confirm.equalsIgnoreCase("y")){
        em.remove(employee);
        trans.commit();
        em.close();
    }
    

    }
} 

