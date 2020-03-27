package com.matthew.feng;

public class ParkingSpot {
    private SpotSize spotSize;
    private int no;
    private int level;
    private Vehicle vehicle;
    private int distance;
    
    public SpotSize getSpotSize() {
        return spotSize;
    }

    public void setSpotSize(SpotSize spotSize) {
        this.spotSize = spotSize;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void vacate(){
        this.vehicle = vehicle;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

}
