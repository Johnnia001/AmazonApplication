package com.johnniaApp.Application.controller;

import com.johnniaApp.Application.model.Restaurant;
import com.johnniaApp.Application.service.RestaurantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.NoSuchElementException;

import java.util.List;
//get response body
@RestController
// path
@RequestMapping("/restaurant")
@CrossOrigin
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

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> get(@PathVariable Integer id) {
        try {
            Restaurant restaurant = restaurantService.getRestaurant(id);
            return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Restaurant>(HttpStatus.NOT_FOUND);
        }
    }

        @PutMapping("/{id}")
        public ResponseEntity<Restaurant> update(@RequestBody Restaurant restaurant,@PathVariable Integer id){
            try{
                Restaurant existingRestaurant=restaurantService.getRestaurant(id);
                restaurantService.saveRestaurant(restaurant);
                return new ResponseEntity<>(HttpStatus.OK);

            }catch (NoSuchElementException e){
                return new ResponseEntity<Restaurant>(HttpStatus.NOT_FOUND);
            }
        }

        @DeleteMapping("/{id}")
        public String delete(@PathVariable Integer id){
            restaurantService.deleteRestaurant(id);
            return "Deleted FoodTruck with id "+id;
        }



}
