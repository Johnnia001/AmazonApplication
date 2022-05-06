package com.johnniaApp.Application.controller;

import com.johnniaApp.Application.model.Restaurant;
import com.johnniaApp.Application.service.RestaurantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//get response body
@RestController
// path
@RequestMapping("/restaurant")

public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    // save data into database
    @PostMapping("/add")
    public String add(@RequestBody Restaurant restaurant){
        restaurantService.saveRestaurant(restaurant);
        return "New Food Truck is added";
    }

    @GetMapping("/getAll")
    public List<Restaurant> list(){
        return restaurantService.getAllRestaurants();
    }
}
