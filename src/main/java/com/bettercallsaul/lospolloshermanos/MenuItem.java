package com.bettercallsaul.lospolloshermanos;

public class MenuItem {

    private String itemName;
    private String description;
    private int price;

    public MenuItem(String itemName, String description, int price) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RestaurantMenuItem{" +
                "itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
