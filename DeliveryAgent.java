package com.swiggy.delivery;

public class DeliveryAgent extends Delivery {
    private String agentName;
    private String vehicleType;

    public DeliveryAgent(String agentName, String vehicleType) {
        this.agentName = agentName;
        this.vehicleType = vehicleType;
    }

    @Override
    public void assignDeliveryPerson(String name) {
        System.out.println("🚚 Delivery Assigned: " + agentName + " (" + vehicleType + ")");
    }

    @Override
    public void startDelivery() {
        System.out.println("Delivery Started...");
    }

    @Override
    public void completeDelivery() {
        System.out.println("Delivery Completed!");
    }
}
