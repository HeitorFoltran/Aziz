package com.aziz.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Documento;
import com.aziz.crud.service.DocumentoService;

@RestController
@RequestMapping("/documentos")
public class DocumentoController extends GenericController<Documento, Long> {

	private final DocumentoService documentoService;

	public DocumentoController(DocumentoService documentoService) {
		super(documentoService);
		this.documentoService = documentoService;
	}

	@PutMapping("/{id}")
	public ResponseEntity<Documento> updateDocumento(@PathVariable Long id, @RequestBody Documento documentoSpecs) {
		return documentoService.updateEntity(id, documentoSpecs);
	}

}
