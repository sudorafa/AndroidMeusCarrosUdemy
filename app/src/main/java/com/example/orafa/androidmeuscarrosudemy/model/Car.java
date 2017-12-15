package com.example.orafa.androidmeuscarrosudemy.model;

import android.graphics.drawable.Drawable;

/**
 * Created by oRafa on 11/12/2017.
 */

public class Car {
    public int id;
    public String model;
    public String manufacturer;
    public int horsePower;
    public Double price;
    public Drawable picture;

    public Car(int id, String model, String manufacturer, int horsePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.price = price;
        this.picture = picture;
    }

    public Car() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }
}
