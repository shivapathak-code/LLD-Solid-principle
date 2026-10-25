package DesignPattern.AbstractFactoryDesign;

public class KTMFactory implements BikeBrandfactory{
    @Override
    public Bike getStanderBike() {
        return new Duke();
    }

    @Override
    public Bike getRacingBike() {
        return new RC();
    }
}
