package com.Recipe.RecipePedia.models;
import jakarta.persistence.*;
@Entity
public class Comments{
    @Id
    private int id;
    private int like_count;
    private String comment_content;

    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public void setlikecount(int like_count){
        this.like_count=like_count;
    }
    public int getlike_count(){
        return like_count;
    }
    public void setcomment_content(String commentString){
        this.comment_content=commentString;
    }
    public String getcomment_content(){
        return comment_content;
    }
}
