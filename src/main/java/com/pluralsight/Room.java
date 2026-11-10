package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable(){
        return !isOccupied() && !isDirty();
    }

    public void checkIn(){
        occupied = true;
    }
    public void checkOut(){
        occupied = false;
        dirty = true;
    }
    public void cleanRoom(){
        if (!occupied){
            dirty = false;
        }
    }
}