package com.example.appdevfram.daos.dtos;

import com.example.appdevfram.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet, Integer> {
    List<Pet> findByHouseholdEircode(String eircode); // Find pets by household eircode

}
