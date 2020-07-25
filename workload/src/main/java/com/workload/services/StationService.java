package com.workload.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workload.model.Employee;
import com.workload.model.Station;
 
@Service
public class StationService {
     
    @Autowired
    com.workload.repository.StationRepository repository;
     
    public List<Station> getAllEmployees()
    {
        List<Station> stationList = repository.findAll();
         
        if(stationList.size() > 0) {
            return stationList;
        } else {
            return new ArrayList<Station>();
        }
    }
     
    public Station getStaionByStationCode(Long StationCode) throws RecordNotFoundException
    {
        Optional<Station> station = repository.findById(StationCode);
         
        if(station.isPresent()) {
            return station.get();
        } else {
            throw new RecordNotFoundException();
        }
    }
     
    public Station createOrUpdateStation(Station entity) throws RecordNotFoundException
    {
        Optional<Station> station = repository.findById(entity.getStationCode());
         
        if(station.isPresent())
        {
            Station newEntity = station.get();
            newEntity.setStationCode();
            newEntity.setStationName();
            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    }
     
    public void deleteStationByCode(Long id) throws RecordNotFoundException
    {
        Optional<Station> station = repository.findById(id);
         
        if(station.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException();
        }
    }
}