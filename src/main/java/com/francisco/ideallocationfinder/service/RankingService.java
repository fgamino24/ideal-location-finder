package com.francisco.ideallocationfinder.service;

import com.francisco.ideallocationfinder.domain.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RankingService {
    public List<PlaceScore> rank(List<Place> places, Weights weights) {

        List<PlaceScore> results = new ArrayList<>();

        for (Place p : places) {

            double score =
                    p.getWalkability() * weights.getWalkability() +
                            p.getTransit() * weights.getTransit() +
                            p.getSafety() * weights.getSafety() +
                            p.getCost() * weights.getCost() +
                            p.getAmenities() * weights.getAmenities() +
                            p.getAirportAccess() * weights.getAirportAccess();

            results.add(new PlaceScore(p, score));
        }

        results.sort(Comparator.comparingDouble(PlaceScore::getScore).reversed());

        return results;
    }
}
