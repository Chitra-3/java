package com.example.demo25;

import java.util.List;

public interface RestaurantService {
    Restaurant addRecord(Restaurant restaurant);
    Restaurant modifyRecord(int id,Restaurant oldRecord);
    Restaurant viewRecord(int id);
    List <Restaurant> viewAllRecords();
    void deleteRecord(int id);
}
