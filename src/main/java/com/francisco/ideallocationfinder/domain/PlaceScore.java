package com.francisco.ideallocationfinder.domain;

public class PlaceScore {

    private Place place;

    private double walkabilityScore;
    private double transitScore;
    private double safetyScore;
    private double costScore;
    private double amenitiesScore;
    private double airportScore;

    private double totalScore;

    public PlaceScore(
            Place place,
            double walkabilityScore,
            double transitScore,
            double safetyScore,
            double costScore,
            double amenitiesScore,
            double airportScore,
            double totalScore) {

        this.place = place;
        this.walkabilityScore = walkabilityScore;
        this.transitScore = transitScore;
        this.safetyScore = safetyScore;
        this.costScore = costScore;
        this.amenitiesScore = amenitiesScore;
        this.airportScore = airportScore;
        this.totalScore = totalScore;
    }

    public Place getPlace() { return place; }

    public double getWalkabilityScore() { return walkabilityScore; }
    public double getTransitScore() { return transitScore; }
    public double getSafetyScore() { return safetyScore; }
    public double getCostScore() { return costScore; }
    public double getAmenitiesScore() { return amenitiesScore; }
    public double getAirportScore() { return airportScore; }

    public double getTotalScore() { return totalScore; }
}