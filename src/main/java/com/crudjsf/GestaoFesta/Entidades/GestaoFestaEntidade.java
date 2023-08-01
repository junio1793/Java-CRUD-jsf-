package com.crudjsf.GestaoFesta.Entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_convidado")
public class GestaoFestaEntidade implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "gf_nome_convidado")
	private String nome;
	@Column(name = "gf_qtd_acompanhante")
	private int qtdAcompanhante;
	@Column(name = "gf_nome_acompanhante")
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
