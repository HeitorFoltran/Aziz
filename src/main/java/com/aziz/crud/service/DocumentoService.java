package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Documento;
import com.aziz.crud.repository.DocumentoRepository;

@Service
public class DocumentoService extends GenericService<Documento, Long> {
	
	public DocumentoService(DocumentoRepository repository) {
		super(repository);
	}
	
	@Override
	protected Documento performUpdate(Documento existingDocumento, Documento updatedDocumento) {
		existingDocumento.setDescricao(updatedDocumento.getDescricao());
		return existingDocumento;
	}

}
