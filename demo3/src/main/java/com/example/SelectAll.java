package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAll {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Employee> typedQuery = em.createQuery("from Employee", Employee.class);
        List<Employee> EmployeeList = typedQuery.getResultList();
        for (Employee employee : EmployeeList) {
            System.out.println("Emp_id: " + employee.getEmpId());
            System.out.println("Emp_name: " + employee.getEmpName());
            System.out.println("Role: " + employee.getEmpRole());
        }
    }
}
