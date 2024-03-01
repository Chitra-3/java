package com.example.demo15.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo15.layer2.Burger;
import com.example.demo15.layer3.BurgerRepository;

@Service
public class BurgerServiceImpl implements BurgerService {
    @Autowired
    BurgerRepository burgerRepository;

    @Override
    public Burger createBurger(Burger burger) {
        return burgerRepository.save(burger);
    }

    @Override
    public List<Burger> getAllBurgers() {

        return burgerRepository.findAll();

    }

    @Override
    public Burger getBurgerById(int id) {
        return burgerRepository.findById(id);
    }

    @Override
    public void deleteBurger(int id) {
        burgerRepository.deleteById(id);
    }

    @Override
    public Burger updateBurgerCost(int id, float burgerCost) {
        Burger burger = burgerRepository.findById(id);
        burger.setBurgerCost(burgerCost);
        return burgerRepository.save(burger);

    }

    @Override
    public Burger updateBurger(int id, Burger updatedBurger) {
        Burger burger = burgerRepository.findById(id);

        if (updatedBurger.getBurgerType() != null) {
            burger.setBurgerType(updatedBurger.getBurgerType());
        }
        if (updatedBurger.getBurgerCost() != 0.0) {
            burger.setBurgerCost(updatedBurger.getBurgerCost());
        }
        return burgerRepository.save(burger);
    }

}
