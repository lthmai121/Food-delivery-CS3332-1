package com.cs3332.fooddelivery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
public class Order {

    @Id
    private String id;
    private String userId;
    private String restaurantId;
    private List<OrderLine> orderLines;

	//getter
    public String getId() {
        return id;
    }
    public String getUserId() {
        return userId;
    }
    public String getRestaurantId() {
        return restaurantId;
    }
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

	//setter
    public void setId(String id) {
        this.id = id;
    }
	public void setUserId(String userId) {
		this.userId = userId;
    }
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

}
