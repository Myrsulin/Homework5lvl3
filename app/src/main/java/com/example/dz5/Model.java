package com.example.dz5;

public class Model {
    private int photo;
    private String country;
    private int id;

    public Model(int photo, String country) {
        this.photo = photo;
        this.country = country;
    }

    public Model(int photo, String country, int id) {
        this.photo = photo;
        this.country = country;
        this.id = id;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
