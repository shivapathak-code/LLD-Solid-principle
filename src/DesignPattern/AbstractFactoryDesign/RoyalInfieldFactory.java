package DesignPattern.AbstractFactoryDesign;

public class RoyalInfieldFactory implements BikeBrandfactory{
    @Override
    public Bike getStanderBike() {
        return new Bullet();
    }

    @Override
    public Bike getRacingBike() {
        return new Himaylan();
    }
}
