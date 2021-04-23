package com.sippulse.pet.service;

import org.springframework.http.ResponseEntity;

import com.sippulse.pet.entity.Consulta;

public interface PetService {
	// Interface para o Service
	public Long buscarCpfDoClientePorId(String cpf);
	public ResponseEntity<Consulta> consultarConsultasPetPorCliente(Long id);	
	public Consulta agendarConsulta(Consulta consulta);
	public ResponseEntity alterarConsulta(Long id, Consulta consulta);
	public ResponseEntity<?> deletarConsulta(Long id);
}
