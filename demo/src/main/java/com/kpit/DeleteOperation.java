package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteOperation {
    public static void main( String[] args )
    {
        try{
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");

        EntityManager em= emf.createEntityManager();

        EntityTransaction trans=em.getTransaction();
        trans.begin();
        
        System.out.println("Enter flight number to delete ");
        Scanner s1 = new Scanner(System.in);
       
        int flightNumberToSearch = s1.nextInt();
        Flight f1= em.find(Flight.class,flightNumberToSearch);
        
        if(f1 == null ) {
            FlightNotFoundException flightNotFoundEx = new FlightNotFoundException("This flight id does not exists !!! "+flightNumberToSearch);
            throw flightNotFoundEx;
        }

        System.out.println("Current flight no: "+f1.getFlightNumber());
        System.out.println("Current flight name: "+f1.getFlightName());
        System.out.println("Current source: "+f1.getSource());
        System.out.println("Current destination: "+f1.getDestination());

        System.out.println("Are you sure to delete ? ");
        Scanner s2 = new Scanner(System.in);
        String ans = s2.nextLine();
        if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"))
        {
            em.remove(f1);            
            trans.commit();
            System.out.println("Record deleted...");
        }
        else {
            System.out.println("Record NOT deleted....");
        }
    
        em.close();
        System.out.println("Entity manager closed..");
    }
    catch(FlightNotFoundException e) {
        System.out.println("Error : "+e);
    }
    }
}
