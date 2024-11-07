package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.crud.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

