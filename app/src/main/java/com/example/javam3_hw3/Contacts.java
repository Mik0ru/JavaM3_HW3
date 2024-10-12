package com.example.javam3_hw3;

public class Contacts {
    private String name;
    private String Num;

    public Contacts( String name, String Num) {
        this.Num = Num;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        this.Num = num;
    }
}
