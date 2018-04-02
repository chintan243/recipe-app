package com.technostack.recipeapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.technostack.recipeapp.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	Optional<UnitOfMeasure> findByDescription(String description);
}
