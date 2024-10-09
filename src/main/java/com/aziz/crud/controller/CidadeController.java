package com.aziz.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Cidade;
import com.aziz.crud.service.CidadeService;

@RestController
@RequestMapping("/cidades")
public class CidadeController extends GenericController<Cidade, Long>{
	
	private final CidadeService cidadeService;
	
	public CidadeController(CidadeService cidadeService) {
		super(cidadeService);
		this.cidadeService = cidadeService;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cidade> updateCidade(@PathVariable Long id, @RequestBody Cidade cidadeSpecs){
		return cidadeService.updateEntity(id, cidadeSpecs);
	}

}
