package com.example.fleetmanagement.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {
    @GetMapping("/employeeType")
    public String getEmployeeType(){
        return "employeeType";
    }
}
