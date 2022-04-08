package com.example.fleetmanagement.fleet.repository;

import com.example.fleetmanagement.fleet.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {
    
}
