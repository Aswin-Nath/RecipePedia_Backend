package com.Recipe.RecipePedia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
import com.Recipe.RecipePedia.models.*;
import com.Recipe.RecipePedia.repositories.*;

@Service
public class UserLikeService {

    @Autowired
    private UserJavaRepository userJavaRepo;

    public List<UserLike> getLikes() {
        return userJavaRepo.findAll();
    }

    public void addLikes(List<UserLike> likes) {
        // System.out.println("LIKED " + likes);
        userJavaRepo.saveAll(likes);
    }

    @Transactional 
    public void removeLikes(List<UserLike> likes) {
        // System.out.println("REMOVED " + likes);
        likes.forEach(like -> 
            userJavaRepo.deleteByPostidAndUserid(like.getpostid(), like.getuserid())
        );
    }
}