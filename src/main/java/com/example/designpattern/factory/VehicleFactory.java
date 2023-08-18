package com.example.designpattern.factory;

//todo: factory design pattern-->
// the factory doesn't need to know or care about the specific classes of objects that are being created,
// as long as they implement the IVehicle interface.
public class VehicleFactory {
    public VehicleFactoryInterface getVehicleType(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("bus")) {
            return new Bus();
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            return new Truck();
        } else {
            return null;
        }
    }
}
