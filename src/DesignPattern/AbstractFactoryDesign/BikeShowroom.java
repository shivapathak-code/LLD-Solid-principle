package DesignPattern.AbstractFactoryDesign;

public class BikeShowroom {
    public static void main(String[] args)
    {
        BikeBrandfactory factory = BikeFactoryProducer.getfactory("KTM");
        Bike standerBike = factory.getStanderBike();
        Bike racingBike = factory.getRacingBike();
        standerBike.start();
        racingBike.start();
    }
}