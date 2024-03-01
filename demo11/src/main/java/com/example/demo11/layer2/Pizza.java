package com.example.demo11.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pizza")
public class Pizza {
    @Id
    @Column(name="pizzaid")
    private int pizzaNumber;
    @Column(name = "pizzatype")
    private String typeOfPizza;
    @Column(name = "pizzacost")
    private double pizzaPrice;
    public Pizza(){
        System.out.println("Pizza created");
    }
    public int getPizzaNumber() {
        return pizzaNumber;
    }
    public void setPizzaNumber(int pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
    }
    public String getTypeOfPizza() {
        return typeOfPizza;
    }
    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }
    public double getPizzaPrice() {
        return pizzaPrice;
    }
    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
    
}
