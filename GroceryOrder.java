package com.swiggy.order;

public class GroceryOrder extends Order {
    private String storeName;
    private String itemCategory;

    public GroceryOrder(int orderId, String customerName, double amount, String storeName, String itemCategory) {
        super(orderId, customerName, amount);
        this.storeName = storeName;
        this.itemCategory = itemCategory;
    }

    @Override
    public void placeOrder() {
        System.out.println("Grocery Order Placed Successfully!");
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Store: " + storeName);
        System.out.println("Category: " + itemCategory);
        System.out.println("Amount: ₹" + calculateBill() + " (GST included)");
    }
}
