package com.example.fleetmanagement.parameters.repository;

import com.example.fleetmanagement.parameters.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
    
}
