package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.crud.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

