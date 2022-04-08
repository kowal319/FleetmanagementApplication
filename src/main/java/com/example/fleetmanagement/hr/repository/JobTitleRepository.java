package com.example.fleetmanagement.hr.repository;

import com.example.fleetmanagement.hr.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {
    
}
