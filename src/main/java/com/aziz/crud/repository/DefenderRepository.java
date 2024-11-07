package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.aziz.crud.model.Defender;

public interface DefenderRepository extends JpaRepository<Defender, Long> {
}
