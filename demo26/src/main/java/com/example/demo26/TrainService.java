package com.example.demo26;

import java.util.List;

public interface TrainService {
    Train addTrain(Train train);
    Train updateTrain(int id,Train oldTrain);
    Train showTrain(int id);
    List <Train> showAllTrains();
    void deleteTrain(int id);
}
