package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PatchMapping("/{id}/status")
    public ResponseEntity<CourtCase> updateStatus(@PathVariable Long id, @RequestParam Boolean status){
        return courtCaseService.updateStatus(id, status);
    }

}
