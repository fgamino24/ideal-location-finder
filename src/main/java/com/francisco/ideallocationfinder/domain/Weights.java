package com.francisco.ideallocationfinder.domain;

public class Weights {
    private double walkability;
    private double transit;
    private double safety;
    private double cost;
    private double amenities;
    private double airportAccess;

    public double getWalkability() { return walkability; }
    public void setWalkability(double walkability) { this.walkability = walkability; }

    public double getTransit() { return transit; }
    public void setTransit(double transit) { this.transit = transit; }

    public double getSafety() { return safety; }
    public void setSafety(double safety) { this.safety = safety; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public double getAmenities() { return amenities; }
    public void setAmenities(double amenities) { this.amenities = amenities; }

    public double getAirportAccess() { return airportAccess; }
    public void setAirportAccess(double airportAccess) { this.airportAccess = airportAccess; }
}
