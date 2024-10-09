package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.crud.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
