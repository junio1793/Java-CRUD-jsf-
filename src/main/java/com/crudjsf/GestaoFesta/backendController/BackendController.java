package com.crudjsf.GestaoFesta.backendController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudjsf.GestaoFesta.Entidades.GestaoFestaEntidade;
import com.crudjsf.GestaoFesta.repositorio.ConvidadoRepositorio;

@RestController
@RequestMapping(value = "/gestaoFesta")
public class BackendController {

	@Autowired
	private ConvidadoRepositorio convidadoRepositorio;
	
	@GetMapping
	public List<GestaoFestaEntidade> listarTudo() {
		List<GestaoFestaEntidade> result = convidadoRepositorio.findAll();
		return result;
	}
	
}
