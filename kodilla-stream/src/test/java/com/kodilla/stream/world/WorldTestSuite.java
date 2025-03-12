package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Polska", new BigDecimal("333444555666777"));
        Country country2 = new Country("USA", new BigDecimal("333444555666777"));
        Country country3 = new Country("Japan", new BigDecimal("333444555666777"));

        Continent continent = new Continent("Europe");
        Continent continent2 = new Continent("America");
        Continent continent3 = new Continent("Asia");
        continent.addCountry(country1);
        continent2.addCountry(country2);
        continent3.addCountry(country3);

        World wholeWorld = new World();
        wholeWorld.addContinent(continent);
        wholeWorld.addContinent(continent2);
        wholeWorld.addContinent(continent3);

        //When
        BigDecimal peopleQuantity = wholeWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("1000333667000331");
        assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
