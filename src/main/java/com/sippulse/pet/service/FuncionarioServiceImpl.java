package com.sippulse.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sippulse.pet.entity.Funcionario;
import com.sippulse.pet.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;

	@Override
	public Funcionario cadastrarFuncionario(Funcionario funcionario) {
		return repository.save(funcionario);
	}

}
