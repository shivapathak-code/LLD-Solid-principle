package DesignPattern.FactoryDesign;

public class ShowRoom {
    public static void main(String[] args)
    {
        BikeFactory bikeFactory = new BikeFactory();

        Bike duke = bikeFactory.getBikeInstance("duke");

        Bike splendor = bikeFactory.getBikeInstance("splendor");

        Bike classic350 = bikeFactory.getBikeInstance("classic");

        duke.start();
        splendor.start();
        classic350.start();
    }
}
