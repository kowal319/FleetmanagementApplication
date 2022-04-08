package com.example.fleetmanagement.fleet.repository;

import com.example.fleetmanagement.fleet.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {
    
}
