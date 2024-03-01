package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectTest {
public static void main(String[] args) {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
    EntityManager em=emf.createEntityManager();
    EntityTransaction trans=em.getTransaction();
    trans.begin();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the search element: ");
    int searchElement= sc.nextInt();
    Employee employee=em.find(Employee.class,searchElement);

    System.out.println("Cuurent emp_id : "+employee.getEmp_id());
    System.out.println("Current emp name :"+employee.getEmp_name());
    System.out.println("Current emp age: "+employee.getEmp_age());
    System.out.println("Current emp dept :"+employee.getEmp_dept());

    trans.commit();
    em.close();
}
}
