package com.Recipe.RecipePedia.services;
import com.Recipe.RecipePedia.repositories.*;
import com.Recipe.RecipePedia.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeAdderService {
    @Autowired
    private  RecipeAdderRepo recipesRepository;

    public RecipeAdder addRecipe(RecipeAdder newRecipe) {
        newRecipe.setLikes(0); // Ensure likes is set to 0
        System.out.println("VANTEN"+newRecipe);
        return recipesRepository.save(newRecipe);
    }
}
