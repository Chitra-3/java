package com.example.demo15.layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo15.layer2.Burger;
@Repository
public interface BurgerRepository extends CrudRepository<Burger,Integer>{
    List<Burger> findAll();
    Burger findById(int id);
    
}
