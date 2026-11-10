package com.pluralsight;

public class Main {
    public static void main(String[] args) {
     // Test Hotel
        Hotel hotel = new Hotel("Hilton", 5, 20);

        System.out.println(hotel.getAvailableRooms()); // 20

        hotel.bookRoom();
        hotel.bookRoom();

        System.out.println(hotel.getAvailableRooms()); // 18
        System.out.println(hotel.isRoomAvailable());   // true
    }
}