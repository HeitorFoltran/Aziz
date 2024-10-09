package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.CasoJudicial;
import com.aziz.crud.repository.CasoJudicialRepository;

@Service
public class CasoJudicialService extends GenericService<CasoJudicial, Long>{
	
	public CasoJudicialService (CasoJudicialRepository repository) {
		super(repository);
	}
	
	@Override
	protected CasoJudicial performUpdate(CasoJudicial existingCaso, CasoJudicial updatedCaso) {
		existingCaso.setDocumento(updatedCaso.getDocumento());
		existingCaso.setDefensor(updatedCaso.getDefensor());
		existingCaso.setDescricao(updatedCaso.getDescricao());
		existingCaso.setCliente(updatedCaso.getCliente());
		existingCaso.setCategoria(updatedCaso.getCategoria());
		existingCaso.setAptidao(updatedCaso.getAptidao());
		return existingCaso;
	}

}
