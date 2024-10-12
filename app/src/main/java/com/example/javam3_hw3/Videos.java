package com.example.javam3_hw3;

public class Videos {
    private String name;
    private String image;
    private String disc;

    public Videos(String image,String name,String disc) {
        this.image = image;
        this.disc = disc;
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

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }
}
