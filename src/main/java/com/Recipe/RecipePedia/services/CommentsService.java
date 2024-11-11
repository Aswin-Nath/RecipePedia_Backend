package com.Recipe.RecipePedia.services;

import com.Recipe.RecipePedia.models.Comments;
import com.Recipe.RecipePedia.repositories.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {

    @Autowired
    private CommentRepository commentsRepository;

    public List<Comments> getAllComments() {
        return commentsRepository.findAll();
    }
}
