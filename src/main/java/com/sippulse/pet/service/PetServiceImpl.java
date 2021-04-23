package com.sippulse.pet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;

import com.sippulse.pet.entity.Consulta;
import com.sippulse.pet.entity.Pet;
import com.sippulse.pet.repository.ConsultaRepository;
import com.sippulse.pet.repository.FuncionarioRepository;
import com.sippulse.pet.repository.PetRepository;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetRepository repository;
	@Autowired
	private ConsultaRepository repositoryConsulta;
	

	@Override
	public Long buscarCpfDoClientePorId(String cpf) {
		Long id = null;
		List<Consulta> consultas = new ArrayList<Consulta>();
		consultas =  repositoryConsulta.findAll();
		for (Consulta consulta : consultas) {
			if(consulta.getCliente().getCpf().equals(cpf)) {
				id = consulta.getCliente().getId(); 
			}
		}
		return id;
	}
	
	@Override
	public ResponseEntity<Consulta> consultarConsultasPetPorCliente(Long id) {
		 return repositoryConsulta.findById(id)
	              .map(record -> ResponseEntity.ok().body(record))
	              .orElse(ResponseEntity.notFound().build());
	}

	@Override
	public Consulta agendarConsulta(Consulta consulta) {
		return repositoryConsulta.save(consulta);
	}

	@Override
	public ResponseEntity alterarConsulta(Long id,Consulta consulta) {
		repositoryConsulta.findById(id).map(record -> {
			record.setDataHorario(consulta.getDataHorario);						
			Consulta updated = repositoryConsulta.save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	@Override
	public ResponseEntity <?> deletarConsulta(Long id) {
		  return repository.findById(id)
	              .map(record -> {
	                  repository.deleteById(id);
	                  return ResponseEntity.ok().build();
	              }).orElse(ResponseEntity.notFound().build());
	}

}