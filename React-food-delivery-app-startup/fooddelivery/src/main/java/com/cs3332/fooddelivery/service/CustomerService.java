package com.cs3332.fooddelivery.service;

import com.cs3332.fooddelivery.model.Customer;
import com.cs3332.fooddelivery.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
