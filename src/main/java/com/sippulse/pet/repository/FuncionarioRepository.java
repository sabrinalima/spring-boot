package com.sippulse.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sippulse.pet.entity.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Long>{

}
