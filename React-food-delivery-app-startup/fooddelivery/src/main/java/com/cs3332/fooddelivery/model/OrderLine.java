package com.cs3332.fooddelivery.model;


public class OrderLine {

    private MenuItem menuItem;
    private int quantity;


	//getter
    public MenuItem getMenuItem() {
        return menuItem;
    }
    public int getQuantity() {
        return quantity;
    }

	//setter
    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
