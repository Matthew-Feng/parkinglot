package com.matthew.feng;

public interface BillService {
    void startBilling(VehicleEntryEvent vehicleEntryEvent);

    ParkingBill calculateBill(VehicleExitEvent vehicleExitEvent);
}
