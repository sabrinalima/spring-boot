package com.sippulse.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sippulse.pet.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{}
