package com.example.fleetmanagement.parameters.controllers;

import com.example.fleetmanagement.parameters.models.Country;
import com.example.fleetmanagement.parameters.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("countries")
    public String getAll(Model model, String keyword) {
        List<Country> countries;
        countries = keyword == null ? countryService.findAll() : countryService.findByKeyword(keyword);
        model.addAttribute("countries", countries);
        return "parameters/countries";
    }
    @GetMapping("/country/{id}")
    @ResponseBody
    public Country getCountry(@PathVariable Integer id){
        return  countryService.getById(id);
    }

    @GetMapping("countryAdd")
    public String addCountry(Model model) {
        return "parameters/countryAdd";
    }

    @PostMapping("countries")
    public String save(Country country){
        countryService.save(country);
        return "redirect:/countries";
    }

    @RequestMapping(value="/countries/delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        countryService.delete(id);
        return "redirect:/countries";
    }

    @GetMapping("country/Edit/{id}")
    public String editCountry(@PathVariable Integer id, Model model) {
        Country country = countryService.getById(id);
        model.addAttribute("country", country);
        return "parameters/countryEdit";
    }
    @GetMapping("country/Details/{id}")
    public String detailsCountry(@PathVariable Integer id, Model model) {
        Country country = countryService.getById(id);
        model.addAttribute("country", country);
        return "parameters/countryDetails";
    }

    @RequestMapping(value="/countries/update/{id}", method = { RequestMethod.GET, RequestMethod.PUT})
    public String update(Country country){
        countryService.save(country);
        return "redirect:/countries";
    }

}