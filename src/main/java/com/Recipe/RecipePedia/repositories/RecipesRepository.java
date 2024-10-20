package com.Recipe.RecipePedia.repositories;

import com.Recipe.RecipePedia.models.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepository extends JpaRepository<Recipes, Long> {
    // Additional custom queries can be added here if needed
}
