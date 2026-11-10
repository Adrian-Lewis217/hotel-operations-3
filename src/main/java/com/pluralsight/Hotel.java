package com.pluralsight;

import java.time.LocalDate;

public class Hotel {
    // properties
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;

    private int bookedSuites;
    private int bookedRooms;

    // constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public boolean isRoomAvailable() {
        return bookedRooms < numberOfRooms;
    }

    public boolean isSuiteAvailable() {
        return bookedSuites < numberOfSuites;
    }

    public boolean bookRoom() {
        if (isRoomAvailable()) {
            bookedRooms++;
            return true;
        }
        return false;
    }

    public boolean bookRoom(int roomCount, boolean suite){
        if (roomCount <= 0){
            return false;
        }
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                bookedSuites += roomCount;
                return true;
            }
        } else {
            if (roomCount <= getAvailableRooms()) {
                bookedRooms += roomCount;
                return true;
            }
        }

        return false;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedRooms;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }
}
