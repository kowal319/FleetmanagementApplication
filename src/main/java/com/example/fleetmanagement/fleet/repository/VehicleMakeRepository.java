package com.example.fleetmanagement.fleet.repository;

import com.example.fleetmanagement.fleet.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {
    
}
