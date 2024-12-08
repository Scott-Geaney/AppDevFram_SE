package com.example.appdevfram.services;


import com.example.appdevfram.entities.Household;
import com.example.appdevfram.daos.dtos.HouseholdRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface HouseholdService {
    Household getHouseholdByEircode(String eircode);

    // Method to find a household by its Eircode and fetch pets eagerly
    Household getHouseholdByEircodeWithPets(String eircode);

    // Method to find all households that do not have any pets
    List<Household> getHouseholdsWithNoPets();
}

