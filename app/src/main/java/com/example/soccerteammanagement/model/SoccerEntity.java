package com.example.soccerteammanagement.model;

import androidx.annotation.NonNull;

import java.util.UUID;

public abstract class SoccerEntity {
    private final String id;
    private String name;

    public SoccerEntity(String name){
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }


    // Getters and setters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods for subclasses
    public abstract String getCategory();

    public abstract String getSpecificDetail();

    // toString override

    @NonNull
    @Override
    public String toString() {
        return "soccerEntity: " + name + " id: " + id + " Category: " + getCategory();
    }
}
