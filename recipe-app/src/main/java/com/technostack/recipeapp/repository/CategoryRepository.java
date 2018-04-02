package com.technostack.recipeapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.technostack.recipeapp.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{ 
	Optional<Category> findByDescription(String description);
}
