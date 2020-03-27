package com.matthew.feng;

import java.util.List;

public class ParkingLot {
    private String name;
    private String address;
    private List<ParkingSpot> parkingSpots; // has all the parking sports
    public boolean full(){
        return false;
    }
    public boolean isOpen(){
        return true;
    }
    public  ParkingLot parkVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot  = findAvailableSpot(vehicle.getSpotSize());
        vehicle.park(parkingSpot);
        parkingSpot.parkVehicle(vehicle);
     return  null;   
    }

    private ParkingSpot findAvailableSpot(SpotSize spotSize) {
        //using specific strategy to find available parkingSpot 
        return null;
    }

    public void removeVehicle(Vehicle vehicle){
        vehicle.getParkingSpot().vacate();
        vehicle.leave();
    }
}
