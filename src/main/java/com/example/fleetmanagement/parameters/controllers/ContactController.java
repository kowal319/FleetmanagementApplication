package com.example.fleetmanagement.parameters.controllers;

import com.example.fleetmanagement.parameters.models.Contact;

import com.example.fleetmanagement.parameters.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    public Model addModelAttribute(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return model;
    }

        @GetMapping("contacts")
        public String findAll(Model model) {
            addModelAttribute(model);
            return "parameters/contacts";
        }


    @GetMapping("/contact/{id}")
    @ResponseBody
    public Contact getContact(@PathVariable Integer id){
        return  contactService.getById(id);
    }

    @GetMapping("contactAdd")
    public String addCountry(Model model) {
        return "parameters/contactAdd";
    }

    @PostMapping("contacts")
    public String save(Contact contact){
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value="/contacts/delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        contactService.delete(id);
        return "redirect:/contacts";
    }

    @GetMapping("contact/Edit/{id}")
    public String editContact(@PathVariable Integer id, Model model) {
        Contact contact  = contactService.getById(id);
        model.addAttribute("contact", contact);
        return "parameters/contactEdit";
    }
    @GetMapping("contact/Details/{id}")
    public String detailsContact(@PathVariable Integer id, Model model) {
        Contact contact  = contactService.getById(id);
        model.addAttribute("contact", contact);
        return "parameters/contactDetails";
    }

    @RequestMapping(value="/contacts/update/{id}", method = { RequestMethod.GET, RequestMethod.PUT})
    public String update(Contact contact){
        contactService.save(contact);
        return "redirect:/contacts";
    }

}
