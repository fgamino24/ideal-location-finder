package com.francisco.ideallocationfinder.service;

import com.francisco.ideallocationfinder.domain.*;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class RankingService {
    public List<PlaceScore> rank(List<Place> places, Weights weights) {

        List<PlaceScore> results = new ArrayList<>();

        for (Place p : places) {

            double walkabilityScore = p.getWalkability() * weights.getWalkability();
            double transitScore = p.getTransit() * weights.getTransit();
            double safetyScore = p.getSafety() * weights.getSafety();
            double costScore = p.getCost() * weights.getCost();
            double amenitiesScore = p.getAmenities() * weights.getAmenities();
            double airportScore = p.getAirportAccess() * weights.getAirportAccess();

            double total =
                    walkabilityScore +
                            transitScore +
                            safetyScore +
                            costScore +
                            amenitiesScore +
                            airportScore;

            results.add(
                    new PlaceScore(
                            p,
                            walkabilityScore,
                            transitScore,
                            safetyScore,
                            costScore,
                            amenitiesScore,
                            airportScore,
                            total
                    )
            );
        }

        results.sort(Comparator.comparingDouble(PlaceScore::getTotalScore).reversed());

        return results;
    }
}
