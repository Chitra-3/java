package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class SelectAllTest {
    public static void main(String[] args) {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
    EntityManager em=emf.createEntityManager();
    EntityTransaction trans=em.getTransaction();
    trans.begin();
    TypedQuery <Employee> theEmployee= em.createQuery("From Employee",Employee.class);
    List <Employee> empList=theEmployee.getResultList();

    for(Employee employee:empList){
        
    System.out.println("The emp_id : "+employee.getEmp_id());
    System.out.println("The emp name :"+employee.getEmp_name());
    System.out.println("The emp age: "+employee.getEmp_age());
    System.out.println("The emp dept :"+employee.getEmp_dept());

    trans.commit();
    em.close();
    }
    }
}
