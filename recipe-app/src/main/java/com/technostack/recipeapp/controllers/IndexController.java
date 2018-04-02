package com.technostack.recipeapp.controllers;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.technostack.recipeapp.model.Category;
import com.technostack.recipeapp.model.Recipe;
import com.technostack.recipeapp.model.UnitOfMeasure;
import com.technostack.recipeapp.repository.CategoryRepository;
import com.technostack.recipeapp.repository.RecipeRepository;
import com.technostack.recipeapp.repository.UnitOfMeasureRepository;
import com.technostack.recipeapp.services.Implementation.RecipeServices;

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	private RecipeServices recipeServices;
	
	public IndexController(RecipeServices recipeServices,CategoryRepository categoryRepository,UnitOfMeasureRepository unitOfMeasureRepository){
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
		this.recipeServices =recipeServices;
	}
	
	@RequestMapping({"/","","/index"})
	public String getIndexPage(Model model){
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> uomOptioanl = unitOfMeasureRepository.findByDescription("Teaspoon");
		System.out.println("cat Id: "+ categoryOptional.get().getId());
		System.out.println("Uom Id: "+ uomOptioanl.get().getId());
		return "index.html";
	}
	
	@RequestMapping("/all")
	public String getAllRecipes(Model model){
		model.addAttribute("recipes", recipeServices.getRecipes());
		return "recipeall.html";
	}
}
