package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.crud.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
