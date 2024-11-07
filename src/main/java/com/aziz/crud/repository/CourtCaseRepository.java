package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.crud.model.CourtCase;

public interface CourtCaseRepository extends JpaRepository<CourtCase, Long>{
}
