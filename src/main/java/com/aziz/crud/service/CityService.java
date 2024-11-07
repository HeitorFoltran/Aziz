package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.City;
import com.aziz.crud.repository.CityRepository;

@Service
public class CityService extends GenericService<City, Long> {
	
	public CityService(CityRepository repository) {
		super(repository);
	}
	
	@Override
	protected City performUpdate(City existingCity, City updatedCity) {
		existingCity.setDescription(updatedCity.getDescription());
		return existingCity;
	}

}