package com.sippulse.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sippulse.pet.entity.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{}
