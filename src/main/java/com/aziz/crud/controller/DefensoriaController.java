package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Defensoria;
import com.aziz.crud.service.DefensoriaService;


@RestController
@RequestMapping("/defensorias")
public class DefensoriaController extends GenericController<Defensoria, Long>{

private final DefensoriaService defensoriaService;
	
	public DefensoriaController(DefensoriaService defensoriaService) {
		super(defensoriaService);
		this.defensoriaService = defensoriaService;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Defensoria> updateDefensoria(@Valid @PathVariable Long id, @RequestBody Defensoria defensoriaSpecs){
		return defensoriaService.updateEntity(id, defensoriaSpecs);
	}

}

