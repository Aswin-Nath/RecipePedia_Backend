package com.Recipe.RecipePedia.models;

import jakarta.persistence.Id;
import jakarta.persistence.*;
@Entity
@Table(name = "recipes")
public class RecipeAdder {

    @Id
    @Column(name = "postid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postid;

    @Column(name = "name")
    private String name;

    @Column(name = "ingredients")
    private String ingredients;

    @Column(name = "methodology")
    private String methodology;

    @Column(name = "estimated_calories")
    private Integer estimatedCalories;

    @Column(name = "popular_meals")
    private String popularMeals;

    @Column(name = "popular_regions")
    private String popularRegions;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "likes")
    private Integer likes;

    // Getters and Setters

    public Long getPostid() {
        return postid;
    }

    public void setPostid(Long postid) {
        this.postid = postid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(String methodology) {
        this.methodology = methodology;
    }

    public Integer getEstimatedCalories() {
        return estimatedCalories;
    }

    public void setEstimatedCalories(Integer estimatedCalories) {
        this.estimatedCalories = estimatedCalories;
    }

    public String getPopularMeals() {
        return popularMeals;
    }

    public void setPopularMeals(String popularMeals) {
        this.popularMeals = popularMeals;
    }

    public String getPopularRegions() {
        return popularRegions;
    }

    public void setPopularRegions(String popularRegions) {
        this.popularRegions = popularRegions;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
