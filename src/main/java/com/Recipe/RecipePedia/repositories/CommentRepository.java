package com.Recipe.RecipePedia.repositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Recipe.RecipePedia.models.Comments;
@Repository
public interface CommentRepository extends JpaRepository<Comments,Integer> {
    
}