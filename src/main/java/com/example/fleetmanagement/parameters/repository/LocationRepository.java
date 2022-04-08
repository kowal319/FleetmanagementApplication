package com.example.fleetmanagement.parameters.repository;

import com.example.fleetmanagement.parameters.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    
}
