package com.example.demo15;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo15.layer2.Burger;
import com.example.demo15.layer4.BurgerService;

@SpringBootTest
public class BurgerServiceTests {
    @Autowired
    BurgerService burgerService;

    @Test
    public void createBurgerTest() {
        Burger burger = new Burger(1, "CheeseBurger", 200f);
        burgerService.createBurger(burger);
    }
    @Test
    public void getAllBurgersTest() {
        List<Burger> burgers = burgerService.getAllBurgers();
        for (Burger burger : burgers) {
            System.out.println(" Burger: " + burger);
        }
    }
    @Test
    public void getBurgerByIdTest(){
        Burger burger= burgerService.getBurgerById(1);
        System.out.println("Burger:"+burger);
    }
    @Test
    public void deleteBurgerTest(){
        burgerService.deleteBurger(1);
    }
    @Test
    public void updateBurgerCostTest(){
        Burger burger=burgerService.updateBurgerCost(2, 400);
        System.out.println("Burger:"+burger);
    }
    public void updateBurgerTest(){
       Burger burger= burgerService.updateBurger(2,new Burger(3,"Mushroom Burger",250));
       System.out.println("Burger:"+burger);
    }
}
