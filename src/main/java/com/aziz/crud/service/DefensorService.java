package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Defensor;
import com.aziz.crud.repository.DefensorRepository;

@Service
public class DefensorService extends GenericService<Defensor, Long> {
	
	public DefensorService(DefensorRepository repository) {
		super(repository);
	}
	
	@Override
	protected Defensor performUpdate(Defensor existingDefensor, Defensor updatedDefensor) {
		existingDefensor.setCpf(updatedDefensor.getCpf());
		existingDefensor.setSenha(updatedDefensor.getSenha());
		return existingDefensor;
	}

}
