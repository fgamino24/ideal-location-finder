package com.francisco.ideallocationfinder.service;

import com.francisco.ideallocationfinder.domain.Place;
import com.francisco.ideallocationfinder.domain.PlaceScore;
import com.francisco.ideallocationfinder.domain.Weights;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RankingServiceTest {

    @Test
    void ranksHigherScoreFirst() {
        RankingService service = new RankingService();

        Place a = new Place("A", 100, 0, 0, 0, 0, 0);
        Place b = new Place("B", 0, 100, 0, 0, 0, 0);

        Weights w = new Weights();
        w.setWalkability(1.0);
        w.setTransit(0.0);
        w.setSafety(0.0);
        w.setCost(0.0);
        w.setAmenities(0.0);
        w.setAirportAccess(0.0);

        List<PlaceScore> ranked = service.rank(List.of(a, b), w);
        assertEquals("A", ranked.get(0).getPlace().getName());
    }
}