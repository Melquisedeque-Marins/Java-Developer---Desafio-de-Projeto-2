package com.melck.findcitiesapi.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melck.findcitiesapi.states.entities.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{
    
}
