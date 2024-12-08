package com.example.appdevfram.daos.dtos;

import com.example.appdevfram.entities.Household;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HouseholdRepository extends JpaRepository<Household, String> {

    // Default methods like findById() are already provided by JpaRepository

    List<Household> findByEircode(String eircode); // To find Household by eircode

    // This method will automatically fetch households with no pets
    List<Household> findByPetsIsNull(); // Households that do not have pets
}