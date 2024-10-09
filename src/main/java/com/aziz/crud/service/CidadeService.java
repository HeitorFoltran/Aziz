package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Cidade;
import com.aziz.crud.repository.CidadeRepository;

@Service
public class CidadeService extends GenericService<Cidade, Long> {
	
	public CidadeService(CidadeRepository repository) {
		super(repository);
	}
	
	@Override
	protected Cidade performUpdate(Cidade existingCidade, Cidade updatedCidade) {
		existingCidade.setDescricao(updatedCidade.getDescricao());
		return existingCidade;
	}

}