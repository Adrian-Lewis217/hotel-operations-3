package com.pluralsight;

import java.time.LocalDate;

public class Hotel {
    // properties
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;

    private int bookedSuites;
    private int bookedRooms;
    private LocalDate reservationDate;

    // constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
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

    public void bookRoom() {
        if (isRoomAvailable()) {
            bookedRooms++;
        }
    }

    public void bookSuite() {
        if (isSuiteAvailable()) {
            bookedSuites++;
        }
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedRooms;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public boolean isAvailableToday(LocalDate reservationDate) {
        return reservationDate.equals(LocalDate.now())
                && bookedRooms < numberOfRooms;
    }
}
