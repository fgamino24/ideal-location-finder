package com.francisco.ideallocationfinder.web;

import com.francisco.ideallocationfinder.data.PlaceRepository;
import com.francisco.ideallocationfinder.domain.Place;
import com.francisco.ideallocationfinder.domain.PlaceScore;
import com.francisco.ideallocationfinder.domain.Weights;
import com.francisco.ideallocationfinder.service.RankingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RankingController {
    private final RankingService rankingService;

    public RankingController(RankingService rankingService) {
        this.rankingService = rankingService;
    }

    @GetMapping("/")
    public String home(Model model) {
        // sensible defaults
        Weights weights = new Weights();
        weights.setWalkability(0.25);
        weights.setTransit(0.15);
        weights.setSafety(0.20);
        weights.setCost(0.20);
        weights.setAmenities(0.10);
        weights.setAirportAccess(0.10);

        model.addAttribute("weights", weights);
        return "home";
    }

    @PostMapping("/rank")
    public String rank(@ModelAttribute Weights weights, Model model) {
        // normalize weights so they sum to 1 (so users can type anything)
        normalize(weights);

        List<Place> places = PlaceRepository.getPlaces();
        List<PlaceScore> ranked = rankingService.rank(places, weights);

        model.addAttribute("weights", weights);
        model.addAttribute("ranked", ranked);
        return "results";
    }

    private void normalize(Weights w) {
        double sum = w.getWalkability() + w.getTransit() + w.getSafety()
                + w.getCost() + w.getAmenities() + w.getAirportAccess();

        if (sum <= 0.0000001) {
            // fallback to equal weights
            w.setWalkability(1.0/6);
            w.setTransit(1.0/6);
            w.setSafety(1.0/6);
            w.setCost(1.0/6);
            w.setAmenities(1.0/6);
            w.setAirportAccess(1.0/6);
            return;
        }

        w.setWalkability(w.getWalkability() / sum);
        w.setTransit(w.getTransit() / sum);
        w.setSafety(w.getSafety() / sum);
        w.setCost(w.getCost() / sum);
        w.setAmenities(w.getAmenities() / sum);
        w.setAirportAccess(w.getAirportAccess() / sum);
    }
}
