package com.example.fleetmanagement.parameters.services;

import com.example.fleetmanagement.parameters.models.Contact;
import com.example.fleetmanagement.parameters.models.Country;
import com.example.fleetmanagement.parameters.repository.ContactRepository;
import com.example.fleetmanagement.parameters.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository ;

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }


    public  void save(Contact contact){
        contactRepository.save(contact);
    }

    public void delete(Integer id) {
        contactRepository.deleteById(id);
    }

    public Contact getById(Integer id) {
        return contactRepository.findById(id).orElse(null);
    }

    public void update(Contact contact ) {
        contactRepository.save(contact);
    }

}
