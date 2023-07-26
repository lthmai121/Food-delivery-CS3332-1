package com.cs3332.fooddelivery.model;

import java.util.List;

import jakarta.persistence.Id;

public class Customer extends user {
    @Id
	private String customerid;
	private String address;

	private List<String> orderHistory;
    private String preferredPaymentMethod;

    //Getter
	public String getcustomerid() {
		return customerid;
	}
	public String getAddress() {
        return address;
    }
    public List<String> getOrderHistory() {
        return orderHistory;
    }
    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

	//Setter
	public void setcustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String setAddress(String newAddress) {
        this.address = newAddress;
        return address;
    }
    public void setOrderHistory(List<String> orderHistory) {
        this.orderHistory = orderHistory;
    }
    public void setPreferredPaymentMethod(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }
}
