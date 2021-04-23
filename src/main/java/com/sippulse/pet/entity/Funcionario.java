package com.sippulse.pet.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -377200864327712041L;

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;	 
	 private String nome;
	 private String email;
	 private String cpf;
	 private String celular;
	 private String endereço;
	 private String usuario;
	 private String senha;
	 private Boolean isVeterinario;
}
