package com.example.demo25;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements RestaurantService{
    @Autowired
    RestaurantRepo restaurantRepo;

    @Override
    public Restaurant addRecord(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public Restaurant modifyRecord(int id,Restaurant oldRecord) {
       Restaurant newRecord=restaurantRepo.findById(id);
       if(oldRecord.getP_name()!=null){
        newRecord.setP_name(oldRecord.getP_name());
       }
        return restaurantRepo.save(newRecord);
    }

    @Override
    public Restaurant viewRecord(int id) {
        return restaurantRepo.findById(id);
    }

    @Override
    public List<Restaurant> viewAllRecords() {
       return restaurantRepo.findAll();
    }

    @Override
    public void deleteRecord(int id) {
       restaurantRepo.deleteById(id);
    }
    
}
