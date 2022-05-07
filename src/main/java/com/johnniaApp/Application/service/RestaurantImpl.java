package com.johnniaApp.Application.service;

import com.johnniaApp.Application.model.Restaurant;
import com.johnniaApp.Application.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
@Service
public class RestaurantImpl implements RestaurantService{
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
    @Override
    public Restaurant getRestaurant(Integer id){
        return restaurantRepository.findById(id).get();
    }

    @Override
    public void updateRestaurant(Integer id, Restaurant restaurant) {
        Restaurant restaurantFromDb = restaurantRepository.findById(id).get();
        System.out.println(restaurantFromDb.toString());
        restaurantFromDb.setApplicant(restaurant.getApplicant());
        restaurantFromDb.setAddress(restaurant.getAddress());
        restaurantFromDb.setFoodItems(restaurant.getFoodItems());
        restaurantRepository.save(restaurantFromDb);
    }

    @Override
    public void deleteRestaurant(Integer id){
        restaurantRepository.deleteById(id);
    }
}
