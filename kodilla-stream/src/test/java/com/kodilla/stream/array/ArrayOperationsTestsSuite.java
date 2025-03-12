package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestsSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //When
        OptionalDouble average = ArrayOperations.getAverage(numbers);

        //Then
        OptionalDouble exopectedAverage =  OptionalDouble.of(5.5);
        assertEquals(exopectedAverage, average);

    }
}
