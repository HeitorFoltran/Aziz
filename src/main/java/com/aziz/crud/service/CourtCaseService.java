package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.CourtCase;
import com.aziz.crud.repository.CourtCaseRepository;

@Service
public class CourtCaseService extends GenericService<CourtCase, Long>{
	
	public CourtCaseService(CourtCaseRepository repository) {
		super(repository);
	}
	
	@Override
	protected CourtCase performUpdate(CourtCase existingCaso, CourtCase updatedCaso) {
		existingCaso.setDocument(updatedCaso.getDocument());
		existingCaso.setDefender(updatedCaso.getDefender());
		existingCaso.setDescription(updatedCaso.getDescription());
		existingCaso.setClient(updatedCaso.getClient());
		existingCaso.setCategory(updatedCaso.getCategory());
		existingCaso.setStatus(updatedCaso.getStatus());
		return existingCaso;
	}

}
