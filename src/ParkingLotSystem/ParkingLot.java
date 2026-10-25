package ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<Level> levels = new ArrayList<>();
    public void addLevels(Level level)
    {
        levels.add(level);
    }
    public void freeSpot(ParkingSpot spot)
    {
        spot.occupied = false;
        spot.vehicle = null;
    }
    public ParkingSpot findParkingSpot(Vehicle vehicle){
        ParkingSpot availableSpot = null;
        for(Level level : levels)
        {
            availableSpot = level.getAvailableSpot(vehicle);
            if(availableSpot != null)
            {
                return availableSpot;
            }
        }
        if(availableSpot ==  null)
        {
            try {
                throw new Exception("Parking is full....");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return availableSpot;
    }
    public void unParkVehicle(Ticket ticket)
    {
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.removeVehicle(ticket.vehicle);
    }
    public Ticket parkVehicle(Vehicle vehicle){
        ParkingSpot availableSpot = findParkingSpot(vehicle);
        availableSpot.assignVehicle(vehicle);
        return new Ticket(vehicle , availableSpot);

    }
}
