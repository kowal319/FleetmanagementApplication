package com.example.fleetmanagement.parameters.repository;

import com.example.fleetmanagement.parameters.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
