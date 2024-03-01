package com.example.demo15.layer4;

import java.util.List;

import com.example.demo15.layer2.Burger;

public interface BurgerService {
    Burger createBurger(Burger burger);
    List<Burger> getAllBurgers();  
    Burger getBurgerById(int id);
    void deleteBurger(int id);
    Burger updateBurgerCost(int id, float burgerCost);
    Burger updateBurger(int id, Burger burger);
    
} 
