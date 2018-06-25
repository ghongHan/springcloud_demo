package com.hskj.service;

import com.hskj.common.dto.Message;
import com.hskj.common.dto.TrainDto;
import org.springframework.http.ResponseEntity;

/**
 * Created by Administrator on 2017/12/18.
 */
public interface TrainService {

    public ResponseEntity<Message> getAllTrains();

    public ResponseEntity<Message> addTrain(TrainDto trainDto);

    public ResponseEntity<Message> findTrainByRailStationId(Long railStationId);

    public ResponseEntity<Message> getAllTrain(Long stationId);

}
