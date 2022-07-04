package com.melck.findcitiesapi.cities.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melck.findcitiesapi.cities.entities.City;
import com.melck.findcitiesapi.cities.repositories.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository cityRepository;
    

    @GetMapping
    public List<City> findAll(){
       return cityRepository.findAll();
    }
}
