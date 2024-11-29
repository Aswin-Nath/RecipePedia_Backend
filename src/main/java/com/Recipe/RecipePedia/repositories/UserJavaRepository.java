package com.Recipe.RecipePedia.repositories;
import com.Recipe.RecipePedia.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserJavaRepository extends JpaRepository<UserLike,Long> {
    void deleteByPostidAndUserid(Long postid, Long userid);
}
