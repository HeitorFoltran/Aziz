package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Category;
import com.aziz.crud.service.CategoryService;

@RestController
@RequestMapping("/Categorias")
public class CategoryController extends GenericController<Category, Long> {

	private final CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) {
		super(categoryService);
		this.categoryService = categoryService;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Category> updateCategoria(@Valid @PathVariable Long id, @RequestBody Category categorySpecs){
		return categoryService.updateEntity(id, categorySpecs);
	}
	
}
