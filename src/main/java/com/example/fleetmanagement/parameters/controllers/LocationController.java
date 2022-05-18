package com.example.fleetmanagement.parameters.controllers;

import com.example.fleetmanagement.parameters.models.Location;

import com.example.fleetmanagement.parameters.services.CountryService;
import com.example.fleetmanagement.parameters.services.LocationService;
import com.example.fleetmanagement.parameters.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LocationController {
    @Autowired
    private StateService stateService;
    @Autowired private CountryService countryService;
    @Autowired private LocationService locationService;

    public Model addModelAttribute(Model model){
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("locations", locationService.findAll());
        return model;
    }

    @GetMapping("locations")
    public String findAll(Model model) {
        addModelAttribute(model);
        return "parameters/locations";
    }

    @GetMapping("locationAdd")
    public String addLocation(Model model) {
        addModelAttribute(model);
        return "parameters/locationAdd";
    }

    @PostMapping("locations")
    public String save(Location location){
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping(value="/locations/delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        stateService.delete(id);
        return "redirect:/locations";
    }

    @GetMapping("location/{op}/{id}")
    public String editLocation(@PathVariable Integer id, @PathVariable String op, Model model) {
        addModelAttribute(model);
        model.addAttribute("location", locationService.getById(id));
        return "parameters/location" + op;
    }
    @GetMapping("location/Details/{id}")
    public String detailsLocation(@PathVariable Integer id, Model model) {
        Location location = locationService.getById(id);
        model.addAttribute("location", location);
        return "parameters/locationDetails";
    }

    @RequestMapping(value="/locations/update/{id}", method = { RequestMethod.GET, RequestMethod.PUT})
    public String update(Location location){
        locationService.save(location);
        return "redirect:/locations";
    }


}
