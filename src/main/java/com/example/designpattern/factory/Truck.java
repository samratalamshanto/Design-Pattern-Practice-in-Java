package com.example.designpattern.factory;

public class Truck implements VehicleFactoryInterface{

    @Override
    public void drive() {
        System.out.println("Drives Truck.");
    }
}
