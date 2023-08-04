package com.crudjsf.GestaoFesta.backendController;

import java.util.List;

import com.crudjsf.GestaoFesta.Entidades.GestaoFestaEntidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudjsf.GestaoFesta.gestaoFestaDTO.GestaoFestaDTO;
import com.crudjsf.GestaoFesta.gestaoFestaService.GestaoFestaService;

@RestController
@RequestMapping(value = "/gestaoFesta")
public class BackendController {

	@Autowired
	private GestaoFestaService gestaoFestaService;
	
	@GetMapping
	public List<GestaoFestaDTO> listarTudo() {
		List<GestaoFestaDTO> result = gestaoFestaService.findAll();
		return result;
	}

	@GetMapping(value = "/{id}")
	public GestaoFestaDTO findId(@PathVariable Long id){
		GestaoFestaDTO i = gestaoFestaService.findId(id);
		return i;
	}

}
