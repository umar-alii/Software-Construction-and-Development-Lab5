package com.restfulapi.arraylistapis.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int price;

    private String Name;

    private String category;

    private int quantity;


    public Product() {
    }

    public Product(int price, String name, String category, int quantity) {
        this.price = price;
        Name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
