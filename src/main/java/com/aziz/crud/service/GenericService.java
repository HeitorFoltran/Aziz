package com.aziz.crud.service;

import java.util.List;

import com.aziz.crud.exception.EntityCreationException;
import com.aziz.crud.exception.EntityNotFoundException;
import com.aziz.crud.exception.EntityUpdateException;
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
        T entity = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entidade com o ID " + id + " não foi encontrada"));
        return ResponseEntity.ok(entity);
    }

    public ResponseEntity<T> create(T entity) {
        try {
            T savedEntity = repository.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEntity);
        } catch (Exception e) {
            throw new EntityCreationException("Falha ao fazer o cadastro " + e.getMessage());
        }
    }

    public ResponseEntity<Void> delete(ID id) {
        repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entidade com o ID " + id + " não foi encontrada"));
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<T> updateEntity(ID id, T updatedEntity) {
        T entity = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entidade com o ID " + id + " não foi encontrada"));

        try {
            T updated = performUpdate(entity, updatedEntity);
            T savedEntity = repository.save(updated);
            return ResponseEntity.ok(savedEntity);
        } catch (Exception e) {
            throw new EntityUpdateException("Falha ao atulaizar entidade: " + e.getMessage());
        }
    }

    protected abstract T performUpdate(T existingEntity, T updatedEntity);

}
