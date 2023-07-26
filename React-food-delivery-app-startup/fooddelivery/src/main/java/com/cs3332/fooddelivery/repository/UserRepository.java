package com.cs3332.fooddelivery.repository;

import com.cs3332.fooddelivery.model.user;

import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;

// @Repository
public interface UserRepository extends MongoRepository<user, String> {
}

