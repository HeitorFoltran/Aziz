package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.CourtCase;
import com.aziz.crud.service.CourtCaseService;

@RestController
@RequestMapping("/courtCases")
public class CourtCaseController extends GenericController<CourtCase, Long> {

    private final CourtCaseService courtCaseService;

    public CourtCaseController(CourtCaseService courtCaseService) {
        super(courtCaseService);
        this.courtCaseService = courtCaseService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourtCase> updateCourtCase(@Valid @PathVariable Long id, @RequestBody CourtCase courtCaseSpecs) {
        return courtCaseService.updateEntity(id, courtCaseSpecs);
    }

}
