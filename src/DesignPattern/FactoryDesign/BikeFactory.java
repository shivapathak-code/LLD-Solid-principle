package DesignPattern.FactoryDesign;

import java.util.Locale;

public class BikeFactory {
    public Bike getBikeInstance(String type)
    {
        if(type == null)
        {
            return null;
        }
        switch (type.toLowerCase())
        {
            case "duke":
                return new Duke();
            case "classic":
                return new Classic350();
            case "splendor":
                return new Splender();
            default:
                throw new IllegalArgumentException("Bike not found");
        }
    }
}
