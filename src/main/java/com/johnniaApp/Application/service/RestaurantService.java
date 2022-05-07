package com.johnniaApp.Application.service;

import com.johnniaApp.Application.model.Restaurant;
import com.johnniaApp.Application.repository.RestaurantRepository;

import java.util.List;

// write service to save data
public interface RestaurantService {
    public Restaurant saveRestaurant(Restaurant restaurant);
    public List<Restaurant> getAllRestaurants();
    public Restaurant getRestaurant(Integer id);

    void updateRestaurant(Integer id, Restaurant restaurant);

    void deleteRestaurant(Integer RestaurantId);


}
