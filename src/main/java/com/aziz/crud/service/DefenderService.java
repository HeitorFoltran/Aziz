package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Defender;
import com.aziz.crud.repository.DefenderRepository;

@Service
public class DefenderService extends GenericService<Defender, Long> {
	
	public DefenderService(DefenderRepository repository) {
		super(repository);
	}
	
	@Override
	protected Defender performUpdate(Defender existingDefender, Defender updatedDefender) {
		existingDefender.setCpf(updatedDefender.getCpf());
		existingDefender.setPassword(updatedDefender.getPassword());
		return existingDefender;
	}

}
