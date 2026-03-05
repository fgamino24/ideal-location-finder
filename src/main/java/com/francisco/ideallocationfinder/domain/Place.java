package com.francisco.ideallocationfinder.domain;

public class Place {
    private String name;
    private double walkability;
    private double transit;
    private double safety;
    private double cost;
    private double amenities;
    private double airportAccess;

    public Place(String name,
                 double walkability,
                 double transit,
                 double safety,
                 double cost,
                 double amenities,
                 double airportAccess) {

        this.name = name;
        this.walkability = walkability;
        this.transit = transit;
        this.safety = safety;
        this.cost = cost;
        this.amenities = amenities;
        this.airportAccess = airportAccess;
    }

    public String getName() { return name; }
    public double getWalkability() { return walkability; }
    public double getTransit() { return transit; }
    public double getSafety() { return safety; }
    public double getCost() { return cost; }
    public double getAmenities() { return amenities; }
    public double getAirportAccess() { return airportAccess; }
}
