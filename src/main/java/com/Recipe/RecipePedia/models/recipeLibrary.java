package com.Recipe.RecipePedia.models;

import jakarta.persistence.*;

@Entity
@Table(name = "recipelibrary")
public class recipeLibrary{

    @Id
    private int id;
    private String imageUrl;  
    private String cook;
    private int upload;
    private String name;
    
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
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
