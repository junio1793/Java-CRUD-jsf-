package com.crudjsf.GestaoFesta.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GestaoFestaEntidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int qtdAcompanhante;
	private String nomeAcompanhante;
	
	public GestaoFestaEntidade(Long id, String nome, int qtdAcompanhante, String nomeAcompanhante) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtdAcompanhante = qtdAcompanhante;
		this.nomeAcompanhante = nomeAcompanhante;
	} 
	
	public GestaoFestaEntidade() {
	}
	
}
