package com.example.fleetmanagement.hr.repository;

import com.example.fleetmanagement.hr.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
