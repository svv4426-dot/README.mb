package com.swiggy.order;

public class FoodOrder extends Order {
    private String restaurantName;
    private String foodItem;

    public FoodOrder(int orderId, String customerName, double amount, String restaurantName, String foodItem) {
        super(orderId, customerName, amount);
        this.restaurantName = restaurantName;
        this.foodItem = foodItem;
    }

    @Override
    public void placeOrder() {
        System.out.println("Food Order Placed Successfully!");
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Item: " + foodItem);
        System.out.println("Amount: ₹" + calculateBill() + " (GST included)");
    }
}

