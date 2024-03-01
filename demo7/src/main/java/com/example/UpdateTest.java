package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTest {
     public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        System.out.println("Enter the search element: ");
        Scanner sc1=new Scanner(System.in);
        int searchElement=sc1.nextInt();

        Student student= em.find(Student.class,searchElement);


        student.setStudentAge(25);
        em.merge(student);
        trans.commit();
}
}



   


