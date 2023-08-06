package com.crudjsf.GestaoFesta.gestaoFestaService;

import java.util.List;

import jakarta.persistence.EntityNotFoundException;
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

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GestaoFestaEntidade save(GestaoFestaDTO gestaoFestaDTO){
		GestaoFestaEntidade result = new GestaoFestaEntidade();
		result.setId(gestaoFestaDTO.getId());
		result.setNome(gestaoFestaDTO.getNome());
		result.setNomeAcompanhante(gestaoFestaDTO.getNomeAcompanhante());
		result.setQtdAcompanhante(gestaoFestaDTO.getQtdAcompanhante());
		return convidadoRepositorio.save(result);
	}

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GestaoFestaEntidade atualizarConvidado(Long id,GestaoFestaDTO gestaoFestaDTO ){
		GestaoFestaEntidade jaExisteConvidado = convidadoRepositorio.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Convidado não encontrado"));
				jaExisteConvidado.setNome(gestaoFestaDTO.getNome());
				jaExisteConvidado.setNomeAcompanhante(gestaoFestaDTO.getNomeAcompanhante());
				jaExisteConvidado.setId(gestaoFestaDTO.getId());
				jaExisteConvidado.setQtdAcompanhante(gestaoFestaDTO.getQtdAcompanhante());
				return convidadoRepositorio.save(jaExisteConvidado);
	}

}
