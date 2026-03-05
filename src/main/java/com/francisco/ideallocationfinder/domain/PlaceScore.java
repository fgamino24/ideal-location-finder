package com.francisco.ideallocationfinder.domain;

public class PlaceScore {
    private Place place;
    private double score;

    public PlaceScore(Place place, double score) {
        this.place = place;
        this.score = score;
    }

    public Place getPlace() { return place; }
    public double getScore() { return score; }
}
