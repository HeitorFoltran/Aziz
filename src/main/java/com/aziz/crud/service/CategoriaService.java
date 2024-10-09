package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Categoria;
import com.aziz.crud.repository.CategoriaRepository;

@Service
public class CategoriaService extends GenericService<Categoria, Long> {
	
	public CategoriaService(CategoriaRepository repository) {
		super(repository);
	}
	
	@Override
	protected Categoria performUpdate(Categoria existingCategoria, Categoria updatedCategoria) {
		existingCategoria.setDescricao(updatedCategoria.getDescricao());
		return existingCategoria;
	}

}
