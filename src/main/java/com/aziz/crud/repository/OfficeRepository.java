package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.crud.model.Office;

public interface OfficeRepository extends JpaRepository<Office, Long> {
}
