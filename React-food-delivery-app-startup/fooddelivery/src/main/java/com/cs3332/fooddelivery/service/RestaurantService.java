package com.cs3332.fooddelivery.service;

import com.cs3332.fooddelivery.model.restaurant;
import com.cs3332.fooddelivery.repository.RestaurantRepository;
import com.cs3332.fooddelivery.model.MenuItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
	//About Restaurant

    private RestaurantRepository restaurantRepository;

    public List<restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public restaurant getRestaurantById(String restaurantId) {
        return restaurantRepository.findById(restaurantId).orElse(null);
    }

    public restaurant createRestaurant(restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public restaurant updateRestaurant(String setrestaurantId, restaurant restaurant) {
        restaurant.setrestaurantId(setrestaurantId);
        return restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(String id) {
        restaurantRepository.deleteById(id);
    }

	public restaurant updateRestaurantInfo(String restaurantId, String newName, String newAddress, String newPhoneNumber) {
        restaurant restaurant = restaurantRepository.findById(restaurantId)
            .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        restaurant.setrestaurantName(newName);
        restaurant.setrestaurantAddress(newAddress);
        restaurant.setrestaurantPhoneNumber(newPhoneNumber);
        return restaurantRepository.save(restaurant);
    }

	//About Menu
	public restaurant addMenuItem(String restaurantId, MenuItem menuItem) {
      	restaurant restaurant = restaurantRepository.findById(restaurantId)
            .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        restaurant.getMenu().add(menuItem);
        return restaurantRepository.save(restaurant);
    }

    public restaurant removeMenuItem(String restaurantId, MenuItem menuItem) {
        restaurant restaurant = restaurantRepository.findById(restaurantId)
            .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        restaurant.getMenu().remove(menuItem);
        return restaurantRepository.save(restaurant);
    }

    public restaurant updateMenuItem(String restaurantId, MenuItem oldItem, MenuItem newItem) {
        restaurant restaurant = restaurantRepository.findById(restaurantId)
            .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        int index = restaurant.getMenu().indexOf(oldItem);
        if (index != -1) {
            restaurant.getMenu().set(index, newItem);
        }
        return restaurantRepository.save(restaurant);
    }
}

