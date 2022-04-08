package com.example.fleetmanagement.parameters.repository;

import com.example.fleetmanagement.parameters.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    
}
