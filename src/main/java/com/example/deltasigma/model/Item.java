package com.example.deltasigma.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Item {

    private int id;

    @NotBlank(message = "Item name is required")
    private String name;

    private String description;

    @Min(value = 1, message = "Price must be greater than 0")
    private double price;

    public Item() {
    }

    public Item(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
