package com.swiggy.app;

import com.swiggy.order.*;
import com.swiggy.delivery.*;

public class SwiggyAppDemo {
    public static void main(String[] args) {

        FoodOrder food = new FoodOrder(101, "Neha", 500.0, "Domino’s", "Margherita Pizza");
        food.placeOrder();
        food.displayOrderDetails();

        DeliveryAgent agent1 = new DeliveryAgent("Rajesh", "Bike");
        agent1.assignDeliveryPerson("Rajesh");
        agent1.startDelivery();
        agent1.completeDelivery();

        System.out.println();

        GroceryOrder grocery = new GroceryOrder(102, "Ramesh", 300.0, "D-Mart", "Vegetables");
        grocery.placeOrder();
        grocery.displayOrderDetails();

        DeliveryAgent agent2 = new DeliveryAgent("Anita", "Scooter");
        agent2.assignDeliveryPerson("Anita");
        agent2.startDelivery();
        agent2.completeDelivery();
    }
}
