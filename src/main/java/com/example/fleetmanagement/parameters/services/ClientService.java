package com.example.fleetmanagement.parameters.services;

import com.example.fleetmanagement.parameters.models.Client;
import com.example.fleetmanagement.parameters.models.Location;
import com.example.fleetmanagement.parameters.repository.ClientRepository;
import com.example.fleetmanagement.parameters.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository ;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }
    public Client getById(int id){
        return clientRepository.findById(id).orElse(null);
    }

    public void delete(int id){
        clientRepository.deleteById(id);
    }

    public void save(Client client){
        clientRepository.save(client);
    }


}
