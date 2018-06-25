package com.hskj.controller;

import com.hskj.common.dto.Message;
import com.hskj.common.dto.TrainDto;
import com.hskj.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/12/18.
 */

@RestController
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @RequestMapping(value = "/allTrains", method = RequestMethod.GET)
    public ResponseEntity<Message> getAllTrains(){
        return trainService.getAllTrains();
    }

    @PostMapping("/addTrain")
    public ResponseEntity<Message> addTrain(@RequestBody TrainDto trainDto){
        return trainService.addTrain(trainDto);
    }

    @RequestMapping(value = "/getTrainByStationId", method = RequestMethod.GET)
    public ResponseEntity<Message> getTrainByStationId(@RequestParam("stationId") Long stationId){
        return trainService.findTrainByRailStationId(stationId);
    }

    @RequestMapping(value = "/getAllTrain" , method = RequestMethod.GET)
    public ResponseEntity<Message> getAllTrains(@RequestParam("stationId") Long stationId){
        return trainService.getAllTrain(stationId);
    }

}
