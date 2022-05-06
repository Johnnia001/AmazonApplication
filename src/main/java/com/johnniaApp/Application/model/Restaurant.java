package com.johnniaApp.Application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Restaurant {
    // primary key
    @Id
    //auto inclement id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Applicant;
    private String Address;
    private String FoodItems;

    // constructor
    public Restaurant() {
    }


    // getter setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApplicant() {
        return Name;
    }

    public void setApplicant(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFoodItems() {
        return FoodItems;
    }

    public void setFoodItems(String foodItems) {
        FoodItems = foodItems;
    }
}
