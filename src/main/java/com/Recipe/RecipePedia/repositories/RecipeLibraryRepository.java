package com.Recipe.RecipePedia.repositories;
import com.Recipe.RecipePedia.models.recipeLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeLibraryRepository extends JpaRepository<recipeLibrary,Integer> {
}
