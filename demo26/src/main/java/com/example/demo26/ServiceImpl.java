package com.example.demo26;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceImpl implements TrainService{
    @Autowired
    TrainRepo trainRepo;


    @Override
    public Train addTrain(Train train) {
       return trainRepo.save(train);
    }

    @Override
    public Train updateTrain(int id, Train oldTrain) {
       Train newTrain= trainRepo.findById(id);
      if(oldTrain.getTname()!=null){
        newTrain.setTname(oldTrain.getTname());
      }
      return trainRepo.save(newTrain);
    }

    @Override
    public Train showTrain(int id) {
        return trainRepo.findById(id);
    }

    @Override
    public List<Train> showAllTrains() {
       return trainRepo.findAll();
    }

    @Override
    public void deleteTrain(int id) {
       trainRepo.deleteById(id);
    }
    
    
}
