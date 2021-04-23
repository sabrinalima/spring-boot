package com.sippulse.pet.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
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
