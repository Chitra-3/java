package com.example.demo15.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "burger")
public class Burger {
    @Id
    @Column(name = "burgerid")
    private int burgerid;

    @Column(name = "burgerType")
    private String burgerType;

    @Column(name = "burgerCost")
    private float burgerCost;

    public Burger() {
    }

    public Burger(int burgerid, String burgerType, float burgerCost) {
        this.burgerid = burgerid;
        this.burgerType = burgerType;
        this.burgerCost = burgerCost;
    }

    public int getBurgerid() {
        return burgerid;
    }

    public void setBurgerid(int burgerid) {
        this.burgerid = burgerid;
    }

    public String getBurgerType() {
        return burgerType;
    }

    public void setBurgerType(String burgerType) {
        this.burgerType = burgerType;
    }

    public float getBurgerCost() {
        return burgerCost;
    }

    public void setBurgerCost(float burgerCost) {
        this.burgerCost = burgerCost;
    }

}
