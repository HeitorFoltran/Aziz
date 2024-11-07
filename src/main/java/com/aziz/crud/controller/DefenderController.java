package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Defender;
import com.aziz.crud.service.DefenderService;

@RestController
@RequestMapping("/defensores")
public class DefenderController extends GenericController<Defender, Long>{
	
private final DefenderService defenderService;
	
	public DefenderController(DefenderService defenderService) {
		super(defenderService);
		this.defenderService = defenderService;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Defender> updateDefensor(@Valid @PathVariable Long id, @RequestBody Defender defenderSpecs){
		return defenderService.updateEntity(id, defenderSpecs);
	}

}

