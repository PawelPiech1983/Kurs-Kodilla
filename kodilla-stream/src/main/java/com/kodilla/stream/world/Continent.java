package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String name;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    boolean removeCountry(Country country) {
        return countryList.remove(country);
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
