package com.Recipe.RecipePedia.controllers;

import com.Recipe.RecipePedia.models.*;
import com.Recipe.RecipePedia.services.RecipeAdderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RecipeAdderController {
    @Autowired
    private RecipeAdderService recipesService;

    @PostMapping("/api/addrecipe")
    public RecipeAdder addRecipe(@RequestBody RecipeAdder newRecipe) {
        System.out.println("Received Recipe: Name = " + newRecipe.getName() +
        ", Ingredients = " + newRecipe.getIngredients() +
        ", Methodology = " + newRecipe.getMethodology() +
        ", Estimated Calories = " + newRecipe.getEstimatedCalories() +
        ", Popular Meals = " + newRecipe.getPopularMeals() +
        ", Popular Regions = " + newRecipe.getPopularRegions() +
        ", Image URL = " + newRecipe.getImageUrl() +
        ", Likes = " + newRecipe.getLikes());
        return recipesService.addRecipe(newRecipe);
}

}


