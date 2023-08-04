package com.crudjsf.GestaoFesta.gestaoFestaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crudjsf.GestaoFesta.Entidades.GestaoFestaEntidade;
import com.crudjsf.GestaoFesta.gestaoFestaDTO.GestaoFestaDTO;
import com.crudjsf.GestaoFesta.repositorio.ConvidadoRepositorio;

@org.springframework.stereotype.Service
public class GestaoFestaService {

	@Autowired
	private ConvidadoRepositorio convidadoRepositorio;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GestaoFestaDTO> findAll(){
		List<GestaoFestaEntidade> result = convidadoRepositorio.findAll();
		return result.stream().map( y -> new GestaoFestaDTO(y)).toList();
	}


	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GestaoFestaDTO findId(Long id){
		GestaoFestaEntidade result = convidadoRepositorio.findById(id).get();
		GestaoFestaDTO dto = new GestaoFestaDTO(result);
		return dto;

	}
	
}
