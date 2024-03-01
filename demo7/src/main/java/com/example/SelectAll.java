package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAll {
    public static void main(String[] args) {
         EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();
        TypedQuery <Student> stud= em.createQuery("from Student",Student.class);
        List <Student> StudentList=stud.getResultList();
        for(Student student:StudentList){
            System.out.println("Student id : "+student.getStudentId());
            System.out.println("Student name : "+student.getStudentName());
            System.out.println("Student age : "+student.getStudentAge());
            System.out.println("Student dept : "+student.getStudentDept());
        }
        trans.commit();
        em.close();
    }
}
