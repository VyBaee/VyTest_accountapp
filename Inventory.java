package org.example.accountdemo;

public class Inventory {
    private String title;
    private String description;
    private int quantity;

    public Inventory(String title, String description, int quantity) {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}
