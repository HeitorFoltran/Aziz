package com.aziz.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.CasoJudicial;
import com.aziz.crud.service.CasoJudicialService;

@RestController
@RequestMapping("/CasosJudiciais")
public class CasoJudicialController extends GenericController<CasoJudicial, Long> {

    private final CasoJudicialService casoJudicialService;

    public CasoJudicialController(CasoJudicialService casoJudicialService) {
        super(casoJudicialService);
        this.casoJudicialService = casoJudicialService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<CasoJudicial> updateCasoJudicial(@PathVariable Long id, @RequestBody CasoJudicial casoJudicialSpecs) {
        return casoJudicialService.updateEntity(id, casoJudicialSpecs);
    }

}
