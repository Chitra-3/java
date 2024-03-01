package com.example;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTest {
    public static void main(String[] args) {
        System.out.println("Update Example");
        try{
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans=em.getTransaction();
        trans.begin();

        System.out.println("Enter the search element : ");
        Scanner sc1=new Scanner(System.in);
        int searchElement=sc1.nextInt();

        Train train=em.find(Train.class,searchElement);

        if(train==null){
            TrainException e =new TrainException("Train not found exception..");
            throw e;
        }
        System.out.println("Current train id: "+train.getId());
        System.out.println("Current train name: "+train.getName());
        System.out.println("Current train price: "+train.getPrice());
        System.out.println("Current train source: "+train.getSource());
        System.out.println("Current train destination: "+train.getDestination());

        System.out.println("Enter new details");

        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);
        Scanner sc4=new Scanner(System.in);
        Scanner sc5=new Scanner(System.in);

        System.out.println("Enter the new train name : ");
        String newTrainName=sc2.nextLine();

        System.out.println("Enter the new price: ");
        Double newPrice=sc3.nextDouble();


        System.out.println("Enter the new source : ");
        String newTrainSource=sc4.nextLine();
        

        

        System.out.println("Enter the new destination : ");
        String newDestination=sc5.nextLine();

        train.setName(newTrainName);
        train.setPrice(newPrice);
        train.setSource(newTrainSource);
        train.setDestination(newDestination);
        
        em.merge(train);
        trans.commit();

        em.close();
}
    
catch(TrainException e){
    System.out.println("Train detail error.."+e);
}

}
}








