package com.crudjsf.GestaoFesta.backendController;

import java.util.List;

import com.crudjsf.GestaoFesta.Entidades.GestaoFestaEntidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping
	public ResponseEntity<GestaoFestaEntidade> salvarEntidade(@RequestBody GestaoFestaDTO gestaoFestaDTO){
		try {
			GestaoFestaEntidade salvarEntity = gestaoFestaService.save(gestaoFestaDTO);
			return  ResponseEntity.status(HttpStatus.CREATED).body(salvarEntity);
		}catch (Exception e){
			return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<GestaoFestaEntidade> atualizarConvidado(
			@PathVariable Long id,
			@RequestBody GestaoFestaDTO gestaoFestaDTO){
			GestaoFestaEntidade gestaoFestaEntidade = gestaoFestaService.atualizarConvidado(id,gestaoFestaDTO);
			return ResponseEntity.ok(gestaoFestaEntidade);


	}

}
