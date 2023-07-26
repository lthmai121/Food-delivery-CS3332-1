package com.cs3332.fooddelivery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// import java.util.List;

@Document(collection = "users")
public class user {
    @Id
    private String id;
    private String name;
    private String phoneNumber;

    private String email;
    private String password;
    
    private String type;

    // Getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getphoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getType() { 
        return type;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setType(String type) { 
        this.type = type;
    }
    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

