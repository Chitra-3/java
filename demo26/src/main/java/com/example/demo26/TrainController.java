package com.example.demo26;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="https://localhost:4200")
public class TrainController {
    @Autowired
    TrainService trainService;

    @PostMapping("/add")
    Train addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
    }

    @PutMapping("/update/{id}")
    Train updateTrain(@PathVariable int id,@RequestBody Train oldTrain) {
        return trainService.updateTrain(id, oldTrain);
    }

    @GetMapping("/show/{id}")
    Train showTrain(@PathVariable int id){
        return trainService.showTrain(id);
    }

    @GetMapping("/showAll")
    List<Train> showAllTrains(){
        return trainService.showAllTrains();
    }

    @DeleteMapping("/delete/{id}")
    void deleteTrain(@PathVariable int id){
        trainService.deleteTrain(id);
    }
}
