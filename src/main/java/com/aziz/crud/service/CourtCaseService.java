package com.aziz.crud.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.aziz.crud.model.CourtCase;
import com.aziz.crud.repository.CourtCaseRepository;

@Service
public class CourtCaseService extends GenericService<CourtCase, Long> {

    private final CourtCaseRepository courtCaseRepository;

    public CourtCaseService(CourtCaseRepository repository, CourtCaseRepository courtCaseRepository) {
        super(repository);
        this.courtCaseRepository = courtCaseRepository;
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

    public ResponseEntity<CourtCase> updateStatus(Long id, Boolean updatedStatus) {
        CourtCase courtCase = courtCaseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Caso não encontrado"));

        courtCase.setStatus(updatedStatus);
        courtCaseRepository.save(courtCase);
        return ResponseEntity.ok().build();

    }

}
