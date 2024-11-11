package com.Recipe.RecipePedia.controllers;

import com.Recipe.RecipePedia.models.Recipes;
import com.Recipe.RecipePedia.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public ResponseEntity<List<Recipes>> getAllRecipes() {
        List<Recipes> recipes = recipeService.getAllRecipes();
        return ResponseEntity.ok(recipes);
    }
}

