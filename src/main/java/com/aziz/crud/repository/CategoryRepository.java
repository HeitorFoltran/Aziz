package com.aziz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.crud.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
