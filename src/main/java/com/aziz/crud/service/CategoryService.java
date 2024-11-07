package com.aziz.crud.service;

import org.springframework.stereotype.Service;

import com.aziz.crud.model.Category;
import com.aziz.crud.repository.CategoryRepository;

@Service
public class CategoryService extends GenericService<Category, Long> {
	
	public CategoryService(CategoryRepository repository) {
		super(repository);
	}
	
	@Override
	protected Category performUpdate(Category existingCategory, Category updatedCategory) {
		existingCategory.setDescription(updatedCategory.getDescription());
		return existingCategory;
	}

}
