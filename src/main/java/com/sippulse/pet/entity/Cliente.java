package com.sippulse.pet.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5737395784661322746L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;	 
	 private String nome;
	 private String email;
	 private String celular;
	 private String endereço;
	 private String cpf;
	 @ManyToOne(cascade = CascadeType.ALL)
	 private List<Pet> pets;

}
