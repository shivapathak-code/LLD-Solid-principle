package ParkingLotSystem;

public abstract class Vehicle {

    String vehicleNumber;
    VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType , String vehicleNumber) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }


}
