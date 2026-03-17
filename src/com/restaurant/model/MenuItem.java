package com.restaurant.model;

public abstract class MenuItem {
    protected String id;
    protected String name;
    protected double price;
    protected String category;

    public MenuItem(String id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract String getDescription();

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return String.format("%s - %.0f₫", name, price);
    }
}