package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {

        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateForecastAverage() {

        double result = 0;
        int count = 0;

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            result += temperature.getValue();
            count++;
        }
        result = result / count;
        return result;

    }

    public double calculateForecastMedian() {

        List<Double> sortedTemperatures = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(sortedTemperatures, Comparator.comparing(Double::doubleValue));
        int halfSize = temperatures.getTemperatures().size()/2;
        return sortedTemperatures.get(halfSize);
    }
}
