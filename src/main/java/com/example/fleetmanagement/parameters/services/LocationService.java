package com.example.fleetmanagement.parameters.services;

import com.example.fleetmanagement.parameters.models.Location;
import com.example.fleetmanagement.parameters.models.State;
import com.example.fleetmanagement.parameters.repository.LocationRepository;
import com.example.fleetmanagement.parameters.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> findAll(){
        return locationRepository.findAll();
    }
    public Location getById(int id){
        return locationRepository.findById(id).orElse(null);
    }

    public void delete(int id){
        locationRepository.deleteById(id);
    }

    public void save(Location location){
        locationRepository.save(location);
    }

}
