package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Case when list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> listOfNumbers = new ArrayList<>();
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(listOfNumbers);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(listOfNumbers, result);
    }

    @DisplayName("Case when list is fulfill with random numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        Integer arrayOfNumbers[] = new Integer[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arrayOfNumbers[i] = random.nextInt(50);

            //OLD CODE FROM PREVIOUS EXAMPLE
            //listOfNumbers.add(random.nextInt(50));
            //listOfNumbers.add(i);
            //END OLD CODE
        }
        List<Integer> listOfNumbers = Arrays.asList(arrayOfNumbers);
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(listOfNumbers);
        System.out.println("Testing list");
        //Then
        Assertions.assertNotEquals(listOfNumbers, result);
    }
}
