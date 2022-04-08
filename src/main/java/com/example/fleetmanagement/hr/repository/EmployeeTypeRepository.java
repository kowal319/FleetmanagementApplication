package com.example.fleetmanagement.hr.repository;

import com.example.fleetmanagement.hr.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {
    
}
