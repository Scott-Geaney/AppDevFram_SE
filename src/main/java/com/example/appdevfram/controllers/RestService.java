package com.example.appdevfram.controllers;

import com.example.appdevfram.entities.Pet;
import com.example.appdevfram.services.PetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class RestService {
    PetService petService;
    @GetMapping("/pets")

    List<Pet> findAll(){
        return petService.getAllPets();
    }



}
