package com.example.demo25;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @PostMapping("/add")
    Restaurant addRecord(@RequestBody Restaurant restaurant){
        return restaurantService.addRecord(restaurant);
    }

    @PutMapping("/update")
    Restaurant modifyRecord(int id,Restaurant oldRecord){
        return restaurantService.modifyRecord(id, oldRecord);
    }    

    @GetMapping("/show")
    Restaurant viewRecord(int id){
        return restaurantService.viewRecord(id);
    }

    @GetMapping("/showAll")
    List<Restaurant> viewAllRecords() {
        return restaurantService.viewAllRecords();
    }    

    @DeleteMapping("/delete")
    void deleteRecord(int id){
        restaurantService.deleteRecord(id);
    }


}
