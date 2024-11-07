package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Office;
import com.aziz.crud.repository.OfficeRepository;

@Service
public class OfficeService extends GenericService<Office, Long> {

	public OfficeService(OfficeRepository repository) {
		super(repository);
	}

	@Override
	protected Office performUpdate(Office existingOffice, Office updatedOffice) {
		existingOffice.setCourtCase(updatedOffice.getCourtCase());
		existingOffice.setDefender(updatedOffice.getDefender());
		return existingOffice;
	}

}
