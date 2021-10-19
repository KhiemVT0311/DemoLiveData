package com.eup.livedataviewmodeldemo.model;

import java.util.PrimitiveIterator;

public class User {
    private int imgAvata;
    private String name;
    private String title;

    public User(int imgAvata, String name, String title) {
        this.imgAvata = imgAvata;
        this.name = name;
        this.title = title;
    }

    public int getImgAvata() {
        return imgAvata;
    }

    public void setImgAvata(int imgAvata) {
        this.imgAvata = imgAvata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
