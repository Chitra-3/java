package com.example;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAllTest {
    public static void main(String[] args) {
         EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        TypedQuery <Employee> emp= em.createQuery("from Employee",Employee.class);
        List <Employee> empList= emp.getResultList();
        for(Employee employee:empList){
        System.out.println("Employee id: "+employee.getEmp_id());  
        System.out.println("Employee name: "+employee.getEmp_name());  
        System.out.println("Employee dept: "+employee.getEmp_dept());  

        }
        trans.commit();
        em.close();
    }
}
