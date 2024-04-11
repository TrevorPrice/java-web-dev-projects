package org.launchcode;

import java.util.ArrayList;

public class MenuItem {
    //Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private double price;
    private String description;
    private String category;
    private boolean newItem = false;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

}
