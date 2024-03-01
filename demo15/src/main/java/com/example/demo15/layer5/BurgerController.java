package com.example.demo15.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo15.layer2.Burger;
import com.example.demo15.layer4.BurgerService;

@RestController
public class BurgerController {
    @Autowired
    BurgerService burgerService;

    @PostMapping("/create")
    public Burger createBurger(@RequestBody Burger burger) {
        return burgerService.createBurger(burger);
    }

    @GetMapping("/getAll")
    public List<Burger> getAllBurgers() {
        return burgerService.getAllBurgers();
    }

    @GetMapping("/get/{id}")
    public Burger getBurgerById(@PathVariable int id) {
        return burgerService.getBurgerById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBurger(@PathVariable int id) {
        burgerService.deleteBurger(id);
    }

    @PutMapping("/update/{id}/{burgerCost}")
    public Burger updateBurgerCost(@PathVariable int id, @PathVariable float burgerCost) {
        return burgerService.updateBurgerCost(id, burgerCost);
    }

    @PutMapping("/update/{id}")
    public Burger updateBurger(@PathVariable int id, @RequestBody Burger burger) {
        return burgerService.updateBurger(id, burger);
    }
}
