package com.technostack.recipeapp.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.technostack.recipeapp.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
