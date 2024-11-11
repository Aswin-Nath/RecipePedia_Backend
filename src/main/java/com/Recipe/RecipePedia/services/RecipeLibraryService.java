package com.Recipe.RecipePedia.services;
import com.Recipe.RecipePedia.models.recipeLibrary;
import com.Recipe.RecipePedia.repositories.RecipeLibraryRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RecipeLibraryService {
    @Autowired
    private RecipeLibraryRepository RecipeLibraryRepo;

    public List<recipeLibrary> getRecipeLibrary(){
        return RecipeLibraryRepo.findAll();
    }
}
