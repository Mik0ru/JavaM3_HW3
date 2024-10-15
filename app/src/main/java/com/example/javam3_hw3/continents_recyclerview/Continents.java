package com.example.javam3_hw3.continents_recyclerview;

import com.example.javam3_hw3.cities_recyclerview.Cities;

public class Continents  {
    private String name;
    private String image;

    public Continents(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
