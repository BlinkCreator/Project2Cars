package ShowcaseAppForDifferent.Cars;

public class Cars {
 String name;
 String year;
 String model;
}

class Electric extends Cars{
    public Float engineSize;
    public Float chargingRate;
    public Float batteryCapacity;
    public String description;
}

class Hybrid extends Cars{
    public Float engineSize;
    public Float mileage;
    public Float fuelEfficiency;
    public String description;

}

class Petrol extends Cars{
    public Float engineSize;
    public Float mileage;
    public Float fuelEfficiency;
    public String description;

}