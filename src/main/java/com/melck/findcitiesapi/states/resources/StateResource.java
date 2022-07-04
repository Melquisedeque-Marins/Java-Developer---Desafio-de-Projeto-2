package com.melck.findcitiesapi.states.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melck.findcitiesapi.states.entities.State;
import com.melck.findcitiesapi.states.repositories.StateRepository;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public List<State> findAll(){
        return stateRepository.findAll();
    }
    
}
