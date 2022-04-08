package com.example.fleetmanagement.parameters.repository;

import com.example.fleetmanagement.parameters.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    
}
