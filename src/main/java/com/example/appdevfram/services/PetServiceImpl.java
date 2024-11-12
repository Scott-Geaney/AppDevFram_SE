package com.example.appdevfram.services;

import com.example.appdevfram.daos.dtos.PetRepository;
import com.example.appdevfram.entities.Pet;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class PetServiceImpl implements PetService {
    @Override
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    PetRepository petRepository;
}
