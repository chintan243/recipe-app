package com.technostack.recipeapp.services.Implementation;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.technostack.recipeapp.model.Recipe;
import com.technostack.recipeapp.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeServices{
	
	private RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipeSet= new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}

}
