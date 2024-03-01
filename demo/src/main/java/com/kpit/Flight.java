package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "flight_tbl")
public class Flight {
    
    @Id
    @Column(name = "flightNumber")
    private int flightNumber;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Column(name="flightName")
    private String flightName;

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    @Column(name="source")
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Column(name="destination")
    private String destination;

    public Flight(int flightNumber, String flightName, String source, String destination, int cost) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.cost=cost;
    }

    @Column(name="cost")
    private int cost;

    

    public Flight() {
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCost() {
    
        return cost;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }
}
