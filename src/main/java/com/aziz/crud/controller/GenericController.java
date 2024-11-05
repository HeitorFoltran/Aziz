package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aziz.crud.service.GenericService;

import java.util.List;

public abstract class GenericController<T, ID> {

	protected final GenericService<T, ID> service;

	public GenericController(GenericService<T, ID> service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<T>> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<T> getById(@Valid @PathVariable ID id) {
		return service.getById(id);
	}

	@PostMapping
	public ResponseEntity<T> create(@Valid @RequestBody T entity) {
		return service.create(entity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@Valid @PathVariable ID id) {
		return service.delete(id);
	}
}
