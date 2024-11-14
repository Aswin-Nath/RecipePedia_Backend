package com.Recipe.RecipePedia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Recipe.RecipePedia.models.recipeLibrary;
import com.Recipe.RecipePedia.services.RecipeLibraryService;
import java.util.*;
@RestController
public class RecipeLibraryController {
    @Autowired
    private RecipeLibraryService RLS;

    @GetMapping("/api/recipeLibrary")
    public List<recipeLibrary> getAllRecipeLibrary(){
        return  RLS.getRecipeLibrary();
    }
}
