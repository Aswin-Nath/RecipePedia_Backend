package com.Recipe.RecipePedia.controllers;

import com.Recipe.RecipePedia.models.Comments;
import com.Recipe.RecipePedia.services.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @GetMapping("/api/comments")
    public List<Comments> getAllCommentsController() {
        return commentsService.getAllComments();
    }
}
