package DesignPattern.FactoryDesign;

import java.util.Locale;

// that is factory design pattern in this pattern this is work as middlware
// b/w cilent and showroom and also loss coupling un that design pattern
// that is called factory design pattern;

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
