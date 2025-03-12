package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    boolean removeContinent(Continent continent) {
        return continentList.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
