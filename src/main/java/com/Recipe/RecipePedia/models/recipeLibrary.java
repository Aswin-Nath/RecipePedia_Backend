package com.Recipe.RecipePedia.models;

import jakarta.persistence.*;

@Entity
public class recipeLibrary{

    @Id
    @Column(name="id")
    private int id;

    @Column(name = "image_url")
    private String imageUrl;  // Using camelCase for the field

    @Column(name = "cook")
    private String cook;

    @Column(name = "upload")
    private int upload;

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {  
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {  
        this.imageUrl = imageUrl;
    }

    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }

    public int getUpload() {
        return upload;
    }

    public void setUpload(int upload) {
        this.upload = upload;
    }
}
