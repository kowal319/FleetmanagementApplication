package com.example.fleetmanagement.fleet.repository;

import com.example.fleetmanagement.fleet.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {
    
}
