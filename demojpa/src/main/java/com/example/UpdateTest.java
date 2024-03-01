package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTest {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the element to update: ");
        int element=sc1.nextInt();

        Employee employee=em.find(Employee.class, element);

        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the new name:");
        String newName=sc2.nextLine();

        employee.setEmp_name(newName);


        em.merge(employee);
        trans.commit();
        em.close();
    }
}
