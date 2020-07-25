package com.workload.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.workload.model.Station;
import com.workload.services.RecordNotFoundException;
import com.workload.services.StationService;
 
@RestController
@RequestMapping("/station")
public class StationController
{
    @Autowired
    StationService service;
 
    @GetMapping
    public ResponseEntity<List<Station>> getAllEmployees() {
        List<Station> list = service.getAllStation();
 
        return new ResponseEntity<List<Station>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{stationCode}")
    public ResponseEntity<Station> getStationByCode(@PathVariable("stationCode") Long stationCode) throws RecordNotFoundException {
    	Station entity = service.getStationByCode(stationCode);
 
        return new ResponseEntity<Station>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
    @PostMapping
    public ResponseEntity<Station> createOrUpdateStation(Station station)
                                                    throws RecordNotFoundException {
        Station updated = service.createOrUpdateStation(station);
        return new ResponseEntity<Station>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteStationByCode(@PathVariable("stationCode") Long stationCode) throws RecordNotFoundException {
        service.deleteStationByCode(stationCode);
        return HttpStatus.FORBIDDEN;
    }
 
}