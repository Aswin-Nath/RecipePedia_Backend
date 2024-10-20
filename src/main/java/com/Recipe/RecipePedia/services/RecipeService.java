package com.Recipe.RecipePedia.services;

import com.Recipe.RecipePedia.models.Recipes;
import com.Recipe.RecipePedia.repositories.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipesRepository recipesRepository;

    public List<Recipes> getAllRecipes() {
        return recipesRepository.findAll();
    }
}
