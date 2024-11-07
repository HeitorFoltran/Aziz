package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.City;
import com.aziz.crud.service.CityService;

@RestController
@RequestMapping("/cidades")
public class CityController extends GenericController<City, Long>{
	
	private final CityService cityService;
	
	public CityController(CityService cityService) {
		super(cityService);
		this.cityService = cityService;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<City> updateCidade(@Valid @PathVariable Long id, @RequestBody City citySpecs){
		return cityService.updateEntity(id, citySpecs);
	}

}
