package com.melck.findcitiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melck.findcitiesapi.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    
}
