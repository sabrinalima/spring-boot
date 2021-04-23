package com.sippulse.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sippulse.pet.entity.Consulta;
import com.sippulse.pet.entity.Funcionario;
import com.sippulse.pet.service.FuncionarioService;
import com.sippulse.pet.service.PetService;

@RestController
@RequestMapping({ "/pets" })
public class PetController {
	// TODO - Completar com os Endpoints

	@Autowired
	private FuncionarioService funcionarioService;

	@Autowired
	private PetService petService;

	// Criar novo funcionário
	@PostMapping
	public Funcionario create(@RequestBody Funcionario funcionario) {
		return funcionarioService.cadastrarFuncionario(funcionario);
	}
	
	 @GetMapping(path = {"/{id}"})
	 public Long buscarCpfDoClientePorId(@RequestBody  String cpf) {
		 return buscarCpfDoClientePorId(cpf);
	 }
	 
	 @GetMapping(path = {"/{id}"})
	 public ResponseEntity<Consulta> consultarConsultasPetPorCliente(@PathVariable Long id) {
		 return consultarConsultasPetPorCliente(id);
	 }

	// Criar agendamento
	@PostMapping
	public Consulta agendamentoConsulta(@RequestBody Consulta consulta) {
		return petService.agendarConsulta(consulta);
	}

	// Alterar consulta
	@PutMapping(value = "/{id}")
	public ResponseEntity alterarConsulta(@PathVariable("id") long id, @RequestBody Consulta consulta) {
		return petService.alterarConsulta(id, consulta);
	}
	

	// Deletar produto
	@DeleteMapping(path ={"/{id}"})
	   public ResponseEntity <?> delete(@PathVariable long id) {
		return petService.deletarConsulta(id);
	}

}