package com.cs3332.fooddelivery.controller;


import com.cs3332.fooddelivery.model.MenuItem;
import com.cs3332.fooddelivery.model.restaurant;
import com.cs3332.fooddelivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public restaurant getRestaurantById(@PathVariable String id) {
        return restaurantService.getRestaurantById(id);
    }

    @PostMapping
    public restaurant createRestaurant(@RequestBody restaurant restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    @PutMapping("/{id}")
    public restaurant updateRestaurant(@PathVariable String id, @RequestBody restaurant newRestaurant) {
        return restaurantService.updateRestaurantInfo(id, newRestaurant.getrestaurantName(), newRestaurant.getrestaurantAddress(), newRestaurant.getrestaurantPhoneNumber());
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable String id) {
        restaurantService.deleteRestaurant(id);
    }

    @PostMapping("/{id}/menuItems")
    public restaurant addMenuItem(@PathVariable String id, @RequestBody MenuItem menuItem) {
        return restaurantService.addMenuItem(id, menuItem);
    }

    @PutMapping("/{id}/menuItems")
    public restaurant updateMenuItem(@PathVariable String id, @RequestBody MenuItem oldItem, @RequestBody MenuItem newItem) {
        return restaurantService.updateMenuItem(id, oldItem, newItem);
    }

    @DeleteMapping("/{id}/menuItems")
    public restaurant removeMenuItem(@PathVariable String id, @RequestBody MenuItem menuItem) {
        return restaurantService.removeMenuItem(id, menuItem);
    }


    // Add more endpoints as needed
}
