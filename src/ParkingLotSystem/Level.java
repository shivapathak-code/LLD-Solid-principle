package ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class Level {
    int floorNumber;
    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public Level(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public ParkingSpot getAvailableSpot(Vehicle vehicle)
    {
        System.out.println("Vehicle " +vehicle.vehicleType );
        for(ParkingSpot spot : parkingSpots)
        {
            System.out.println("parking spot occupied "+spot.occupied + "Type "+spot.spotType);
            if(spot.spotType.name().equalsIgnoreCase(vehicle.vehicleType.name()) && !spot.occupied)
            {
                return spot;
            }

        }
        return null;
    }
    public void addSpot(ParkingSpot spot)
    {
        parkingSpots.add(spot);
    }
    public ParkingSpot parkVehicle(Vehicle vehicle)
    {
        ParkingSpot availableSpot = getAvailableSpot(vehicle);
        availableSpot.assignVehicle(vehicle);
        return availableSpot;
    }

}
