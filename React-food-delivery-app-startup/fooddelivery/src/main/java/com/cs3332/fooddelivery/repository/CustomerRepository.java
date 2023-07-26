package com.cs3332.fooddelivery.repository;

import com.cs3332.fooddelivery.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
