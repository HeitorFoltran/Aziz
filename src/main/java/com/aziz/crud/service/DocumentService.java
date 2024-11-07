package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Document;
import com.aziz.crud.repository.DocumentRepository;

@Service
public class DocumentService extends GenericService<Document, Long> {
	
	public DocumentService(DocumentRepository repository) {
		super(repository);
	}
	
	@Override
	protected Document performUpdate(Document existingDocument, Document updatedDocument) {
		existingDocument.setDescription(updatedDocument.getDescription());
		return existingDocument;
	}

}
