package ParkingLotSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {
    int id;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;
    static int count = 0;
    public Ticket(Vehicle vehicle , ParkingSpot parkingSpot)
    {
        this.parkingSpot = parkingSpot;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }
}
