package com.cs3332.fooddelivery.model;

import java.util.List;

public class Menu {
	
    private List<MenuItem> items;

    // Getter
    public List<MenuItem> getItems() {
        return items;
    }

    // Setter
    public void setItems(List<MenuItem> items) {
        this.items = items;
    }
}
