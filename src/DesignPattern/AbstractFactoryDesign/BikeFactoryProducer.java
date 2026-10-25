package DesignPattern.AbstractFactoryDesign;

public class BikeFactoryProducer {
    public static BikeBrandfactory getfactory(String brand)
    {
        if(brand.equalsIgnoreCase("KTM"))
        {
            return new KTMFactory();
        }
        else if(brand.equalsIgnoreCase("royalinfield"))

        {
            return new RoyalInfieldFactory();
        }
        else
        {
            throw new IllegalArgumentException("Brand not found");
        }
    }
}
