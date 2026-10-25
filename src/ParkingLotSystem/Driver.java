package ParkingLotSystem;

import static java.lang.System.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = new ParkingLot();
        Level level = new Level(1);

        level.addSpot(new ParkingSpot(101, SpotType.BIKE));
        level.addSpot(new ParkingSpot(102, SpotType.CAR));
        level.addSpot(new ParkingSpot(103, SpotType.TRUCK));

        parkingLot.addLevels(level);

        Vehicle Bike = new Bike("UP95CC2223");
        Vehicle car = new Bike("UP95CC2224");
        Vehicle Truck = new Bike("UP95CC2225");

        out.println("========== Parking Vehicle==========");
        Ticket t1 = parkingLot.parkVehicle(Bike);
        out.println("Bike parked : Ticket ID " + t1.getId() + " " + t1.getParkingSpot().getId());

       Ticket t2 = parkingLot.parkVehicle(car);
       out.println("Car parked : Ticket ID " + t2.getId() + " " +t2.getParkingSpot().getId());
    }

}
