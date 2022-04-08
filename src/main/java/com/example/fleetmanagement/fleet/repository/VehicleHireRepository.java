package com.example.fleetmanagement.fleet.repository;

import com.example.fleetmanagement.fleet.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {
    
}
