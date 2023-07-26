package com.cs3332.fooddelivery.repository;


import com.cs3332.fooddelivery.model.restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<restaurant, String> {
}
