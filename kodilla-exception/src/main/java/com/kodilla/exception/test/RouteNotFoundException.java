package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public static void main(String[] args) {
        Flight flight = new Flight("Krakau", "Katovitz");

        try {
            FlightSearch.findFlight(flight);
        }
        catch (RouteNotFoundException e) {
            System.out.println("Exception!");
        }
        finally {
            System.out.println("Finally! With or without exception!");
        }
    }
}
