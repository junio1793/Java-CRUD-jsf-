package com.crudjsf.GestaoFesta.backendController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gestaoFesta")
public class BackendController {

	@GetMapping
	public String ola() {
		return "Oi";
	}
	
}
