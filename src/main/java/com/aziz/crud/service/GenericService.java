package com.aziz.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class GenericService<T, ID> {

	protected final JpaRepository<T, ID> repository;

	public GenericService(JpaRepository<T, ID> repository) {
		this.repository = repository;
	}

	public ResponseEntity<List<T>> getAll() {
		List<T> entities = repository.findAll();
		return ResponseEntity.ok(entities);
	}

	public ResponseEntity<T> getById(ID id) {
		Optional<T> entity = repository.findById(id);
		if (entity.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(entity.get());
	}

	public ResponseEntity<T> create(T entity) {
		T savedEntity = repository.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedEntity);
	}

	public ResponseEntity<Void> delete(ID id) {
		Optional<T> entity = repository.findById(id);
		if (entity.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	public ResponseEntity<T> updateEntity(ID id, T updatedEntity) {
		Optional<T> entity = repository.findById(id);
		if (entity.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		T entityToUpdate = entity.get();
		T updated = performUpdate(entityToUpdate, updatedEntity);

		T savedEntity = repository.save(updated);
		return ResponseEntity.ok(savedEntity);
	}

	protected abstract T performUpdate(T existingEntity, T updatedEntity);

}
