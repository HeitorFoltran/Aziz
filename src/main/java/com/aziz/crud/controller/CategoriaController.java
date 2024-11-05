package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Categoria;
import com.aziz.crud.service.CategoriaService;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController extends GenericController<Categoria, Long> {

	private final CategoriaService categoriaService;
	
	public CategoriaController(CategoriaService categoriaService) {
		super(categoriaService);
		this.categoriaService = categoriaService;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> updateCategoria(@Valid @PathVariable Long id, @RequestBody Categoria categoriaSpecs){
		return categoriaService.updateEntity(id, categoriaSpecs);
	}
	
}
