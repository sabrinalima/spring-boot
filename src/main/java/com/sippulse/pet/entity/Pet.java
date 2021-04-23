package com.sippulse.pet.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4338486357883775561L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;	 
	 private String nome;
	 private String descricao;
	 @OneToMany(orphanRemoval = true)
	 private Cliente cliente;
}
