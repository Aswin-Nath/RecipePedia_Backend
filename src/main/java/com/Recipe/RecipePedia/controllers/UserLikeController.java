package com.Recipe.RecipePedia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Recipe.RecipePedia.services.*;
import java.util.*;
import com.Recipe.RecipePedia.models.*;

@RestController
public class UserLikeController {
    @Autowired
    private UserLikeService ULS;

    @GetMapping("/api/getlikes")
    public List<UserLike> getlikes() {
        return ULS.getLikes();
    }

    @PostMapping("/api/addlikes")
    public void addLikes(@RequestBody List<UserLike> likes) {
        // System.out.println.("OMMA"+likes);
        ULS.addLikes(likes);
    }

    @PostMapping("/api/removelikes")
    public void removeLikes(@RequestBody List<UserLike> likes) {
        ULS.removeLikes(likes);
    }
}
