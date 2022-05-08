package com.johnniaApp.Application.model;

import javax.persistence.*;

@Entity
public class Restaurant {
    // primary key
    @Id
    //auto inclement id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Applicant;
    private String Address;
    @Column(length = 500)
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
        return Applicant;
    }

    public void setApplicant(String applicant) {
        Applicant = applicant;
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
