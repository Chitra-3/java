package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTest {
    public static void main(String[] args) {
         EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        System.out.println("Enter the id to update : ");
        Scanner sc1=new Scanner(System.in);
        int searchElement=sc1.nextInt();

        Employee employee=em.find(Employee.class, searchElement);

        employee.setEmp_dept("Testing");
        em.merge(employee);
        trans.commit();
        em.close();
        
    }
}
