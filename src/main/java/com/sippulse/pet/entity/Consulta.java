package com.sippulse.pet.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Consulta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3765980596613239961L;

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;	 
	 private LocalDateTime dataHorario;
	 @OneToOne
	 private Funcionario veterinario;
	 @OneToOne
	 private Pet pet;
	
}
