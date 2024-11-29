package com.Recipe.RecipePedia.controllers;

import com.Recipe.RecipePedia.models.Recipes;
import com.Recipe.RecipePedia.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @GetMapping("/api/recipes")
    public ResponseEntity<List<Recipes>> getAllRecipes() {
        List<Recipes> recipes = recipeService.getAllRecipes();
        for(int i=0;i<recipes.size();i++){
            System.out.println("OAMAM"+recipes.get(i).getIngredients()+recipes.get(i).getMethodology());
        }
        return ResponseEntity.ok(recipes);
    }

    @PostMapping("/api/addlikesB")
    public void addlike(@RequestBody long postid){
        System.out.println("RECIEVED"+postid);
        recipeService.addLike(postid);
    }
    @PostMapping("/api/removelikesB")
    public void removelike(@RequestBody long postid){
        System.out.println("REMOVED"+postid);
        recipeService.removeLike(postid);
    }
}

