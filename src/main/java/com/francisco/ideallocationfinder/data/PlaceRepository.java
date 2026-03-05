package com.francisco.ideallocationfinder.data;

import com.francisco.ideallocationfinder.domain.Place;

import java.util.List;

public class PlaceRepository {
    public static List<Place> getPlaces() {

        return List.of(
                new Place("Logan Square", 90, 80, 70, 40, 85, 50),
                new Place("Pilsen", 88, 75, 60, 60, 80, 50),
                new Place("Oak Park", 85, 85, 85, 30, 75, 45),
                new Place("Downers Grove", 70, 60, 90, 55, 60, 40),
                new Place("Arlington Heights", 65, 65, 88, 50, 55, 35)
        );
    }
}
