package com.example.fleetmanagement.fleet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {
    @GetMapping("/vehicleMaintenance")
    public String getVehicleMaintance(){
        return "vehicleManitenance";
    }
}
