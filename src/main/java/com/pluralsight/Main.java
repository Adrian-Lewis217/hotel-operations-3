package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test Employee class
        Employee employee = new Employee(1, "John Doe", "IT", 25.00, 45.00);
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Department: " + employee.getDepartment());
        System.out.println("Employee Pay Rate: " + employee.getPayRate());
        System.out.println("Employee Hours Worked: " + employee.getHoursWorked());
        System.out.println("Employee Total Pay: " + employee.getTotalPay());
        System.out.println("Employee Regular Hours: " + employee.getRegularHours());
        System.out.println("Employee Overtime Hours: " + employee.getOvertimeHours());

        employee.punchIn(10.00);    // 10:00 AM
        employee.punchOut(14.00);  // 2:00 PM

        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Total Pay: " + employee.getTotalPay());
        System.out.println("=======================================================================");

        // Test Room class
        Room room = new Room(2, 99.99);
        System.out.println("Number of Beds: " + room.getNumberOfBeds());
        System.out.println("Price: " + room.getPrice());
        System.out.println("Is Occupied: " + room.isOccupied());
        System.out.println("Is Dirty: " + room.isDirty());
        System.out.println("Is Available: " + room.isAvailable());

        // Test Room methods
        System.out.println("\n--- Guest Checks In ---");
        room.checkIn();
        System.out.println("Is Occupied: " + room.isOccupied());
        System.out.println("Is Dirty: " + room.isDirty());
        System.out.println("Is Available: " + room.isAvailable());

        System.out.println("\n--- Guest Checks Out ---");
        room.checkOut();
        System.out.println("Is Occupied: " + room.isOccupied());
        System.out.println("Is Dirty: " + room.isDirty());
        System.out.println("Is Available: " + room.isAvailable());

        System.out.println("\n--- Room Cleaned ---");
        room.cleanRoom();
        System.out.println("Is Occupied: " + room.isOccupied());
        System.out.println("Is Dirty: " + room.isDirty());
        System.out.println("Is Available: " + room.isAvailable());
    }
}