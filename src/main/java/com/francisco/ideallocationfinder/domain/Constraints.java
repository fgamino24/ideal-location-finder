package com.francisco.ideallocationfinder.domain;

public class Constraints {

    private double minWalkability;
    private double minTransit;
    private double minSafety;
    private double minCost;
    private double minAmenities;
    private double minAirportAccess;

    public double getMinWalkability() { return minWalkability; }
    public void setMinWalkability(double minWalkability) { this.minWalkability = minWalkability; }

    public double getMinTransit() { return minTransit; }
    public void setMinTransit(double minTransit) { this.minTransit = minTransit; }

    public double getMinSafety() { return minSafety; }
    public void setMinSafety(double minSafety) { this.minSafety = minSafety; }

    public double getMinCost() { return minCost; }
    public void setMinCost(double minCost) { this.minCost = minCost; }

    public double getMinAmenities() { return minAmenities; }
    public void setMinAmenities(double minAmenities) { this.minAmenities = minAmenities; }

    public double getMinAirportAccess() { return minAirportAccess; }
    public void setMinAirportAccess(double minAirportAccess) { this.minAirportAccess = minAirportAccess; }
}