package com.aziz.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Defensor;
import com.aziz.crud.service.DefensorService;

@RestController
@RequestMapping("/defensores")
public class DefensorController extends GenericController<Defensor, Long>{
	
private final DefensorService defensorService;
	
	public DefensorController(DefensorService defensorService) {
		super(defensorService);
		this.defensorService = defensorService;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Defensor> updateDefensor(@PathVariable Long id, @RequestBody Defensor defensorSpecs){
		return defensorService.updateEntity(id, defensorSpecs);
	}

}

