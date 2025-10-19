package com.swiggy.order;

public class Order {
    protected int orderId;
    protected String customerName;
    protected double amount;

    public Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: ₹" + calculateBill() + " (GST included)");
    }

    public double calculateBill() {
        return amount + (amount * 0.05); // 5% GST
    }
}

