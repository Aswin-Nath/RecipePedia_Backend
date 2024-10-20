package com.Recipe.RecipePedia.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Recipes")
public class Recipes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @Column(name = "popular_meals")
    private String popularMeals;
    
    @Column(name = "popular_regions")
    private String popularRegions;
    
    @Column(name = "estimated_calories")
    private Integer estimatedCalories; 

    private String ingredients;
    private String methodology;

    @Column(name = "image_url")
    private String imageUrl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getEstimatedCalories() {
        return estimatedCalories;
    }

    public void setEstimatedCalories(Integer estimatedCalories) {
        this.estimatedCalories = estimatedCalories;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
