package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

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
        List <Integer> listOfNumbers = List.of(1,25,23,45,89,7,12,5,67,54,89);
        List <Integer> listWithoutOddNumbers = List.of(12,54);
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(listOfNumbers);
        System.out.println("Testing list");
        //Then
        Assertions.assertEquals(result, listWithoutOddNumbers);
    }
}
