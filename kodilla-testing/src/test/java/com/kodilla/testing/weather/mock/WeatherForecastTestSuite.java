package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private static int counter = 0;
    Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeAll
    public static void atTheBieginningOfTests() {
        System.out.println("Starting test suite for weather forecast.");
    }

    @AfterAll
    public static void atTheEndOfTests() {
        System.out.println("All tests finished.");
    }

    @BeforeEach
    public void beforeEachTest() {
        counter++;
        System.out.println("Starting test #" + counter);
    }

    @Mock
    private Temperatures temperaturesMock;

    @DisplayName("Testing methode: calculateForecast")
    @Test
    void testCalculateForecastWithMock() {
        //Given
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        System.out.println("Size of temperatursMap is equal: " + temperaturesMap.size());

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Testing methode: calculateForecastAverage")
    @Test
    void testCalculateForecastAverage() {
        //Given
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);
        double average = 25.56;
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double AverageTemeprature = weatherForecast.calculateForecastAverage();
        System.out.println("Size of temperatursMap is equal: " + temperaturesMap.size());

        //Then
        Assertions.assertEquals(average, AverageTemeprature);
    }

    @DisplayName("Testing methode: calculateForecastMedian")
    @Test
    void testCalculateForecastMedian() {
        //Given
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);
        double median = 25.5;
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemeprature = weatherForecast.calculateForecastMedian();
        System.out.println("Size of temperatursMap is equal: " + temperaturesMap.size());
        //Then
        Assertions.assertEquals(median, medianTemeprature);
    }
}
