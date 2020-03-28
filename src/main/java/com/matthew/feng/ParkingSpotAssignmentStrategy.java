package com.matthew.feng;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot findAvailableSpot(VehicleEntryEvent vehicle) throws SpotNotAvailableException;
}
