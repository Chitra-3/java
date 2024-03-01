package com.kpit;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOperation {
    public static void main( String[] args )
    {
        try{
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");

        EntityManager em= emf.createEntityManager();

        EntityTransaction trans=em.getTransaction();
        trans.begin();

            
        System.out.println("Enter flight number to modify ");
         Scanner s1=new Scanner(System.in);
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

       
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);

        System.out.println("Enter new source: ");
        String newSource=s2.nextLine();
        System.out.println("Enter new destination: ");
        String newDest=s3.nextLine();
         
        System.out.println("Enter the cost ");
        Scanner s4=new Scanner(System.in);
        int newCost= s4.nextInt();

        System.out.println("Setting newSrc,newDest and newTicketCost to the flight object.....");
        f1.setSource(newSource);
        f1.setDestination(newDest);
        f1.setCost(newCost);
        
        
        em.merge(f1);
        System.out.println("Object is modified...");
        
        trans.commit();
        System.out.println("Record updated...");

        em.close();
        System.out.println("Entity manager closed..");
    }
    catch(FlightNotFoundException e) {
        System.out.println("Error : "+e);
    }
    }

}

