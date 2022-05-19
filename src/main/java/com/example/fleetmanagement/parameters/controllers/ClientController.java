package com.example.fleetmanagement.parameters.controllers;


import com.example.fleetmanagement.parameters.models.Client;
import com.example.fleetmanagement.parameters.models.Contact;
import com.example.fleetmanagement.parameters.services.ClientService;
import com.example.fleetmanagement.parameters.services.CountryService;
import com.example.fleetmanagement.parameters.services.LocationService;
import com.example.fleetmanagement.parameters.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ClientController {

    @Autowired private ClientService clientService ;
    @Autowired private CountryService countryService;
    @Autowired private StateService stateService;

    public Model addModelAttribute(Model model){
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        return model;
    }

    @GetMapping("clients")
    public String findAll(Model model) {
        addModelAttribute(model);
        return "parameters/clients";
    }


    @GetMapping("clientAdd")
    public String addClient(Model model) {
        addModelAttribute(model);
        return "parameters/clientAdd";
    }

    @PostMapping("clients")
    public String save(Client client ){
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value="/clients/delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        clientService.delete(id);
        return "redirect:/clients";
    }

    @GetMapping("client/{op}/{id}")
    public String editClient(@PathVariable Integer id, @PathVariable String op, Model model) {
        addModelAttribute(model);
        model.addAttribute("client", clientService.getById(id));
        return "parameters/client" + op;
    }
    @GetMapping("/client/{id}")
    @ResponseBody
    public Client getClient(@PathVariable Integer id){
        return  clientService.getById(id);
    }

    @GetMapping("client/Details/{id}")
    public String detailsClient(@PathVariable Integer id, Model model) {
        Client client = clientService.getById(id);
        model.addAttribute("client", client);
        return "parameters/clientDetails";
    }

    @RequestMapping(value="/clients/update/{id}", method = { RequestMethod.GET, RequestMethod.PUT})
    public String update(Client client ){
        clientService.save(client);
        return "redirect:/clients";
    }


}
