package com.example.fleetmanagement.parameters.controllers;

import com.example.fleetmanagement.parameters.models.Country;
import com.example.fleetmanagement.parameters.models.State;
import com.example.fleetmanagement.parameters.services.CountryService;
import com.example.fleetmanagement.parameters.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StateController {
    @Autowired
    private StateService stateService;
    @Autowired private CountryService countryService;

    public Model addModelAttribute(Model model){
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("countries", countryService.findAll());
        return model;
    }

    @GetMapping("states")
    public String getAll(Model model, String keyword) {
        List<State> states = stateService.findAll();
        model.addAttribute("states", states);
        return "parameters/states";
    }

    @GetMapping("stateAdd")
    public String addState(Model model) {
        addModelAttribute(model);
        return "parameters/stateAdd";
    }

    @PostMapping("states")
    public String save(State state){
        stateService.save(state);
        return "redirect:/states";
    }

    @RequestMapping(value="/states/delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }

    @GetMapping("state/{op}/{id}")
    public String editState(@PathVariable Integer id, @PathVariable String op, Model model) {
        addModelAttribute(model);
        model.addAttribute("state", stateService.getById(id));
        return "parameters/state" + op;
    }
    @GetMapping("state/Details/{id}")
    public String detailsState(@PathVariable Integer id, Model model) {
        State state = stateService.getById(id);
        model.addAttribute("state", state);
        return "parameters/stateDetails";
    }

    @RequestMapping(value="/states/update/{id}", method = { RequestMethod.GET, RequestMethod.PUT})
    public String update(State state){
        stateService.save(state);
        return "redirect:/states";
    }
}
