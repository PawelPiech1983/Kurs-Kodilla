package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResults = new HashMap<>();

        //Dummy data
        stubResults.put("Rzeszów", 25.5);
        stubResults.put("Kraków", 26.2);
        stubResults.put("Wrocław", 24.8);
        stubResults.put("Warszawa", 25.2);
        stubResults.put("Gdańsk", 26.1);

        return stubResults;
    }
}
