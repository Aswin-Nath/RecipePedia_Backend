package com.Recipe.RecipePedia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Recipe.RecipePedia.models.recipeLibrary;
import com.Recipe.RecipePedia.services.RecipeLibraryService;
import java.util.*;
@RestController
@RequestMapping("/api/recipeLibrary")
public class RecipeLibraryController {
    
    private RecipeLibraryService RLS;
    @Autowired
    public RecipeLibraryController(RecipeLibraryService RLS){
        this.RLS=RLS;
    }
    @GetMapping
    public List<recipeLibrary> getAllRecipeLibrary(){
        List<recipeLibrary> ReLi=RLS.getRecipeLibrary();
        return ReLi;
    }
}
