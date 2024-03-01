package com.example.demo26;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepo extends CrudRepository <Train,Integer>{
    Train findById(int id);
    List<Train> findAll();
}
