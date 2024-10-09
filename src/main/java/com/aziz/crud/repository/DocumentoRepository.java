package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.crud.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
