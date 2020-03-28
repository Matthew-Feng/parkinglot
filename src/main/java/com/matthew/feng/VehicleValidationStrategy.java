package com.matthew.feng;

public interface VehicleValidationStrategy {
    void validate(VehicleEntryEvent vehicle) throws IllegitimateVehicleException;
}
