package com.cs3332.fooddelivery.controller;

import com.cs3332.fooddelivery.model.Customer;
import com.cs3332.fooddelivery.model.user;
import com.cs3332.fooddelivery.model.restaurant;
import com.cs3332.fooddelivery.service.RestaurantService;
import com.cs3332.fooddelivery.service.UserService;
import com.cs3332.fooddelivery.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public user createUser(@RequestBody user newUser) {
        if ("Customer".equals(newUser.getType())) {
            return customerService.createCustomer((Customer) newUser);
        } else if ("Restaurant".equals(newUser.getType())) {
            return restaurantService.createRestaurant((restaurant) newUser);
        } else {
            throw new IllegalArgumentException("Invalid user type");
        }
    }

    @GetMapping
    public List<user> getAllUsers() {
        return userService.getAllUsers();
    }



    // Add other endpoints as needed
}
