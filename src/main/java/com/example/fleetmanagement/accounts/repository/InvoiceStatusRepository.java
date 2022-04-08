package com.example.fleetmanagement.accounts.repository;

import com.example.fleetmanagement.accounts.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {
    
}
