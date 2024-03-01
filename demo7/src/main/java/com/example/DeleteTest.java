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
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the id to delete : ");
        int deleteElement= sc.nextInt();
        Student student=em.find(Student.class,deleteElement);

        
        System.out.println("Are you sure you want to delete?");
        Scanner st=new Scanner(System.in);
        String confirmation=st.nextLine();

if(confirmation.equalsIgnoreCase("y")||confirmation.equalsIgnoreCase("yes")){
    em.remove(student);
    trans.commit();
    em.close();
}
    }
}
