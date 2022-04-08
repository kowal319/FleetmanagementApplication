package com.example.fleetmanagement.fleet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {
    @GetMapping("/vehicleMovement")
    public String getVehicleMovement(){
        return "vehicleMovement";
    }
}
