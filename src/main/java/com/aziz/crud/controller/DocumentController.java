package com.aziz.crud.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.crud.model.Document;
import com.aziz.crud.service.DocumentService;

@RestController
@RequestMapping("/documentos")
public class DocumentController extends GenericController<Document, Long> {

	private final DocumentService documentService;

	public DocumentController(DocumentService documentService) {
		super(documentService);
		this.documentService = documentService;
	}

	@PutMapping("/{id}")
	public ResponseEntity<Document> updateDocumento(@Valid @PathVariable Long id, @RequestBody Document documentSpecs) {
		return documentService.updateEntity(id, documentSpecs);
	}

}
