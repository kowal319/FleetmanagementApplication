package com.example.fleetmanagement.parameters.services;

import com.example.fleetmanagement.parameters.models.State;
import com.example.fleetmanagement.parameters.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> findAll(){
        return stateRepository.findAll();
    }
    public State getById(int id){
        return stateRepository.findById(id).orElse(null);
    }

    public void delete(int id){
         stateRepository.deleteById(id);
    }

    public void save(State state){
        stateRepository.save(state);
    }



}
