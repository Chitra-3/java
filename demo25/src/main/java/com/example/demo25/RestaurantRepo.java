package com.example.demo25;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantRepo extends CrudRepository <Restaurant,Integer>{
    Restaurant findById(int id);
    List<Restaurant> findAll();
}
