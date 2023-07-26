package com.cs3332.fooddelivery.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "restaurants")
public class restaurant extends user {
    @Id
    private String restaurantId;
    private String restaurantname;
    private String address;
    private String restaurantphoneNumber;
    private List<MenuItem> menu;

   
	// Getters
    public String getrestaurantId() {
        return restaurantId;
    }

    public String getrestaurantName() {
        return restaurantname;
    }

    public String getrestaurantAddress() {
        return address;
    }
    
    public String getrestaurantPhoneNumber() {
        return restaurantphoneNumber;
    }
    public List<MenuItem> getMenu() {
        return menu;
    }
    

	// Setters

    public String setrestaurantId(String newid) {
        this.restaurantId = newid;
        return restaurantId;
    }
    public String setrestaurantName(String newName) {
        this.restaurantname = newName;
        return restaurantname;
}
    public String setrestaurantAddress(String newAddress) {
        this.address = newAddress;
        return address;
    }


    public String setrestaurantPhoneNumber(String newPhoneNumber) {
        this.restaurantphoneNumber = newPhoneNumber;
        return restaurantphoneNumber;
    }
    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
    
}