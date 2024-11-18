package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Office;
import com.aziz.crud.service.OfficeService;


@RestController
@RequestMapping("/offices")
public class OfficeController extends GenericController<Office, Long>{

private final OfficeService officeService;
	
	public OfficeController(OfficeService officeService) {
		super(officeService);
		this.officeService = officeService;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Office> updateOffice(@Valid @PathVariable Long id, @RequestBody Office officeSpecs){
		return officeService.updateEntity(id, officeSpecs);
	}

}

