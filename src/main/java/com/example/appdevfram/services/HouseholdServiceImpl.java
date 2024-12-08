package com.example.appdevfram.services;

import com.example.appdevfram.daos.dtos.HouseholdRepository;
import com.example.appdevfram.entities.Household;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HouseholdServiceImpl implements HouseholdService {
    private final HouseholdRepository householdRepository;


    public HouseholdServiceImpl(HouseholdRepository householdRepository) {
        this.householdRepository = householdRepository;
    }

    @Override
    public Household getHouseholdByEircode(String eircode) {
        return householdRepository.findById(eircode).orElse(null);
    }

    @Override
    public Household getHouseholdByEircodeWithPets(String eircode) {
        // Use a custom query or leverage `fetch = FetchType.EAGER` in the entity if configured
        return householdRepository.findByEircode(eircode).stream().findFirst().orElse(null);
    }

    @Override
    public List<Household> getHouseholdsWithNoPets() {
        return householdRepository.findByPetsIsNull();
    }
}
