package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public static boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Midway", true);

        if (flights.containsKey(flight.getArrivalAirport())) {
            return flights.get(flight.getArrivalAirport());
        }
        else {
            throw new RouteNotFoundException();
        }
    }
}
