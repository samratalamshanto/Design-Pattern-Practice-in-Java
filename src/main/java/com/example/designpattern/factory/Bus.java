package com.example.designpattern.factory;

public class Bus implements VehicleFactoryInterface {
    @Override
    public void drive() {
        System.out.println("Drives Bus.");
    }
}
