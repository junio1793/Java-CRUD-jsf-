package com.crudjsf.GestaoFesta.gestaoFestaDTO;

import com.crudjsf.GestaoFesta.Entidades.GestaoFestaEntidade;

public class GestaoFestaDTO {

	private Long id;
	private String nome;
	private int qtdAcompanhante;
	private String nomeAcompanhante;
	
	public GestaoFestaDTO() {
	}
	
	public GestaoFestaDTO(GestaoFestaEntidade entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.nomeAcompanhante = entidade.getNomeAcompanhante();
		this.qtdAcompanhante = entidade.getQtdAcompanhante();
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
}
