package com.Recipe.RecipePedia.repositories;

import com.Recipe.RecipePedia.models.Recipes;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface RecipesRepository extends JpaRepository<Recipes, Long> {

        @Modifying
        @Transactional
        @Query("UPDATE Recipes r SET r.likes = r.likes + 1 WHERE r.postid IN :postids")
        void incrementLike(@Param("postids") long postids);

        @Modifying
        @Transactional
        @Query("UPDATE Recipes r SET r.likes = r.likes - 1 WHERE r.postid IN :postids")
        void decrementLike(@Param("postids") long postids);

}
