package com.example.fleetmanagement.fleet.repository;

import com.example.fleetmanagement.fleet.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    
}
