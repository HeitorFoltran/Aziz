package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Defensoria;
import com.aziz.crud.repository.DefensoriaRepository;

@Service
public class DefensoriaService extends GenericService<Defensoria, Long> {

	public DefensoriaService(DefensoriaRepository repository) {
		super(repository);
	}

	@Override
	protected Defensoria performUpdate(Defensoria existingDefensoria, Defensoria updatedDefensoria) {
		existingDefensoria.setCasoJudicial(updatedDefensoria.getCasoJudicial());
		existingDefensoria.setDefensor(updatedDefensoria.getDefensor());
		return existingDefensoria;
	}

}
