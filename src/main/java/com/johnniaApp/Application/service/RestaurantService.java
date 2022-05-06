package com.johnniaApp.Application.service;

import com.johnniaApp.Application.model.Restaurant;

import java.util.List;

// write service to save data
public interface RestaurantService {
    public Restaurant saveRestaurant(Restaurant restaurant);
    public List<Restaurant> getAllRestaurants();
}
