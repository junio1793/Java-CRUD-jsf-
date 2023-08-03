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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAcompanhante() {
		return qtdAcompanhante;
	}

	public void setQtdAcompanhante(int qtdAcompanhante) {
		this.qtdAcompanhante = qtdAcompanhante;
	}

	public String getNomeAcompanhante() {
		return nomeAcompanhante;
	}

	public void setNomeAcompanhante(String nomeAcompanhante) {
		this.nomeAcompanhante = nomeAcompanhante;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
